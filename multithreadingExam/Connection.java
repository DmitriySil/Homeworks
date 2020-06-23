package Homework.multithreadingExam;



import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;

public class Connection implements AutoCloseable{
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private  LinkedBlockingDeque<Message> messages;
    private CopyOnWriteArraySet<Connection> connections;
    private int count;
    private String name;


    public Connection(Socket socket, LinkedBlockingDeque<Message> messages,CopyOnWriteArraySet<Connection> connections) {
        this.socket = socket;
        this.messages = messages;
        this.connections = connections;
        Thread thread = new  ServerReader(this,messages);
        thread.start();
    }

    public Connection(Socket socket) throws IOException {
        this.socket = socket;

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(Message message) throws IOException {
        out = new ObjectOutputStream(this.socket.getOutputStream());
        message.setTime();
        out.writeObject(message);
        out.flush();
    }
    public Message readMessage() throws IOException, ClassNotFoundException {
        in = new ObjectInputStream(this.socket.getInputStream());
        return (Message) in.readObject();
    }
    @Override
    public void close() throws Exception {
        socket.close();
        out.close();
        in.close();

    }
    class ServerReader extends Thread {
        LinkedBlockingDeque<Message> messages;
        Connection connection;



        public ServerReader(Connection connection, LinkedBlockingDeque<Message> messages) {
            this.messages = messages;
            this.connection = connection;

        }

        @Override
        public void run() {
            while (!isInterrupted()) {
                try {
                    Message fromClient = readMessage();
                   // System.out.println(fromClient);
                    fromClient.setCount(connection.getCount());
                    //System.out.println("count message "+fromClient.getCount());
                    messages.put(fromClient);
                }
                catch (SocketException e){
                    connections.remove(this.connection);

                }
                catch (IOException | ClassNotFoundException | InterruptedException e) {
                    e.printStackTrace();
                }
                catch (NullPointerException ignored) {

                }
            }
        }
    }
}

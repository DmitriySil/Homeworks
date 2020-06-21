package Homework.multithreadingExam;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;

public class Server {

    private int port;

    public void testServer() throws IOException, ClassNotFoundException {
        LinkedBlockingDeque<Message> messages = new LinkedBlockingDeque<>();
        CopyOnWriteArraySet<ServerReader> serverReaders = new CopyOnWriteArraySet<>();
        try {
            ServerSocket serverSocket = new ServerSocket(8090);
            System.out.println("Server start");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                Connection connection = new Connection(clientSocket);


                ServerReader serverReader = new ServerReader(connection,messages);
                serverReader.start();
                serverReaders.add(serverReader);

                ServerWriter serverWriter = new ServerWriter(connection,messages,serverReaders);
                serverWriter.start();

            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();


        try {
            server.testServer();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }






    class ServerReader extends Thread{
    LinkedBlockingDeque<Message> messages;
    Connection connection;


    public ServerReader(Connection connection, LinkedBlockingDeque<Message> messages) {
        this.messages = messages;
        this.connection = connection;
    }

    @Override
    public void run() {
        try {
            Message fromClient = connection.readMessage();
            System.out.println(fromClient);
            messages.put(fromClient);
        }
        catch (IOException | ClassNotFoundException | InterruptedException e) {
            e.printStackTrace();
        }catch (NullPointerException ignored){

        } }
}
class ServerWriter extends Thread{
    LinkedBlockingDeque<Message> messages;
    Connection connection;
    CopyOnWriteArraySet<ServerReader> serverReaders;

    public ServerWriter(Connection connection, LinkedBlockingDeque<Message> messages, CopyOnWriteArraySet<ServerReader> serverReaders) {
        this.serverReaders = serverReaders;
        this.messages = messages;
        this.connection = connection;
    }

    @Override
    public void run() {

        try {
            Message message = messages.take();
            //System.out.println(message+" writer");
            for(ServerReader reader:serverReaders){
                reader.connection.sendMessage(message);
            }
            //connection.sendMessage(message);
        }
        catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }}
}
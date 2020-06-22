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
        CopyOnWriteArraySet<Connection> connections = new CopyOnWriteArraySet<>();
        try {
            ServerSocket serverSocket = new ServerSocket(8090);
            System.out.println("Server start");
            int count = 0;
            while (true) {
                //System.out.println(connections.size());
                Socket clientSocket = serverSocket.accept();
                count++;
                Connection connection = new Connection(clientSocket,messages,connections);
                connection.setCount(count);

                //System.out.println("new client " + connection.getCount()+" count");
                System.out.println(connections.size());
                if (connections.isEmpty()){
                    ServerWriter serverWriter = new ServerWriter(messages,connections);
                    serverWriter.start();
                   // System.out.println("writer start");
                }

                connections.add(connection);


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







class ServerWriter extends Thread{
    LinkedBlockingDeque<Message> messages;
    //Connection connection;
    CopyOnWriteArraySet<Connection> connections;

    public ServerWriter(LinkedBlockingDeque<Message> messages, CopyOnWriteArraySet<Connection> connections) {
        this.connections = connections;
        this.messages = messages;
       // this.connection = connection;
    }

    @Override
    public void run() {
while (true){
    if (!connections.isEmpty()) {

        try {
            Message message = messages.take();
            //System.out.println(message+" writer");
            for (Connection connection : connections) {
                if (connection.getCount()!= message.getCount()){
                connection.sendMessage(message);}
            }
            //connection.sendMessage(message);
        }
        catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }}}}
}
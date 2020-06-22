package Homework.multithreadingExam;


import ru.ifmo.base.lesson19.messages.SimpleMessage;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.util.Properties;
import java.util.Scanner;

public class Client {
    private String name;


    Socket getSocket() {
        Properties properties = new Properties();
        String pName = "Config.properties";
        try (InputStream input = ru.ifmo.base.lesson19.messages.Client.class.getClassLoader().getResourceAsStream(pName)) {
            properties.load(input);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        int port = Integer.parseInt(properties.getProperty("port"));
        String ip = properties.getProperty("ip");
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 8090);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return socket;
    }
    private void sendAndPrintMessage(Message message,Connection connection) throws Exception {
            connection.sendMessage(message);
           // Message fromServer = connection.readMessage();
           // System.out.println("ответ от сервера " + fromServer);
        //System.out.println("Отправил");

    }
  public void start() throws Exception {
      Scanner scanner = new Scanner(System.in);
      String text;
      String name;
      System.out.println("Write name");
      name = scanner.nextLine();
      System.out.println("Write message ");
      Socket socket = new Socket("127.0.0.1", 8090);
      Connection connection = new Connection(socket);
      Thread thread = new Thread(new Reader(connection));
      thread.start();
          while (true) {
              text = scanner.nextLine();
              if ("exit".equalsIgnoreCase(text)){
                 // socket.close();
                  System.exit(1);
              }
              sendAndPrintMessage(new Message(text,name),connection);

              }
          }



    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.start();
        }catch (IOException ignored){
            System.out.println("Сервер недоступен");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    class Reader extends Thread{
        Connection connection;

        public Reader(Connection connection) {
            this.connection = connection;
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
                try {
                    Message fromServer = connection.readMessage();
                    System.out.println(fromServer);//"пришло с сервера "
                    // connection.close();
                }catch (SocketException e){
                    System.out.println("Сервер недоступен,попробуйте подключится позже");
                    System.exit(1);
                }
                catch (StreamCorruptedException e) {

                }
                catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}




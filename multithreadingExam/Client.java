package Homework.multithreadingExam;


import ru.ifmo.base.lesson19.messages.SimpleMessage;

import java.io.*;
import java.net.Socket;
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
        System.out.println("Отправил");

    }
  public void start() throws Exception {
      Scanner scanner = new Scanner(System.in);
      String text;

      System.out.println("Write message ");

          while (true) {
              Socket socket = new Socket("127.0.0.1", 8090);
              Connection connection = new Connection(socket);
                  text = scanner.nextLine();
                  sendAndPrintMessage(new Message(text),connection);
                  Thread thread = new Thread(new Reader(connection));
                  thread.start();
              }
          }



    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.start();
        }catch (IOException ignored){}
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Reader implements Runnable{
    Connection connection;

    public Reader(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void run() {
        try {
            Message fromServer = connection.readMessage();
            System.out.println(fromServer);
           // connection.close();
        }
        catch (StreamCorruptedException e){

        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}


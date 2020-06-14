package Homework.multithreadingExam;

import ru.ifmo.base.lesson19.messages.SimpleMessage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Connection implements AutoCloseable{
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    public Connection(Socket socket) throws IOException {
        this.socket = socket;


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
}

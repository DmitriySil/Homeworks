package Homework.queue;



import java.lang.reflect.Array;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Queue {
    public static void main(String[] args) {
        ArrayBlockingQueue<Order> clientWaiter = new ArrayBlockingQueue<>(6,true);
        ArrayBlockingQueue<Order> waiterCook = new ArrayBlockingQueue<>(6,true);
        ArrayBlockingQueue<Order> cookClient = new ArrayBlockingQueue<>(6,true);

        new Thread(new Client(clientWaiter,cookClient)).start();
        new Thread(new Waiter(clientWaiter,waiterCook)).start();
        new Thread(new Cook(waiterCook,cookClient)).start();

    }
    /*заказ
Потоки:
    Клиент формирует заказ (создает объект)
    передает в очередь 1 / забирает готовый из очереди 3
    Официант
    забирает из очереди 1 и передает в очередь 2
    Повар
    забирает из очереди 2 и передает в очередь 3

    Очереди:
            1 клиент-официант
            2 официант-повар
            3 повар-клиент*/
}
class Client implements Runnable{
    private ArrayBlockingQueue<Order> clientWaiter;
    private ArrayBlockingQueue<Order> cookClient;
    private int number = 0;

    public Client(ArrayBlockingQueue<Order> clientWaiter, ArrayBlockingQueue<Order> cookClient) {
        this.clientWaiter = clientWaiter;
        this.cookClient = cookClient;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){

            try {
                Order order = new Order();
                order.setNumber(number);
                clientWaiter.put(order);
                System.out.println("Клиент делает заказ #"+number);
                number++;
                Thread.sleep(2000);
                if (cookClient.size()!=0){
                    cookClient.take();
                    System.out.println("Клиент ест "+cookClient.take().getNumber());

                }


            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
class Waiter implements Runnable{
    private ArrayBlockingQueue<Order> clientWaiter;
    private ArrayBlockingQueue<Order> waiterCook;

    public Waiter(ArrayBlockingQueue<Order> clientWaiter, ArrayBlockingQueue<Order> waiterCook) {
        this.clientWaiter = clientWaiter;
        this.waiterCook = waiterCook;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            try {
                Thread.sleep(4000);
                Order order = clientWaiter.take();
                waiterCook.put(order);
                System.out.println("Официант отдает повару заказ "+order.getNumber());

            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class Cook implements Runnable{
    private ArrayBlockingQueue<Order> waiterCook;
    private ArrayBlockingQueue<Order> cookClient;

    public Cook(ArrayBlockingQueue<Order> waiterCook, ArrayBlockingQueue<Order> cookClient) {
        this.waiterCook = waiterCook;
        this.cookClient = cookClient;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){

            try {
                Thread.sleep(4000);
                Order order = waiterCook.take();
                cookClient.put(order);
                System.out.println("Повар отдает заказ "+order.getNumber());

            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class Order{
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static Order getOrder(){
        return new Order();
    }
}

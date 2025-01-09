/* Write an appropriate program by using the following method :-
wait() method
notify() method
notifyAll() method
*/

class Shared {
    public synchronized void produce() {
        System.out.println("Producing...");
        try {
            wait();                                                         // Wait until notified
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted.");
        }
        System.out.println("Resumed production.");
    }

    public synchronized void consume() {
        System.out.println("Consuming...");
        notify();                                                           // Notify the waiting thread
        System.out.println("Notified producer.");
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        Shared shared = new Shared();

        // Producer 
        Thread producer = new Thread(() -> shared.produce());

        // Consumer 
        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(1000); // producer waits first
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted.");
            }
            shared.consume();
        });

        producer.start();
        consumer.start();
    }
}

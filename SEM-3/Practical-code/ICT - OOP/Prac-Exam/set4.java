/* Write an appropriate program by using the following method :- 
1. run()method
2. start method
3. sleep method
4. yield() method
5. join() method

in java 
*/

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running - Count: " + i);
            try {
                Thread.sleep(500);                                                                      //sleep
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }
            // other threads a chance to execute
            Thread.yield();                                                                             //yield
        }
    }
}

public class ThreadMethodsDemo {
    public static void main(String[] args) {
        // Creating thread obj
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();                                                                                //start
        thread2.start();

        try {
            thread1.join();                                                                             //join
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("All threads have completed execution");
    }
}



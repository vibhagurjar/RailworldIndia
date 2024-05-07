package Multithreading;

public class SuspendMethod extends Thread{
    public void run()
    {
        for (int i = 1; i < 5; i++) {
            try {

                // thread to sleep for 500 milliseconds
                sleep(5);
                System.out.println(
                        "Currently running - "
                                + Thread.currentThread().getName());
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        // creating three threads
        SuspendMethod t1 = new SuspendMethod();
        SuspendMethod t2 = new SuspendMethod();
        SuspendMethod t3 = new SuspendMethod();

        // call run() method
        t1.start();
        t2.start();

        // suspend t2 thread
        t2.suspend();

        // call run() method
        t3.start();
    }
}

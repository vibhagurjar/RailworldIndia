package Multithreading;

class MyThread01 implements Runnable {

    // run() method inside this class
    public void run()
    {
        // Iterating to get more execution of threads
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread1");

            try {
                // Making the thread pause for a certain
                // time using sleep() method
                Thread.sleep(1000);
            }

            // Catch block to handle the exceptions
            catch (Exception e) {
            }
        }
    }
}


class MyThread02 implements Runnable {

    // run() method inside this class
    public void run()
    {
        for (int i = 0; i < 5; i++) {


            System.out.println("Thread2");


            try {

                // Making the thread pause for a certain
                // time
                // using sleep() method
                Thread.sleep(1000);
            }

            // Catch block to handle the exceptions
            catch (Exception e) {
            }
        }
    }
}

public class SleepMethod {
    // Main driver method
    public static void main(String[] args)
    {
        Runnable obj1 = new MyThread01();
        Runnable obj2 = new MyThread02();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

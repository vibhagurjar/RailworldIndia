package Multithreading;

public class GrpThreadConstructor extends Thread {
    @Override
    public void run() {


        System.out.println(Thread.currentThread().isAlive());
    }



    public static void main(String[] args) {

        GrpThreadConstructor thread=new GrpThreadConstructor();
        System.out.println("thread  is start or not = "+  thread.isAlive());
        thread.run();
        System.out.println(" after starting a thread =  "+  thread.isAlive());
//		 ThreadGroup tg1=new ThreadGroup("Parent Thread");
//		 Thread tg2=new  Thread(tg1, thread, "start");
//		 tg2.start();
//
//		 Thread tg3=new Thread(tg1, thread, "the");
//		 tg3.start();
//
//		 Thread tg4=new Thread(tg1, thread, "work");
//		 tg4.start();
//
//		 System.out.println("Thread Group Name:"+tg1.getName());
//		 tg1.list();
//


    }
}


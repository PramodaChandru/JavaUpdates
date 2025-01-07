package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThreadingSession {
    public static void main(String[] args) {
        System.out.println("Main Thread Starts");
        for (int i = 0; i < 10;i++) {
//            ThreadImpl t = new ThreadImpl();
//            Thread t = new Thread(new RunnableImpl(), "MyThread-"+i);
//            t.start();
            System.out.println("Test");
        }
        System.out.println("Main Thread Ends");
    }

}

class ThreadImpl extends Thread {
    public void execute() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
//            Logger.getLogger(ThreadImpl.class.getName()).log(Level.SEVERE);
        }
        System.out.println("Executing thread: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        }catch (InterruptedException ex) {
            //
        }
        System.out.println("Executing thread: " + Thread.currentThread().getName());
    }
}

class RunnableImpl implements Runnable {
    public void run() {
        try {
            Thread.sleep(2000);
        }catch (InterruptedException ex) {
            //
        }
        System.out.println("Executing thread: " + Thread.currentThread().getName());
    }

}
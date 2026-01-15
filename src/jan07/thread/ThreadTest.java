package jan07.thread;

public class ThreadTest {
    public static void main(String[] args) {
        // 1. Using Thread Class
        ThreadByClass[] threadsByClass = new ThreadByClass[3];  
        for (int i = 0; i < threadsByClass.length; i++) {
            threadsByClass[i] = new ThreadByClass();
            threadsByClass[i].setName("ClassThread-" + i);
            threadsByClass[i].start();
        }

        // 2. Using Runnable Interface
        Thread[] threadsByRunnable = new Thread[3];
        for (int i = 0; i < threadsByRunnable.length; i++) {
            Runnable r = new ThreadByInterface();
            threadsByRunnable[i] = new Thread(r);
            threadsByRunnable[i].setName("RunnableThread-" + i);
            threadsByRunnable[i].start();
        }
    }
}

class ThreadByClass extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
    }
}

class ThreadByInterface implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Runnable) is running...");
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan07.thread;

/**
 *
 * @author TASRIF ZAMAN
 */
public class ThreadTest {
    public static void main(String[] args) {
       ThreadByClass[] threadsByClass = new ThreadByClass[3];  
        for (int i = 0; i < threadsByClass.length; i++) {
            threadsByClass[i] = new ThreadByClass();
            threadsByClass[i].start();
        }

       Thread[] threadsByRunnable = new Thread[3];
        for (int i = 0; i < threadsByRunnable.length; i++) {
            Runnable r = new ThreadByInterface();
            threadsByRunnable[i] = new Thread(r);
            threadsByRunnable[i].start();
        }
    }
}

  class ThreadByClass extends Thread {
     @Override
       public void run() {
         for (int i = 0; i < 5; i++) {
            System.out.println("Thread Class: " + i);
        }
    }
}

class ThreadByInterface implements Runnable {
     @Override
       public void run() {
          for (int i = 0; i < 5; i++) {
            System.out.println("Runnable Interface: " + i);
        }
    }
}


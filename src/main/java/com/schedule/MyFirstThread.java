package com.schedule;

public class MyFirstThread {
    public static void main(String[] args) {
        System.out.println("Main thread start : " + Thread.currentThread().getName());

        Thread worker = new Thread(() -> {
            System.out.println("Worker thread running: " + Thread.currentThread().getName());

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Worker thread finished");
        });

        worker.start();
        System.out.println("Main thread end");
    }
}

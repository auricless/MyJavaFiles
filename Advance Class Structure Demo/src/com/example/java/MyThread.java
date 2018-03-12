package com.example.java;

public class MyThread extends Thread {

    int iteration = 5;

    @Override
    public void run() {
        try {
            for (int i = 0; i < iteration; i++){
                System.out.println("from second thread...");
                sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

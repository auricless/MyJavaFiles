package com.example.java;

import com.example.java.model.OliveColor;
import com.example.java.model.OliveJar;
import com.example.java.model.OliveName;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        OliveJar jar = new OliveJar();
        jar.addOlive(OliveName.KALAMATA, OliveColor.BLACK);
        jar.addOlive(OliveName.KALAMATA, OliveColor.BLACK);
        jar.addOlive(OliveName.LIGURAN, OliveColor.GREEN);
        jar.reportOlives();
        System.out.println(" ");

        //CLASS class
        Class<?> c = jar.getClass();
        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());

        //CONSTRUCTOR class
        Constructor<?>[] cons = c.getConstructors();
        System.out.println("Number of constructor(s): " + cons.length);
        Constructor<?> con = cons[1];
        Object obj = null;
        try {
            obj = con.newInstance(3, OliveName.GOLDEN, OliveColor.GOLD);
            System.out.println(obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        //THREAD
//        int iteration = 5;
//
//        MyThread thread = new MyThread();
//        thread.start();
//        try {
//            for (int i = 0; i < iteration; i++) {
//                System.out.println("from main process...");
//                Thread.sleep(3000);
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}

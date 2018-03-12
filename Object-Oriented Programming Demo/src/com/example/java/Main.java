package com.example.java;

import com.example.java.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * This is an Olive pressing project
 */

public class Main {
    /**
     * The main method where the main process happen
     * @param args add if necessary
     */
    public static void main(String[] args) {
        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());

        Press press = new OlivePress();
        press.setOil(5);
        int totalOil = press.getOil(olives);
        System.out.println("Total of " + totalOil + " units");
    }
}

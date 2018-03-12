package com.example.java;

import com.example.java.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aron Ciruela on 21/11/2017.
 */
public class OliveMain {

    public static void main(String[] args){

        List<Olive> olives = new ArrayList<>();

        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("You got " + totalOil + " units total of oil");
    }

}

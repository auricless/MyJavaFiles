package com.example.java;

import com.example.java.model.Olive;

import java.util.List;

/**
 * Created by Aron Ciruela on 21/11/2017.
 */
public class OlivePress {

    public int getOil(List<Olive> olives){
        int totalOil = 0;
        for (Olive olive : olives){
            totalOil += olive.crush();
            System.out.println(olive.getName() + ": " + olive.crush() + " units");
        }

        return totalOil;

    }

}

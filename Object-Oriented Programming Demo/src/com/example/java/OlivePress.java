package com.example.java;

import com.example.java.model.Olive;

import java.util.List;

/**
 * This class is the processor class. It implements <i>Press</i> interface.
 */
public class OlivePress implements Press{
    private int totalOil = 0;

    public int getOil(List<Olive> olives){
        for (Olive olive : olives) {
            totalOil += olive.crush();
        }
        return totalOil;
    }

    @Override
    public void setOil(int oil) {
        totalOil = oil;
    }

}

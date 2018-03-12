package com.example.java;

import com.example.java.model.Olive;

import java.util.List;

/**
 * This is the interface for OlivePress
 */
public interface Press {

    int getOil(List<Olive> olives);
    void setOil(int oil);

}

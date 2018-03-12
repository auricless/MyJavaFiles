package com.example.java.model;

/**
 * Created by Aron Ciruela on 21/11/2017.
 */
public enum OliveName {
    KALAMATA("Kalamata"), LIGURIAN("Ligurian");

    private String name;

    OliveName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

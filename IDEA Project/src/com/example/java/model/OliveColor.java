package com.example.java.model;

/**
 * Created by Aron Ciruela on 21/11/2017.
 */
public enum OliveColor {
    PURPLE("Purple", 0x2E0854), BLACK("Black", 0x2E0854), GREEN("Green", 0x00FF00);

    private String name;
    private long color;

    OliveColor(String name, long color){
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return name;
    }
}

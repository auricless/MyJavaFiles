package com.example.java.model;

public enum OliveColor {
    BLACK("Black"), GREEN("Green"), GOLD("Gold");

    public String name;

    OliveColor(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

package com.example.java.model;

public enum OliveName {
    KALAMATA("Kalamata"), LIGURAN("Ligurian"), GOLDEN("Golden");

    public String name;

    OliveName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

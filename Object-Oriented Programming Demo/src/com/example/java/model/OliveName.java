package com.example.java.model;

public enum OliveName {
    KALAMATA("Kalmata"), LIGURIAN("Ligurian");

    private String name;

    OliveName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

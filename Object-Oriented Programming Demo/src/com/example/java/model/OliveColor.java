package com.example.java.model;

public enum OliveColor {
    PURPLE("Purple", 0xE20854), BLACK("Black", 0xE000000), GREEN("Green", 0x00FF00);

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

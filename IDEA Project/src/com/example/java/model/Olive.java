package com.example.java.model;

/**
 * Created by Aron Ciruela on 21/11/2017.
 */
public class Olive {

    private OliveName name = OliveName.KALAMATA;
    private OliveColor color = OliveColor.PURPLE;
    private int oil = 3;

    public Olive(OliveName name, OliveColor color, int oil){
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public OliveName getName() { return name; }

    public void setName(OliveName name) { this.name = name; }

    public OliveColor getColor() { return color; }

    public void setColor(OliveColor color) { this.color = color; }

    public int crush() {
        return oil;
    }

    public void setOil(int oil) { this.oil = oil; }
}

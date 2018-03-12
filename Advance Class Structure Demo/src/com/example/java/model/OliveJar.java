package com.example.java.model;

import java.util.ArrayList;

public class OliveJar {

    public static ArrayList<Olive> olives;

    public OliveJar(){
        System.out.println("Constructor...");
    }

    public OliveJar(int nOlives, OliveName name, OliveColor color){
        System.out.println("Constructor...");
        for (int i = 0; i < nOlives; i++){
            olives.add(new Olive(name, color));
        }
    }
    //STATIC AND FIELD INITIALIZER
    {
        System.out.println("Initializing...");
        olives = new ArrayList<>();
        olives.add(new Olive(OliveName.GOLDEN, OliveColor.GOLD));
    }

    public void addOlive(OliveName oliveName, OliveColor color){
        olives.add(new Olive(OliveName.KALAMATA, OliveColor.BLACK));
    }

    public void reportOlives(){
        //LOCAL INNER CLASS
//        class JarLid{
//            public void open(){
//                System.out.println("Twist... twist... twist...");
//                System.out.println("Pop!");
//            }
//        }
//        new JarLid().open();
        //ANONYMOUS INNER CLASS
        new Object(){
            public void open(){
                System.out.println("Twist... twist... twist...");
                System.out.println("Pop!");
            }
        }.open();

        for(Olive olive : olives){
            System.out.println("It's a " + olive.getName() + " olive!");
        }
    }
//MEMBER CLASS
    class Olive {

        private OliveName name = OliveName.KALAMATA;
        private OliveColor color = OliveColor.BLACK;

        public Olive(OliveName name, OliveColor color){
            this.name = name;
            this.color = color;
        }

        public OliveName getName() {
            return name;
        }

        public void setName(OliveName name) {
            this.name = name;
        }

        public OliveColor getColor() {
            return color;
        }

        public void setColor(OliveColor color) {
            this.color = color;
        }
    }

}

package com.example.java.utilities;

/**
 * Created by Aron Ciruela on 21/11/2017.
 */
public class MathHelper {

    public static double addValues(String val1, String val2){
        double value1 = Double.parseDouble(val1);
        double value2 = Double.parseDouble(val2);
        return value1 + value2;
    }
    public static double subtractValues(String val1, String val2){
        double value1 = Double.parseDouble(val1);
        double value2 = Double.parseDouble(val2);
        return value1 - value2;
    }
    public static double multiplyValues(String val1, String val2){
        double value1 = Double.parseDouble(val1);
        double value2 = Double.parseDouble(val2);
        return value1 * value2;
    }
    public static double divideValues(String val1, String val2){
        double value1 = Double.parseDouble(val1);
        double value2 = Double.parseDouble(val2);
        return value1 / value2;
    }

}

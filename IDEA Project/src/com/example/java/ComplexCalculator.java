package com.example.java;

import com.example.java.utilities.InputHelper;
import com.example.java.utilities.MathHelper;

import java.util.Scanner;

/**
 * Created by Aron Ciruela on 20/11/2017.
 */
public class ComplexCalculator {
    public static void main(String[] args){
        //COMPLEX CALCU
        ComplexCalculator calc = new ComplexCalculator();
        calc.calculator();
    }

    protected void calculator() {

        InputHelper helper = new InputHelper();

        String val1 = helper.getInput();
        String val2 = helper.getInput();
        String operator = helper.getOperator();
        double result = calculate(operator, val1, val2);
        System.out.println(result);
    }

    static double calculate(String operator, String val1, String val2) {
        try {
            switch (operator) {
                case "+":
                    return MathHelper.addValues(val1, val2);
                case "-":
                    return MathHelper.subtractValues(val1, val2);
                case "*":
                    return MathHelper.multiplyValues(val1, val2);
                case "/":
                    return MathHelper.divideValues(val1, val2);
                default:
                    System.out.println("Unrecognized operator!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Number format exception " + e.getMessage());
        }
        return 0.0;
    }

}

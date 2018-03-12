package com.example.java.utilities;

import java.util.Scanner;

/**
 * Created by Aron Ciruela on 21/11/2017.
 */
public class InputHelper {

    public String getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String value = scanner.nextLine();
        return value;
    }

    public String getOperator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose an operator(+ - * /): ");
        String operator = scanner.nextLine();
        return operator;
    }

}

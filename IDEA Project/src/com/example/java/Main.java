package com.example.java;

import javax.swing.text.NumberFormatter;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            //INTRO
//    	 System.out.println("Hello from IDEA!");
//    	 String aString = "Aron";
//    	 System.out.println("Your name is: " + aString);
//            //PRIMITIVE DATA TYPES
//        byte b = 1;
//        short s = 1;
//        int i = 1;
//        long l = 1L;
//        float f = 1f;
//        double d = 1d;
//        System.out.println("Byte: " + b);
//        System.out.println("Short: " + s);
//        System.out.println("Int: " + i);
//        System.out.println("Long: " + l);
//        System.out.println("Float: " + f);
//        System.out.println("Double: " + d);

            //PRECISION OF DOUBLE AND DECIMAL
//        double value = .012;
//        double pSum = value + value + value;
//        System.out.println("Psum: " + pSum);
//        String strVal = Double.toString(value);
//        BigDecimal bigVal = new BigDecimal(strVal);
//        BigDecimal bigSum = bigVal.add(bigVal).add(bigVal);
//        System.out.println("bigSum: " + bigSum);
            //WIDENING OR NARROWING DATA TYPE AND CASTING
//        int intValue1 = 56;
//        int intValue2 = intValue1;
//        System.out.println("The second value is: " + intValue2);
//        long longValue1 = intValue1;
//        System.out.println("The long value is: " + longValue1);
//        short shortValue1 = (short) intValue1;
//        System.out.println("The short value is: " + shortValue1);
//        int intValue3 = 1024;
//        byte byteValue = (byte) intValue3;
//        System.out.println("The byte value is: " + byteValue);
//        double doubeValue = 3.999999d;
//        int intValue4 = (int) doubeValue;
//        System.out.println("Double to int: " + intValue4);

            //STRINGBUILDER
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(" ").append("World");
//        System.out.println(sb);

            //NUMBERFORMAT
//        double dbVal = 10_000_00.85d;
//        NumberFormat formatter = NumberFormat.getNumberInstance();
//        System.out.println(formatter.format(dbVal));

            //LOCALDATETIME
//        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ldt);
//        LocalDate ld = LocalDate.now();
//        System.out.println(ld);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
//        System.out.println(formatter.format(ld));

            //SIMPLE CALCULATOR (ADDITION)
//        Scanner scanner = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder("Enter a numeric value: ");
//        System.out.print(sb);
//        String value1 = scanner.nextLine();
//        double parsedVal1 = Double.parseDouble(value1);
//        System.out.print(sb);
//        String value2 = scanner.nextLine();
//        double parsedVal2 = Double.parseDouble(value2);
//        double sum = parsedVal1 + parsedVal2;
//        sb.delete(0, sb.length());
//        sb.append("The answer is: ").append(sum);
//        System.out.println(sb);

                //LOOPS
//        String[] months = {"January", "February", "March", "April", "May", "June", "July",
//                            "August", "September", "October", "November", "December"};
//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);
//        }
//        for (int i = months.length - 1; i >= 0 ; i--) {
//            System.out.println(months[i]);
//        }
//        for (String month: months) {
//            System.out.println(month);
//        }
//        int count = 0;
//        while (count < months.length){
//            System.out.println(months[count]);
//            count++;
//        }
//        int count = 0;
//        do{
//            System.out.println(months[count]);
//            count++;
//        }while(count < months.length);

    }


}
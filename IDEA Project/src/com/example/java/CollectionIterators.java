package com.example.java;

import java.util.*;

/**
 * Created by Aron Ciruela on 20/11/2017.
 */
public class CollectionIterators {

    public static void main(String[] args){

        System.out.println("Ordered data: ");
        List<String> list = new ArrayList<>();
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println(list);

        System.out.println("ArrayList Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }
        System.out.println(" ");

        System.out.println("ArrayList forEach");
        for (String value : list){
            System.out.println(value);
        }
        System.out.println(" ");

        System.out.println("Java 8 reference method");
        list.forEach(System.out::println);
        System.out.println(" ");

        System.out.println("Unordered Data");
        Map<String, String> map = new HashMap<>();
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);
        System.out.println(" ");

        System.out.println("HashMap Iterator");
        Set<String> keys = map.keySet();
        Iterator<String> iterator1 = keys.iterator();
        while (iterator1.hasNext()){
            String value = iterator1.next();
            System.out.println(value);
        }
        System.out.println(" ");

        System.out.println("HashMap forEach");
        for (String key : keys){
            String value = map.get(key);
            System.out.println(value);
        }
    }

}

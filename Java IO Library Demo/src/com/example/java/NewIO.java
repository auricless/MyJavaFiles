package com.example.java;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by Aron Ciruela on 21/11/2017.
 */
public class NewIO {

    public static void main(String[] args){

        Path src = Paths.get("loremipsum.txt");
        Path targ = Paths.get("targ.txt");
        System.out.println(src);
        try {
            Files.copy(src, targ, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

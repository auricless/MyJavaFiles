package com.example.java;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String sourceFile = "loremipsum.txt";
        String targetFile = "target.txt";

        try(
                FileReader fReader = new FileReader(sourceFile);
                BufferedReader bReader = new BufferedReader(fReader);
                FileWriter fWriter = new FileWriter(targetFile);
                ) {

            while (true){
                String line = bReader.readLine();
                if(line == null){
                    break;
                }else{
                    fWriter.write(line + "\n");
                }
            }
            System.out.println("File Copied!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

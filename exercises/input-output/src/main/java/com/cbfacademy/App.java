package com.cbfacademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;

public class App {
    public static void main(String[] args) {
        //readFile();
        copyFile();

    }

    private static void copyFile() {
        String filePath = "exercises/input-output/src/main/resources/exercise.txt";
        String fileName = "exercises/input-output/src/main/resources/exercise1.txt";
        try {
            FileReader in = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(in);
            FileWriter out = new FileWriter(fileName);
            BufferedWriter writer = new BufferedWriter(out);
            int character = reader.read();
            while (character != -1) {
                        writer.write(character);
                        character = reader.read();
                    }
            reader.close();
            writer.close();

        } catch(IOException e) {
            System.out.println("File copying exception: " + e.getMessage());


        } 
    }

    private static void readFile() {
        String filePath = "exercises/input-output/src/main/resources/exercise.txt";
        try (
                FileInputStream file = new FileInputStream(filePath);
                InputStreamReader streamReader = new InputStreamReader(file);
                LineNumberReader lineReader = new LineNumberReader(streamReader);) {
                String outputLine = lineReader.readLine();
                while (outputLine != null) {
                    System.out.println(outputLine);
                    outputLine = lineReader.readLine();
                }
        }

        catch (IOException e) {
            System.out.println("File reading exception: " + e.getMessage());

        }
    }

}

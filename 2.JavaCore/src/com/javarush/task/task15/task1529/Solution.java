package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //add your code here - добавьте код тут
    }

    public static Flyable result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        switch (reader.readLine()){
            case Flyable.HELICOPTER : result = new Helicopter();
                break;
            case Flyable.PLANE : result = new Plane(Integer.parseInt(reader.readLine()));
                break;
            default : result = null;
        }
        reader.close();
        //add your code here - добавьте код тут
    }
}

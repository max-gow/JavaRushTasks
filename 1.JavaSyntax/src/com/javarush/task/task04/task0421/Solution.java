package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameone = reader.readLine();
        String nametwo = reader.readLine();

        if(nameone.equals(nametwo))
            System.out.println("Имена идентичны");
        else if (nameone.length() == nametwo.length())
            System.out.println("Длины имен равны");


    }
}

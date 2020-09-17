package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String areader = reader.readLine();
        int num1 = Integer.parseInt(areader);
        String breader = reader.readLine();
        int num2 = Integer.parseInt(breader);
        String creader = reader.readLine();
        int num3 = Integer.parseInt(creader);

        if (num1 == num2 && num2 == num3)
            System.out.println(num1 + " " + num2 + " " + num3);
        else if (num1 == num2)
            System.out.println(num1 + " " + num2);
        else if (num1 == num3)
            System.out.println(num1 + " " + num3);
        else if (num2 == num3)
            System.out.println(num2 + " " + num3);

    }
}
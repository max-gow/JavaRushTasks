package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String time = reader.readLine();
        Double ntime = Double.parseDouble(time);
        ntime = ntime % 5;
        if (ntime >= 0 && ntime < 3)
            System.out.println("зелёный");
        else if (ntime >= 3 && ntime < 4 )
            System.out.println("жёлтый");
        else if (ntime >=4 && ntime < 5 )
            System.out.println("красный");

    }
}
package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sFirst = reader.readLine();
        int nFirst = Integer.parseInt(sFirst);
        String sTwo = reader.readLine();
        int nTwo = Integer.parseInt(sTwo);
        System.out.println(name + " получает " + nFirst + " через " + nTwo + " лет.");
    }
}

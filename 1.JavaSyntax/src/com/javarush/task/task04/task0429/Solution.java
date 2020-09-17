package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int plus = 0;
        int min = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(reader.readLine());
            if (a > 0)
                plus++;
            else if (a < 0)
                min++;
        }
        System.out.println("количество отрицательных чисел: " + min);
        System.out.println("количество положительных чисел: " + plus);

    }
}

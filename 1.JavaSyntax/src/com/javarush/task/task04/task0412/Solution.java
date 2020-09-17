package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            number = number * 2;
            System.out.println(number);
        }
        else if (number < 0) {
            number = number + 1;
            System.out.println(number);
        }
        else if (number == 0)
            System.out.println(number);
    }

}
package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b)
            System.out.println(a);
        else if ( a > b)
            System.out.println(b);
        else
            System.out.println(a);

    }
}
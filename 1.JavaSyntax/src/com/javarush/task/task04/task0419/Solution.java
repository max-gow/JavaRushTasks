package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(a >= b && a >= c && a >= d)
            System.out.println(a);
        else if(b >= a && b >= c && b >= d)
            System.out.println(b);
        else if(c >= a && c >= b && c >= d)
            System.out.println(c);
        else if (d >= a && d >= b && d >= c)
            System.out.println(d);
        }
}

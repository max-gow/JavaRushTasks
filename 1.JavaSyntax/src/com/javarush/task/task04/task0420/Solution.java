package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b && a >= c && b >= c)
            System.out.println(a + " " + b + " " + c);
        else if (a >= b && a >= c && c >= b)
            System.out.println(a + " " + c + " " + b);
        else if (b >= a && b >= c && a >= c)
            System.out.println(b + " " + a + " " + c);
        else if (b >= a && b >= c && c >= a)
            System.out.println(b + " " + c + " " + a);
        else if (c >= a && c >= b && b >= a)
            System.out.println(c + " " + b + " " + a);
        else if (c >= a && c >= b && a >= b)
            System.out.println(c + " " + a + " " + b);

    }
}

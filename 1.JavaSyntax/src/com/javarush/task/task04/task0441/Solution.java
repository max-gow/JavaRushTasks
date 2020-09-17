package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (b > a && c > b || b > c && a > b) {
            System.out.println(b);
        } else if (a > b && c > a || a>c && b>a) {
            System.out.println(a);
        } else if (c > a && b > c || c>b && a>c) {
            System.out.println(c);

        } else if (a == b && a > c || a == b && a < c) {
            System.out.println(a);
        } else if (b == c && a > c || b == c && a < c) {
            System.out.println(b);
        } else if (a == c && b > a || a == c && b < a) {
            System.out.println(c);
        } else if (a == b && b == c) {
            System.out.println(a);
        }

    }
}

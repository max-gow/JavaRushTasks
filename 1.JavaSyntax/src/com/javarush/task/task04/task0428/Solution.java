package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aa = reader.readLine();
        int a = Integer.parseInt(aa);
        String bb = reader.readLine();
        int b = Integer.parseInt(bb);
        String cc = reader.readLine();
        int c = Integer.parseInt(cc);
        int res = 0;

        if (a > 0){
            res = res + 1;
        }
        if (b > 0)
            res = res + 1;
        if (c > 0)
            res = res + 1;
        System.out.println(res);


        /*
        if (a >= 0 && b >= 0 && c >= 0)
            System.out.println(3);
        else if (a >= 0 && b >= 0 && c < 0)
            System.out.println(2);
        else if (a >= 0 && b < 0 && c >= 0)
            System.out.println(2);
        else if (a < 0 && b >= 0 && c >= 0)
            System.out.println(2);
        else if (a >= 0 && b < 0 && c < 0)
            System.out.println(1);
        else if (a < 0 && b >= 0 && c < 0)
            System.out.println(1);
        else if (a < 0 && b < 0 && c >= 0)
            System.out.println(1);

         */

    }
}

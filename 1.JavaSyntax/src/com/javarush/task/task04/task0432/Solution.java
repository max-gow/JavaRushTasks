package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int num = Integer.parseInt(reader.readLine());

        if (num > 0) {
            while (num > 0) {
                System.out.println(str);
                num--;
            }
        }

    }
}

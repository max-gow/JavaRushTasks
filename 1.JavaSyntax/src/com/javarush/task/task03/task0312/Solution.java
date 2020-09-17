package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код
    public static int convertToSeconds(int hour) {
        return hour*60*60;
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        int a;
        a = convertToSeconds(1);
        System.out.println(a);
        a = convertToSeconds(10);
        System.out.println(a);

    }
}

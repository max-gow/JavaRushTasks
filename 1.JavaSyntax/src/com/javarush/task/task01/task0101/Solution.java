package com.javarush.task.task01.task0101;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        String[] arrayString = new String[10];
        int[] arrayInt = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<arrayString.length; i++){
            arrayString[i] = reader.readLine();
        }
        for (int i=0; i<arrayString.length; i++){
            arrayInt[i] = arrayString[i].length();
            System.out.println(arrayInt[i]);
        }
    }
}
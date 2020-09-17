package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }
    public static int sumDigitsInNumber(int number) {
        int three = number % 10;
        int two = ((number % 100) - three) / 10;
        int first = (number / 100);
        return first + two + three;
    }
}
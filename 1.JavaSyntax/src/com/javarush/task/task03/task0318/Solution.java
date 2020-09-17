package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        /*
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
        */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);

        System.out.println(name + " захватит мир через " + nAge + " лет. Му-ха-ха!");
    }
}

package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int[] numbers = {a,b,c};

        int positive = 0;
        int negotive = 0;
        int zero = 0;


        for (int i : numbers) {
            if (i > 0) positive++;
            else if (i < 0) negotive++;
            else zero++;
        }

        System.out.println("количество отрицательных чисел: " + negotive);
        System.out.println("количество положительных чисел: " + positive);

    }
}

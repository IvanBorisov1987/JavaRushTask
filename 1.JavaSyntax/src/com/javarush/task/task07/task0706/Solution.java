package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int even = 0;
        int uneven = 0;
        BufferedReader numbers = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15]; //Создать массив на 15 целых чисел.


        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numbers.readLine());
            if (i == 0)
                even += array[i];
            else if (i % 2 == 0)
                even += array[i];
            else
                uneven += array[i];
        }

        if (even > uneven) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}

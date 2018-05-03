package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //1. Создай массив целых чисел (int[]) на 20 элементов.
        int[] array = new int[20];
        // 2. Считай с клавиатуры 20 целых чисел и добавь их в массив.
        for (int i = 0; i < array.length; i++) {
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }

        minimum = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < minimum)
                minimum = array[i];
        }

        maximum = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > maximum)
                maximum = array[i];
        }
        // 3. Найди и выведи через пробел максимальное и минимальное числа.
        System.out.print(maximum + " " + minimum);
    }
}
package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader count = new BufferedReader(new InputStreamReader(System.in)); // ввод числа с консоли
        int[] array = new int[20];// создаем массив на 20 элементов который заполняем

        for (int i = 0; i < array.length; i++)   // заполнение массива числами с консоли
        {
            String s = count.readLine();
            array[i] = Integer.parseInt(s);
        }
        return array;
    }

    public static int max(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++)
        {
             if (array[i] > max)
                  max = array[i];
        }

        return max;
    }
}

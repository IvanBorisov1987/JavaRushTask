package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader count = new BufferedReader(new InputStreamReader(System.in)); //Ввести с клавиатуры 10 чисел
        int[] array = new int[10]; // Создать массив на 10 чисел.

        for (int i = 0; i < array.length; i++)   //записать их в массив.
            array[i] = Integer.parseInt(count.readLine());

        //Arrays.sort(array); // Расположить элементы массива в обратном порядке.

        for (int i = array.length-1; i >= 0; i--)
            System.out.println(array[i]); //Вывести результат на экран, каждое значение выводить с новой строки

    }
}
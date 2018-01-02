package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arrayCount = 10;

        String[] words = new String[10];
        int[] digits = new int[arrayCount];

        for (int i = 0; i < arrayCount; i++)
        {
            words[i] = reader.readLine();
            digits[i] = words[i].length();
        }

        for (int i = 0; i < arrayCount; i++)
            System.out.println(digits[i]);
    }
}
/*
* Общение одиноких массивов
1. Создать массив на 10 строк.  +
2. Создать массив на 10 чисел.  +
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
1. Программа должна создавать массив на 10 строк.
2. Программа должна создавать массив на 10 целых чисел.
3. Программа должна считывать строки для массива с клавиатуры.
4. Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.*/
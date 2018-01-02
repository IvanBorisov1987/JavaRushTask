package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader count = new BufferedReader(new InputStreamReader(System.in)); //Ввести с клавиатуры 10 строк

        String[] list = new String[10]; //Создать массив на 10 строк.

        for (int i = 0; i < list.length-2; i++) //Ввести с клавиатуры 8 строк и сохранить их в массив.
        {
            list[i] = count.readLine();
        }
        for (int i = list.length-1; i >= 0; i--)
            System.out.println(list[i]); //Вывести результат на экран, каждое значение выводить с новой строки
    }
}

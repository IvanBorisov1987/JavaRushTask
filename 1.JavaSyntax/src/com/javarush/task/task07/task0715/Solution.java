package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> word = new ArrayList<>();

        /* - Добавление строк в массив - */
        word.add("мама");
        word.add("мыла");
        word.add("раму");

        /* - Добавление выбранной строки после каждой итерации цикла - */
        for (int i = 0; i < word.size(); i++) {
            word.add(++i, "именно");
        }

        /* - Вывод всех элементов массива на печать - */
        for (int i = 0; i < word.size(); i++) {
            System.out.println(word.get(i));
        }
    }
}
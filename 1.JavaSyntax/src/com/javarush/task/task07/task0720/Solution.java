package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //1. Объяви переменную типа список строк и сразу проинициализируй ee.
        ArrayList<String> list = new ArrayList<String>() ;

        int N; // Количество строк в массиве
        int M; // количество первых строк для переноса в конец
        //Ввести с клавиатуры 2 числа N и M.
        String s1 = reader.readLine();
        N = Integer.parseInt(s1);
        String s2 = reader.readLine();
        M = Integer.parseInt(s2);

        // Ввести N строк и заполнить ими список.
        for (int i = 0; i < N; i++) {
            String str = reader.readLine();
            if (str.isEmpty()) break;
            list.add(str);
        }
        // 3. Переставить M первых строк в конец списка.
        Collections.rotate(list, M);

        // 4. Выведи список на экран, каждое значение с новой строки
        for (int i = 0; i < N; i++) {
            System.out.println(list.get(i));
        }
    }
}
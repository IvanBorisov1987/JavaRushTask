package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        //1. Объяви переменную типа ArrayList (список строк) и сразу проинициализируй ee.
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //2. Считай 5 строк с клавиатуры и добавь их в список.
        for (int i = 0; i <5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }
        //3. Удали третий элемент массива.
        strings.remove(2);
        // 4. Выведи элементы на экран, каждый с новой строки.
        // 5. Порядок вывода должен быть обратный.
        for (int i = 0; i < strings.size(); i++)
        {
            int j = strings.size() - i - 1;
            System.out.println( strings.get(j) );
        }
    }
}
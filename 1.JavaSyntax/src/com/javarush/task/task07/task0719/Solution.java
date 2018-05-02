package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 1. Объяви переменную типа список целых чисел и сразу проинициализируй ee.
        ArrayList<Integer> list = new ArrayList<>();
        // 2. Считай 10 целых чисел с клавиатуры и добавь их в список.
        for (int i=0; i < 10; i++) {
            int count = Integer.parseInt(reader.readLine());
            list.add(count);
        }
        // 3. Выведи числа в обратном порядке используя цикл for
        for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - i - 1;
            System.out.println( list.get(j) );
        }
    }
}

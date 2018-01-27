package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

Требования:
3. Программа должна добавлять строки в начало списка.

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        /* -- Инициализируем список строк в массив -- */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        /* -- Цикл добавляет новые строки в начало массива -- */
        for (int i=0;i<10;i++) {
            list.add(0,reader.readLine()); //параметр 0 перед переменной строки с клавиатуры ставит новую строку в начало
        }

        /*  -- Цикл печатает значения из массива с новой строки --  */
        for (int i=0;i<10;i++) {
            System.out.println(list.get(i));
        }

    }
}

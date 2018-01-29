package com.javarush.task.task07.task0709;

/**
 * @author Ivan Borisov
 * @version 0.2
 *
 * **/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list= new ArrayList<>();

        int min = Integer.MAX_VALUE; // переменная считает количество символов в строке

        /*
                 Цикл принимает на чтение строки с клавиатуры
        */

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());

            /*
                    Проверяет что длина строки меньше чем минимум
            */
            if (list.get(i).length() < min )
                min = list.get(i).length();
        }
            /*
            *   выводит на печать самую короткую строку
            *   */
        for (String str: list)
            if (str.length() == min)  /// проверка если есть несколько одинаково коротких строк
                System.out.println(str);

    }
}

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
                 Цикл принмает на чтение строки с клавиатуры
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
            *   выврдит на печать самую короткую строку
            *   */
        for (String str: list)
            if (str.length() == min)  /// проверка если есть несколько одинаково коротких строк
                System.out.println(str);




        /**
         * @author Ivan Borisov
         * @version 0.1 - неверная - не выводит минимумы на печать
         *
         * **/
        /* Создаем объеткы для записи строки с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }


        /* создаем переменную Integer, которая измеряет длину строки элемента массива

        int min = list.get(0).length();  /** @param переменная считает размер строки String.length


        for (int i = 0; i < list.size(); i++) { // итерация цикла #for

            if (list.get(i).length() < min) {
                System.out.print(min);
                min = list.get(i).length();
            }
        }

        /* Выполняем проверку переменной min если несколько строк одинаково коротки

        for (int i =0; i <5; i++) {
            if (min == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }
        */
    }
}

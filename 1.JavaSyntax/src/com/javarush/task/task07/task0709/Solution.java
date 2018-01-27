package com.javarush.task.task07.task0709;

/**
 * @author Ivan Borisov
 * @version 0.1
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
        ArrayList<String> list = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }


        /* создаем переменную Integer, которая измеряет длину строки элемента массива */

        int min = list.get(0).length();  /** @param переменная считает размер строки **/


        for (int i = 0; i < list.size(); i++) { // итерация цикла #for

            if (list.get(i).length() < min) {
                System.out.print(min);
                min = list.get(i).length();
            }
        }

        /* Выполняем проверку переменной min если несколько строк одинаково коротки */
        for (int i =0; i <5; i++) {
            if (min == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }

        //напишите тут ваш код
    }
}

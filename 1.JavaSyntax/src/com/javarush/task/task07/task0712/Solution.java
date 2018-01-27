package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.

3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
*/
public class Solution {
    public static void main(String[] args) throws Exception {


        /* переменные min и max указывают некую допустимую область значений
         * для количества символов, которые могут быть в строке
         * (строк не может быть меньше 0 и вряд ли кто то сможет написать
         * почти 10 000 000 символов)
        */
        int max = 0;
        int min = 9999999;

        int indexMax = 0;
        int indexMin = 0;

        /* -- Инициализируем список строк в массив -- */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }


        /*
        * В первом цикле for делаем проверку на максимальное значение количества символов
        *
        * */
        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() > max) { //если длина стркои больше нуля
                String temp; //временная переменная
                max = list.get(i).length(); //переменной макс присваивается значение длины строки
                temp = list.get(i); //временной переменной присваивается строка
                indexMax = list.indexOf(temp); //индекс равен длине строки
            }
        }


        for (int i = 0; i < 10; i++) {
            if (min > list.get(i).length()) {
                String temp;
                min = list.get(i).length();
                temp = list.get(i);
                indexMin = list.indexOf(temp);
            }
        }

        /* -- Выводим на печать строки --*/
        if (indexMax<indexMin){
            System.out.println(list.get(indexMax));
        }else {
            System.out.println(list.get(indexMin));
        }
    }
}

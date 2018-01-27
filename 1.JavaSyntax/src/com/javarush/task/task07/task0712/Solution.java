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

        int max = 0;
        int min = 9999999;
        int indexMax = 0;
        int indexMin = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() > max) {
                String temp;
                max = list.get(i).length();
                temp = list.get(i);
                indexMax = list.indexOf(temp);
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
        if (indexMax<indexMin){
            System.out.println(list.get(indexMax));
        }else {
            System.out.println(list.get(indexMin));
        }

    /*
        int shorter = Integer.MIN_VALUE;
        int longer = 1;

        if (shorter > longer) {
            System.out.println(longer); //вывод самой короткой строки на экран
        } else {
            System.out.println(shorter); //вывод самой короткой строки на экран
        }
            */
        //напишите тут ваш код
    }
}

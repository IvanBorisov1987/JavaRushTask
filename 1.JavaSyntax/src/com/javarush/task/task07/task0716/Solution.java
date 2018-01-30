package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        /* - Запускаем цикл и прогоняем в него массив -  */
        for (int i = 0; i<list.size(); i++) {

            // а тут происходит магия
            if (list.get(i).contains("р") && list.get(i).contains("л")) { //итерация выделяет слова содержащие р и л
            }

            else if (list.get(i).contains("л")) { //итерация добавляет еще один элемент массива со словом содержащим букву л
                list.add(0,list.get(i));
                i++;
            }

            else if (list.get(i).contains("р")) {  //итерация удаляет один элемент массива со словом содержащим букву р
                list.remove(i);
                i--;
            }

        }
        return list;
    }
}
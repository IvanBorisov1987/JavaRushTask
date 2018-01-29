package com.javarush.task.task07.task0708;

/**
 * @author Ivan Borisov
 * @version 0.1
 *
 * **/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/* 
Самая длинная строка
*/
public class Solution {

    private static List<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {

       BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int max = 0; // в значение переменной записываем длину строки

        /* -- Инициализируем список строк в массив -- */
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            
            /* -- Поиск самой длинный строки циклом -- */
            if (strings.get(i).length() > max) {
                max = strings.get(i).length();
            }
        }
            /* -- Проверка есть ли самые дилынне строки одинаковой длины и вывод на печать такой(-их) строки/строк -- */
            for (String str: strings)
                if (str.length() == max)  /// проверка если есть несколько одинаково коротких строк
                    System.out.println(str);
        }
    }

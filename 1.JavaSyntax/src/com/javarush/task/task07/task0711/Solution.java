package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удалить и вставить
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        /** Цикл #for добавляет строки, введенные с клавиатуры в массив ArrayList **/
        for (int i =0; i < 5; i ++) {
            String sec = reader.readLine();
            list.add(sec);
        }

        /** Удаление последней строки массива строк и перенос удаленной строки в начало массива **/
        for (int i = 0; i < 13; i++) {// Убираем увеличение i внутрь цикла
            list.add(0, list.get(list.size() - 1)); // добавляем строку
            list.remove(list.size() - 1); // Удаляем последнюю строку(-1, так как мы сначала вставили)
        }
        /** Выводим содержимое массива строк на экран, используя цикл #for **/
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

    }
}

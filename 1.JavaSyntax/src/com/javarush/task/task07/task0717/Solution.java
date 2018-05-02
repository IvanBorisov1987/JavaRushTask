package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        // 1. Объяви переменную типа список строк и сразу проинициализируй ee.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        // 2. Считай 10 строк с клавиатуры и добавь их в список.
        for (int i = 0; i <3; i++) {
            //String s = reader.readLine();
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);
        // Вывести на экран result
        for (int i = 0; i < result.size(); i++) {
            System.out.println( result.get(i));
        }
    }
    // 3. Метод doubleValues должен удваивать элементы списка по принципу a,b,c -> a,a,b,b,c,c..
    public static ArrayList<String> doubleValues(ArrayList<String> list) {

        int size = list.size();
            for (int i = 0; i < size; i++) {
                list.add(list.get(i));
                list.add(list.get(i));
            }
        return list;
    }
}

/*
* public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();// Считать строки с консоли и объявить ArrayList list тут
        for (int i=0;i<10;i++) {
            list.add(reader.readLine());
        }
        ArrayList<String> result = doubleValues(list);

        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));// Вывести на экран result
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i=0;i<list.size();i++) {
            list.add(i,list.get(i));
            i++;
        }//напишите тут ваш код
        return null;
    }*/
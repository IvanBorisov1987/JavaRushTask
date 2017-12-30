package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = s+s+s+s+s;
        return result;
    }

    public static String multiply(String s, int count) {
        String result = s;
        for (int i = 1; i < count; i++)
            result = result+s;
        return result;
    }

    public static void main(String[] args) {

    }
}
/*
Амиго -> АмигоАмигоАмигоАмигоАмиго

 Методы класса StringHelper должны возвращать строку.
 Метод multiply(String s, int count) должен возвращать строку повторенную count раз.
 Метод multiply(String s) должен возвращать строку повторенную 5 раз.*/
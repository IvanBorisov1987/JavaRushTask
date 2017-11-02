package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {  ///заменил void чтобы return работал
        double d = i * 0.1;
        double p = i + d;/// добавил формулу
        return p;

    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}

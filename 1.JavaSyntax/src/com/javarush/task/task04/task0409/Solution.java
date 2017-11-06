package com.javarush.task.task04.task0409;
/*
Ближайшее к 10
*/
public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
        int c = abs(10 - a); ///Переменная считает разницу между 10 и a
        int d = abs(10 - b); /// Переменная считает разницу между 10 и b
        if (c > d)
            System.out.println(b);
        else
            System.out.println(a);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
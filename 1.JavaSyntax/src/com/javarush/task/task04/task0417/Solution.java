package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);//напишите тут ваш код
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a==b && b==c)
            System.out.println(a + " " + b + " " + c);
        if (a==b && b!=c)
            System.out.println(a + " " + b);
        if (b==c && c!=a)
            System.out.println(b + " " + c);
        if (c==a && a!=b)
            System.out.println(c + " " + a);
    }
}
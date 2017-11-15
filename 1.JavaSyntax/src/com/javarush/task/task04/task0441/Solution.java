package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a+b+c)-max(max(a, b), c) - min(min(a, b), c));
    }
    static int max(int a, int b){
        if (a>=b) return a;
        else return b;
    }
    static int min(int a, int b){
        if (a<=b) return a;
        else return b;//напишите тут ваш код
    }
}

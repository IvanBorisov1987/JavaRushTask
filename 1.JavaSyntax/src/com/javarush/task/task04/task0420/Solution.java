package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        /* решение через массив
        int mass[]={a,b,c};
        Arrays.sort(mass);
        for (int i=0;i<mass.length;i++){
            System.out.print(mass[i]+" ");
        }*/

         ///решение через мин/макс
        int num1 = (Math.max(a, Math.max(b, c)));
        int num3 = (Math.min(a, Math.min(b, c)));
        int num2 = (a + b + c) - (num1 + num3);
        System.out.println(num1 + " " + num2 + " " + num3);

    }
}

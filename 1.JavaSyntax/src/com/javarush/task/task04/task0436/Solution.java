package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int m = sc1.nextInt();
        int n = sc2.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print(8);
            }
            System.out.println("");

        }

    }
}

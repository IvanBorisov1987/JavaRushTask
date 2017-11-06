package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0) {
            a = a*2;
            System.out.println(a);
        } else if (a < 0) {
            a = a+1;
            System.out.println(a);
        }
        else {
            System.out.println(a);
        }

    }

}
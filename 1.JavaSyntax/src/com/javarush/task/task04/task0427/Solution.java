package com.javarush.task.task04.task0427;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a>=1 && a<=999)
            if (a%2==0 && a>0 && a<10)
            System.out.println("четное однозначное число");

        if (a%2!=0 && a>0 && a<10)
            System.out.println("нечетное однозначное число");

        if (a%2==0 && a>9 && a<100)
            System.out.println("четное двузначное число");

        if (a%2!=0 && a>9 && a<100)
            System.out.println("нечетное двузначное число");

        if (a%2==0 && a>99 && a<1000)
            System.out.println("четное трехзначное число");

        if (a%2!=0 && a>99 && a<1000)
            System.out.println("нечетное трехзначное число");
        }
    }


package com.javarush.task.task05.task0507;

/*
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double count = 0;


        while (true) {
            double a = scanner.nextDouble();

            if (a != -1) {
                sum += a;
                count++;

            } else {
                System.out.print(sum/count);
                break;
            }
        }
    }
}
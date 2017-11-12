package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        String ne = sc1.nextLine();
        int n = sc.nextInt();

        while (n > 0) {
            System.out.println(ne);
            n--;
        }

    }
}

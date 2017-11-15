package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while(true){
            int a = scanner.nextInt();
            i += a;
            if(a == -1){
                System.out.println(i);
                break;
            }
        }
    }
}

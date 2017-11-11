package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String name = reader.readLine();
        int age = sc.nextInt();

        if (age < 18){
            System.out.println("ПОдрасти еще");
        } else {
            System.out.println(name +" " + age);
        }
    }
}

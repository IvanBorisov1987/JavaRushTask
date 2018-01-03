package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader count = new BufferedReader(new InputStreamReader(System.in));
        int[] nBig = new int[20];
        int[] n1 = new int[10];
        int[] n2 = new int[10];


         for (int i = 0; i < 20; i++)
             nBig[i] = Integer.parseInt(count.readLine());
         for (int i = 0; i < 10; i++) {
             n1[i] = nBig[i];
             n2[i] = nBig[i + 10];
             System.out.println(n2[i]);
         }
    }
}

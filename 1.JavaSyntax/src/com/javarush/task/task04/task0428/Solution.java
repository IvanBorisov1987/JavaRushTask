package com.javarush.task.task04.task0428;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a>0 && b>0 && c>0)
            System.out.println(3);

        else if (a<1 && b>0 && c>0 || a>0 && b<1 && c>0 || a>0 && b>0 && c<1)
            System.out.println(2);

        else if (a<=0 && b<=0 && c<=0)
            System.out.println(0);

        else
            System.out.println(1);
    }
}

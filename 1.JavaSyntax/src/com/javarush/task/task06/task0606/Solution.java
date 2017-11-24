package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even=0;
    public static int odd=0;

    public static void main(String[] args) throws IOException {
        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        for (int i=0; i<s.length();i++){
            if (Character.getNumericValue(s.charAt(i))%2==0)
                even++;
            else odd++;
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
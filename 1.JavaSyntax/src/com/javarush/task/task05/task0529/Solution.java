package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        boolean numbers = false;
        int sum = 0;
        while(!numbers){
            String line = buffer.readLine();
            if (line.equals("сумма"))
                numbers = true;
            else {
                int num = Integer.parseInt(line);
                sum += num;
            }
        }
        System.out.println(sum);
    }

}

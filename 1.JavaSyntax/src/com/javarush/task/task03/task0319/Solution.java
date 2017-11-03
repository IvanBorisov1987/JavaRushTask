package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine();
        String sMoney = bufferedReader.readLine();
        String sAge = bufferedReader.readLine();
        System.out.println(name + " получает " + sMoney + " через " + sAge + " лет.");
    }
}

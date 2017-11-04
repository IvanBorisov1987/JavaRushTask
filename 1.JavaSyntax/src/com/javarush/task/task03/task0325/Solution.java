package com.javarush.task.task03.task0325;

import java.io.*;
import java.util.Scanner;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine();
        System.out.println("Я буду зарабатывать $"+name+" в час");
    }
}

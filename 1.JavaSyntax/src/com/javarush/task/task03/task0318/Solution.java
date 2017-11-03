package com.javarush.task.task03.task0318;
/* 
План по захвату мира
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {  /// странный метод, почему то Scanner не прошел, но позволяет считывать строку
                InputStream inputStream = System.in;
                Reader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String name = bufferedReader.readLine();
                System.out.println(name + " з12арабатывает");
    }
}
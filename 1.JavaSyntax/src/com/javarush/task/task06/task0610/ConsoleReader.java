package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = reader.readLine();
        return read;
    }

    public static int readInt() throws Exception {
        BufferedReader ri = new BufferedReader(new InputStreamReader(System.in));
        int readint = Integer.parseInt(ri.readLine());
        return readint;
    }

    public static double readDouble() throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        double readdouble = Double.parseDouble(rd.readLine());
        return readdouble;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
        boolean readboolean = Boolean.parseBoolean(rb.readLine());
        return readboolean;
    }

    public static void main(String[] args) {

    }
}
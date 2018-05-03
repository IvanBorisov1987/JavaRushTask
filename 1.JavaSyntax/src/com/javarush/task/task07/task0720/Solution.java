package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>() ;

        int N;
        int M;

        String s1 = reader.readLine();
        N = Integer.parseInt(s1);
        String s2 = reader.readLine();
        M = Integer.parseInt(s2);

        for (int i = 0; i < N; i++) {
            String str = reader.readLine();
            if (str.isEmpty()) break;
            list.add(str);
        }

        Collections.rotate(list, list.size() - M);

        for (int i = 0; i < N; i++) {
            System.out.println(list.get(i));
        }
    }
}
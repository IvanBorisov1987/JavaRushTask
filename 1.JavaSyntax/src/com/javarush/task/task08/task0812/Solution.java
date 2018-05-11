package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        int temp = 1;
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < list.size(); i++) {
            if (Integer.valueOf(list.get(i-1)).equals(Integer.valueOf(list.get(i)))) {
                count++;
                if (count > temp) {
                    temp = count;
                }
            } else count = 1;
        } System.out.println(temp);

    }
} /*
Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке. */
package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name = "S";
        int i=0;
        int j = 0;

        while (i<10) {
            while (j<10) {
                System.out.print(name);
                j++;
            }
            System.out.println("");
            j = 0;
            i++;
        }//напишите тут ваш код

    }
}

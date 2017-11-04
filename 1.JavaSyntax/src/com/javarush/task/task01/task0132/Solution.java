package com.javarush.task.task01.task0132;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sot = number/100;
        int des = (number-sot*100)/10;
        int ed = number-(sot*100+des*10);
        return sot+des+ed;
    }
}
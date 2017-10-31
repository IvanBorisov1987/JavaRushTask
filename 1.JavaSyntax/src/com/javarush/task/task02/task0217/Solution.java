package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {

        int x = min(a, b);
        int v = min(c, d);
        return min(v, x);//напишите тут ваш код
    }

    public static int min(int a, int b) {
        int m = Math.min(a, b);
        return m;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}
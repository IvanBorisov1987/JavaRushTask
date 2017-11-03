package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 11; j++){
                if (j-1 == 10)
                    System.out.println("");
                else
                    System.out.print(i * j + " ");
            }
        }
    }
}
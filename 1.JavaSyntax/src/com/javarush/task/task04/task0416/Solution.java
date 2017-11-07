package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        ///float green,red,yellow;  /// 3 мин зеленый 1 мин желтый 1 мин красный

        /// можно реализовать через if else а можно через цикл f*/or - церез деление с остатком на размер цикла

         /* Данная версия через ветвление не работает
         if (t==4 || t==9 || t==14 || t==19 || t==24 || t==29 || t==34 || t==39 || t==44 || t==49 || t==54 || t==59) {
             System.out.println("Желтый");
         } else if (t==5 || t==10 || t==15 || t==20 || t==25 || t==30 || t==35 || t==40 || t==45 || t==50 || t==55) {
             System.out.println("Красный");
         } else  {
             System.out.println("Зеленый");
        }*/
        /// Версия через цикл do--while
        if (a>6)
        do {
            a=a-5.0;
        }while(a>6.0);

        if (a<3.0)
            System.out.println("зеленый");
        else if (a>=3.0 & a<4.0)
            System.out.println("желтый");
        else
            System.out.println("красный");



    }
}
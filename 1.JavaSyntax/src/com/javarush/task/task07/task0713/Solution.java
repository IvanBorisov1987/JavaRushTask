package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/* 
Играем в Jолушку
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
7. Программа должна вывести три дополнительных списка, используя метод printList.
*/
public class Solution {
    public static void main(String[] args) throws Exception {


        ArrayList<Integer> list = new ArrayList<>();  // Главный массив
        ArrayList<Integer> div_by3 = new ArrayList<>(); // Второстепенный массив 1 - Число нацело делится на 3 (x%3==0)
        ArrayList<Integer> div_by2 = new ArrayList<>(); // Второстепенный массив 2 - Число нацело делится на 2 (x%3==0)
        ArrayList<Integer> other = new ArrayList<>();  // Второстепенный массив 3 - прочие

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int in;  // Переменная для челочисленных значений, вводимых с клавиатуры

        for (int i = 0; i < 20; i++) {  //цикл for добавляет 20 чисел в главный массив
            in = Integer.parseInt(reader.readLine());
            list.add(in); // все значения добавляются в главный массив

            /** - Здесь указываются параметры сортировки массива на остальные -**/
            if (in % 3 == 0)  //если челочисленное значение делится на 3 добавляем в 1 массив
                div_by3.add(in);

            if (in % 2 == 0) //если челочисленное значение делится на 2 добавляем в 2 массив
                div_by2.add(in);

            if (in % 3 != 0 && in % 2 != 0) //если челочисленное значение не соответствует первым двум требованиям добавляем в 3 массив
                other.add(in);
        }
    }

    public static void printList(List<Integer> list) {
        for (int i=0; i<list.size();i++) {  //проверяем чтобы итераций цикла было не больше чем длина массива
            System.out.println(list.get(i));
        }
    }
}

// В программе нет вывода на экран списков из трех дополнительных массивов - ДОБАВИТЬ!!!!!!
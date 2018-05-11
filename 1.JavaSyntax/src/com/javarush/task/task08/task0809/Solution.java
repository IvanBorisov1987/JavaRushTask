package com.javarush.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) {
        Date startCompile = new Date();
        insert10000(list);
        Date endCompile = new Date();
        long msDelay = endCompile.getTime() - startCompile.getTime();
        return msDelay;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
/* Время для 10 тысяч вставок
Метод getTimeMsOfInsert должен вернуть время своего исполнения в миллисекундах.
5. Метод getTimeMsOfInsert должен вернуть время в миллисекундах, которое занимает 10 тысяч вставок в список. */
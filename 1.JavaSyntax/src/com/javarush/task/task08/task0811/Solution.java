package com.javarush.task.task08.task0811;

import java.util.*;

public class Solution {
    // 3. Метод getListForGet должен возвращать список, который лучше всего подходит для операции взятия элемента.
    public static List getListForGet() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i < list.size(); i++)
            list.set(i, 0);
        return list;
    }

     // 4. Метод getListForSet должен возвращать список, который лучше всего подходит для установки значения элемента.
    public static List getListForSet() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
            list.set(i, 0);
        return list;
    }

    // 5. Метод getListForAddOrInsert должен возвращать список,
    // который лучше всего подходит для операций добавления или вставки элемента.
    public static List getListForAddOrInsert() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < list.size(); i++)
            list.add(i, 0);
        return list;
    }
    //  6. Метод getListForRemove должен возвращать список, который лучше всего подходит для операции удаления элемента
    public static List getListForRemove() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < list.size(); i++)
            list.clear();
        return list;
    }

    public static void main(String[] args) {

    }
}
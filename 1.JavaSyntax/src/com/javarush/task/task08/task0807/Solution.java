package com.javarush.task.task08.task0807;

import java.util.*;

public class Solution {
    public static Object createArrayList() {
        ArrayList<String> list = new ArrayList<>();
        return list;
    }

    public static Object createLinkedList() {
        LinkedList<String> list = new LinkedList<>();
        return list;
    }

    public static void main(String[] args) {
        createArrayList();
        createLinkedList();
    }
}
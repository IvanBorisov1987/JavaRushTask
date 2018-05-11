package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*  Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set */
public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }
    // 4. Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++)
            list.add(i,0);
    }
    // 5. Метод get10000(List list) должен вызывать 10 тысяч раз get у списка.
    public static void get10000(List list) {
        for (int i = 0; i < 10000; i++)
            list.get(i);
    }
    // 6. Метод set10000(List list) должен вызывать 10 тысяч раз set у списка.
    public static void set10000(List list) {
        for (int i = 0; i < 10000; i++)
            list.set(i,0);
    }
    //7. Метод remove10000(List list) должен удалять 10 тысяч элементов из списка.
    public static void remove10000(List list) {
        for (int i = 0; i < 10000; i++)
            list.removeAll(list);
            //list.clear();
            //list.remove(i);
    }
}
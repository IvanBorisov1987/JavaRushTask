package com.javarush.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static Set<String> createSet() {
        Set<String> list = new HashSet<>();
        list.add("Ленька"); // 1
        list.add("Лемур"); // 2
        list.add("Лядски"); // 3
        list.add("Луна"); // 4
        list.add("Лего"); // 5
        list.add("Латекс"); // 6
        list.add("Латынь"); // 7
        list.add("Лазить"); // 8
        list.add("Лизать"); // 9
        list.add("Лиса"); // 10
        list.add("Лысый"); // 11
        list.add("Лицо"); // 12
        list.add("Луч"); // 13
        list.add("Ляля"); // 14
        list.add("Лес"); // 15
        list.add("Лузгать"); // 16
        list.add("Лезгинка"); // 17
        list.add("Ленин"); // 18
        list.add("Ливерпуль"); // 19
        list.add("Лиссабон"); // 20

        return list;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
/*20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".

5. Множество из метода createSet() должно содержать 20 слов на букву «Л».*/
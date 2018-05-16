package com.javarush.task.task08.task0816;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Solution {
    public static HashMap<String, Date> createMap() {

        SimpleDateFormat
        HashMap<String, Date> map = new HashMap<String, Date>();

        map.put("Stallone", new Date("JUNE 1 1980")); // 1
        map.put("ShvarzNiger", new Date("JULE 2 1981")); // 2
        map.put("DeNiro", new Date("Mart 4 1975")); // 3
        map.put("Roberts", new Date("January 21 1970")); // 4
        map.put("AlPachino", new Date("April 7, 1960")); // 5
        map.put("Norris", new Date("February 31 1001")); // 6
        map.put("Li", new Date("May 3 1963")); // 7
        map.put("Chan", new Date("AUGUST 8 1973")); // 8
        map.put("Sigal", new Date("AUGUST 22 1945")); // 9
        map.put("Girr", new Date("February 8 1962")); // 10

        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        for (int i = 0; i < map.size(); i++)
            if (map.values(i) == "JUNE" || map.values(i) == "JULE" || map.values(i) == "AUGUST") {
            map.remove(i,i);
            } else
                break;

    }

    public static void main(String[] args) {

    }
}

/* Добрая Зинаида и летние каникулы
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.*/
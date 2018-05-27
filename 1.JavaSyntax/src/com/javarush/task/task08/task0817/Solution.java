package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Иван");
        map.put("Иванов", "Буся");
        map.put("Каушкин", "Пися");
        map.put("Пушкин", "Артем");
        map.put("Иванов", "Иван");
        map.put("Сидоров", "Сергей");
        map.put("Булыжников", "Хуй");
        map.put("РОдичев", "Курлай");
        map.put("Черезплечев", "Ушлый");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
/*
Удалить людей, имеющих одинаковые имена.
Требования:
5. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
6. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Woman woman1 = new Woman("Liz", 32, "Minsk");
        Woman woman2 = new Woman("All", 31, "Slyavians");
        System.out.println(woman1);
        System.out.println(woman2);

        Man man1 = new Man("Vasa", 21, "Orel");
        Man man2 = new Man("Sasha", 23, "Moscow");
        System.out.println(man1);
        System.out.println(man2);
    }

    public static class  Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString()
        {
            return (name + " " + age + " " + address);
        }

    }


    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString()
        {
            return (name + " " + age + " " + address);
        }
    }
    //напишите тут ваш код
}

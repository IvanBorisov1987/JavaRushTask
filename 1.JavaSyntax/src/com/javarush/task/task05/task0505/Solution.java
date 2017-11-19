package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska",3,12,32);
        Cat cat2 = new Cat("Petr",2,13,30);
        Cat cat3 = new Cat("Boris", 4,15,35);


        System.out.println("Победил Vaska? - " + cat1.fight(cat2));
        System.out.println("Победил Petr? - " + cat2.fight(cat3));
        System.out.println("Победил Boris? - " + cat3.fight(cat1));

    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}

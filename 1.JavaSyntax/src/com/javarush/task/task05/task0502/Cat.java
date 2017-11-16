package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat vinner = new Cat();

        cat1.name = "Vasya";
        cat1.age = 3;
        cat1.strength = 25;
        cat1.weight = 18;

        cat2.name = "Barsik";
        cat2.age = 4;
        cat2.strength = 30;
        cat2.weight = 17;

        

        return vinner;
    }

    public static void main(String[] args) {

    }
}

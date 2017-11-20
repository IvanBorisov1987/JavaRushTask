package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name, address;
    String color = "black";
    int age = 3;
    int weight = 12;


    public Cat(String name){
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    public Cat(String name, int age){
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    public Cat(int weight, String color){
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    public Cat(int weight, String color, String address){
        this.address = address;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public static void main(String[] args) {

    }
}

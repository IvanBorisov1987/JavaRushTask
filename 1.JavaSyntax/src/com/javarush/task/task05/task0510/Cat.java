package com.javarush.task.task05.task0510;
/*
Создать класс Cat (кот) с пятью инициализаторами:
— Имя,
— Имя, вес, возраст
— Имя, возраст (вес стандартный)
— вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
— вес, цвет, адрес (чужой домашний кот)

Задача инициализатора – сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста.
А вот имени может и не быть (null).
То же касается адреса: null.

Требования:
7. У класса должен быть метод initialize, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
8. У класса должен быть метод initialize, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
9. У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
10. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
11. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
*/

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;

    public void initialize(String name) {
        this.name = "Vasya";
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public void initialize(String name, int weight, int age) {
        this.name = "Vasya";
        this.weight = 13;
        this.age = 2;
        this.color = color;
    }

    public void initialize(String name, int age) {
        this.name = "Vasya";
        this.weight = weight;
        this.age = 2;
        this.color = color;
    }

    public void initialize(int weight, String color) {
        this.weight = 13;
        this.age = age;
        this.color = "brown";
    }

    public void initialize(int weight, String color, String address) {
        this.weight = 13;
        this.age = age;
        this.color = "brown";
        this.address = "Бездомный";
    }

    public static void initialize(String[] args) {

    }
}

package com.javarush.task.task07.task0724;
/* 
Семейная перепись
*/
public class Solution {
    public static void main(String[] args) {
        // Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
        // Объект без отца и матери
        Human grandfather1 = new Human("Иван", true, 19);
        Human grandfather2 = new Human("Андрей", true, 21);
        Human grandmother1 = new Human("Татьяна", false, 18);
        Human grandmother2 = new Human("Маргарита", false, 22);
        // Объект с отцом и матерью
        Human father = new Human("Анатолий", true, 16, grandfather1, grandmother1);
        Human mother = new Human("Ольга", false, 20, grandfather2, grandmother2);
        Human son1 = new Human("Иван", true, 3, father, mother);
        Human son2 = new Human("Евгений", true, 5, father, mother);
        Human son3 = new Human("Павел", true, 1, father, mother);

        // Выведи созданные объекты на экран.
        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);
    }

    // Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human)
    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        // Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human)
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        // Добавить в класс конструктор public Human(String name, boolean sex, int age).
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
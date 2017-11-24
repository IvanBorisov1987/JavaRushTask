package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    public Cat() //конструктор
    {
        this.catCount++;
    }//напишите тут ваш код


    protected void finalize() throws Throwable
    {
        Cat.catCount--;
    }

    public static void main(String[] args) {

    }
}
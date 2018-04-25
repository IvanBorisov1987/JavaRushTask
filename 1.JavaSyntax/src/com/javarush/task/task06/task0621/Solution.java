package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 
Родственные связи кошек
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);


        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);


        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catDaughter);
        System.out.println(catSon);


    }

    public static class Cat {
        private String name;
        private Cat parentMother;
        private Cat parentFather;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentMother, Cat parentFather) {
            this.name = name;
            this.parentMother = parentMother;
            this.parentFather = parentFather;
        }

        @Override
        public String toString() {
            if (parent == null)
                return "Cat name is " + name + ", no mother ";
            else
                return "Cat name is " + name + ", mother is " + parent.name;
        }
    }
}
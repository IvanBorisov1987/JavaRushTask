package com.javarush.task.task06.task0605;
import java.io.*;
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());
        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            //напишите тут ваш
            double massIndex = weight/(height*height);
            if (massIndex < 18.5) {
                System.out.print("Недовес: меньше чем 18.5");
            } else if (massIndex >= 18.5 && massIndex <= 24.9 ) {
                System.out.print("Нормальный: между 18.5 и 24.9");
            }
            else if (massIndex > 24.9 && massIndex <= 30.0 ) {
                System.out.print("Избыточный вес: между 25 и 29.9");
            }
            else if (massIndex > 30.0 ) {
                System.out.print("Ожирение: 30 или больше");
            }
        }
    }
}
/*Программа должна считывать введенные пользователем вес в килограммах и рост в метрах и выводить на экран сообщение о индексе массы тела.
Реализуй статический метод класса Body. Метод должен определить индекс массы тела, и вывести на экран сообщение:
Подсказка:
Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)
Пример вывода для 68.4 и 1.77:
Нормальный: между 18.5 и 24.9 */
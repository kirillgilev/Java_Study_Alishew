package org.rzampei.lesson_7;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //класс Scanner, new Scanner - создаем новый объект класса Scanner, затем задаем входной поток данных (System.in).
        System.out.println("Введите ваше имя: ");
        String string = s.nextLine();
        System.out.println("Вы ввели имя: " + string);
    }
}

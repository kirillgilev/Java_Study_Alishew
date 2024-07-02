package org.rzampei.lesson_8;

import java.util.Scanner;

public class DoWhileV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем переменную класса Scanner и ссылаем ее на объект класса Scanner.
                                                  // В параметры мы задаем входной поток System.in
        System.out.println("Введите число 5: ");  // Выводим сообщение на экран с помощью метода println() класса System.
        int value = scanner.nextInt();    // Создаем переменную типа int и ссылаем ее на ввод с клавиатуры с помощью метода nextInt() класса Scanner.
        while (value != 5 ){
            System.out.println("Введите число 5: ");
            value = scanner.nextInt(); // Переменной value присваивается ввод с клавиатуры с помощью метода nextInt() класса Scanner.
        }
        System.out.println("Вы ввели число " + value);

    }
}

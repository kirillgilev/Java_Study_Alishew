package org.rzampei.lesson_8;

import java.util.Scanner;

public class DoWhileV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;                         // Декларируем переменную value типа int
        do {                               //По сравнению с циклом while, цикл do while выполняется хотя бы один раз.
            System.out.println("Введите 5");
            value = scanner.nextInt();
        } while(value != 5);

        System.out.println("Вы ввели число 5");


    }
}

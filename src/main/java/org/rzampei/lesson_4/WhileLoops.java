package org.rzampei.lesson_4;

import org.rzampei.lesson_1.HelloWorld;

public class WhileLoops {
    public static void main(String[] args) {
        int value = 0;
        while(value < 5){ // Цикл while выполняется, пока условие истинно ( до тех пор, пока value меньше 5)
            System.out.println("Hello " + value);
            value = value + 1;

        }
    }
}

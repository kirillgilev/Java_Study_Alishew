package org.rzampei.lesson_3;


//Ссылочные типы данных

// string - строка
// имя произвольное s
// "Hello" что мы читаем строкой


public class Strings {
    public static void main(String[] args) {
        int x = 5; // примитивный тип данных хранит в себе как коробка - значение
        String s = "Hello"; // String является классом, поэтому пишется с большой, соответственно с конвенцией Java.
                            // а здесь переменная s ссылается на объект, который хранит в себе строку "Hello"

        // простейшая операция со стороками
        // добавим строки space, name
        String space = " ";
        String name = "Roman";
        //чтобы объединить все эти сроки используется оператор +

        System.out.println(s + space + name);
        System.out.println("Hello"+ " " + "John");
        System.out.println("My number is " + space + x);
    }

}

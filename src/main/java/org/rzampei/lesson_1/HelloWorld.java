package org.rzampei.lesson_1;
//Классы - это составные части программы.

//Создаем новый java class с расширением.java.
//В классе есть методы. Методы - это функции (действия)

//С метода main начинают работу программы. Все другие методы вызываются в теле метода main.
//Программа будет выводить на экран Hello World!
public class HelloWorld {
    public static void main(String[] args) { //метод имеет параметры String[] args
                                             //метод имеет тело. Тело метода содержит все инструкции, которые будут выполняться.
                                             //метод всегда должен быть внутри класса
        System.out.println("Hello World!");  //это системный метод, который выводит на экран надпись, которую мы задаем в кавычках.
    }                                        //этот метод возьмет данные, которые были заданы ему в параметрах и выведет их в консоль

    // после компиляции Java-файл, который представляет из себя код, понятный человеку, будет переведен в байт-код, который понятен уже компьютеру.
    //так как компьютер не понимает человеческий язык
}



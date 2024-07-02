package org.rzampei.lesson_6;

public class If {
    public static void main(String[] args) {
        int x = 15;

        if(x < 10){
            System.out.println("да, верно.");
        } else if (x>20) {
            System.out.println("нет, неверно.");
        }else {
            System.out.println("ни один из предыдущих случаев.");
        }
    }
}

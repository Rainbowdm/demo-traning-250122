package com.company;

// Цена яблок
public class Main {

    public static void main(String[] args) {
        Apple appleRed = new Apple();
        appleRed.addPrice(50);
        Apple apple = new Apple();
        apple.addPrice(100);
        Apple apple1 = new Apple();
        apple.addPrice(51);
        System.out.println("Стоимость яблок " + Apple.applePrice);
    }

    public static class Apple {
        public static int applePrice = 0;

        public static void addPrice(int applesPrice) {
            Apple.applePrice = Apple.applePrice + applesPrice;
            Apple.applePrice = Apple.applePrice + applesPrice;
            System.out.println("Стоимость " + applesPrice);
        }
    }

}

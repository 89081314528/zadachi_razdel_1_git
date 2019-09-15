package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("задание 1.4");
        int a = 5;
        int b = 9;
        int c = a + b;
        System.out.println(c);

        System.out.println("задание 1.5");
        double x = 7.5;
        double q = x * 2;
        double w = x * 3;
        System.out.println(q);
        System.out.println(w);

        System.out.println("задание 1.6");
        int e = 4;
        int r = 7;
        if (e < 0 || e > 9) {
            System.out.println("переменная должна быть целая от 0 до 9");
            return;
            }
        if (r < 0 || r > 9) {
            System.out.println("переменная должна быть целая от 0 до 9");
            return;
            }
        int t = e * 10 + r;
        System.out.println(t);

        System.out.println("задание 1.7");
        double y = 8;
        double u = y / 3;
        System.out.println(u);
        int i = 8;
        double o = i / 3;
        System.out.println(o);
    }
}

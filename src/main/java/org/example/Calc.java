package org.example;

public class Calc {
    public int addition(int a, int b){
        int result;
        result = a + b;
        System.out.printf("Сумма %d и %d равна %d\n", a,b, result);
        System.out.println("Сумма " + a + " и " + b + " равна " + result);
        return result;
    }

    public int subscription(int a, int b){
        int result;
        result = a - b;
        System.out.println("Разность " + a + " и " + b + " равна " + result);
        System.out.printf("Разность %d и %d равна %d\n", a,b, result);
        return result;
    }

}

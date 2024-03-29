package ru.safin.homework08.task01;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {

    double a;
    double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static double plus(double a, double b) {
        double plus;
        plus = a + b;
        return plus;
    }

    public static double minus(double a, double b) {
        double minus;
        minus = a - b;
        return minus;
    }

    public static double multiply(double a, double b) {
        double multiply;
        multiply = a * b;
        return multiply;
    }

    public static double division(double a, double b) {
        double division;
        division = a / b;
        return division;
    }

    public static double percent(double a, double b) {
        double p;
        p = (a / b) * 100;
        return p;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите первое число: ");
        double a = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double b = sc.nextDouble();
        System.out.println("Введите оперцию: ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                final double plus = Calculator.plus(a, b);
                System.out.println("Результат: " + plus);
            break;
            case '-':
                final double minus = Calculator.minus(a, b);
                System.out.println("Результат: " + minus);
            break;
            case '*':
                final double multiply = Calculator.multiply(a, b);
                System.out.println("Результат: " + multiply);
            break;
            case '/':
                final double division = Calculator.division(a, b);
                System.out.println("Результат: " + division);
            break;
            case '%':
                final double percent = Calculator.percent(a, b);
                System.out.println("Результат: " + percent);
            break;
            default: throw new Error("Оператор не определен");
        }
    }
}

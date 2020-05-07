/**
 * Задача: Имеется массив, нужно переставить элементы массива в обратном порядке.
 * Задачу не зачитывать если использованы утильные методы класса Arrays.
 * Решением также не являются манупуляции с выводом массива. Необходимо действительно перемещать элементы.
 * Вывести массив в консоль до и после вызова метода по реверсу массива
 */

package ru.safin.task27;

public class Task27 {
    public static void main(String[] args) {
        myMassive(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    public static void myMassive(int[] array) {

        System.out.println("Вывод массива:");
        for (int value : array) {
            System.out.printf("%d\t", value);
        }

        System.out.println();

        System.out.println("Вывод массива в обратном порядке:");
        int length = array.length;
        int tmp;
        for (int i = 0; i < length/2; i++) {
            tmp = array[length - i - 1];
            array[length - i - 1] = array[i];
            array[i] = tmp;
        }
        for (int value : array) {
            System.out.printf("%d\t", value);
        }
    }
}

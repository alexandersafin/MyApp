/**
 * Дан двумерный массив. Задача – написать метод
 * public void toLeft() {}
 * 1.Пройти с 1-ой до последней строки
 * 2.Пройти с 1-го до предпоследнего элемента
 * 3.В текущую ячейку поместить значение следующей
 * 4.Последнему элементу присвоить 0
 */

package ru.safin.task26;

import java.util.Arrays;

public class Task26 {
    public static void toLeft(int[][] array) {

        System.out.println("Пройти с 1-ой до последней строки:");
        for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {
               System.out.printf("%d\t", array[i][j]);
           }
           System.out.println();
        }

        System.out.println();

        System.out.println("Пройти с 1-го до предпоследнего элемента:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                System.out.printf("%d\t", array[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("В текущую ячейку поместить значение следующей:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                System.out.printf("%d\t", array[i][j+1]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        toLeft(new int[][]{
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        });
    }
}

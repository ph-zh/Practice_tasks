/*
Золотая классика задачек на программирование! Напишите программу, которая для чисел,
кратных 3, печатает «Яндекс», для чисел, кратных 5 — «Практикум», а для чисел,
кратных одновременно 3 и 5 — «Яндекс.Практикум». В других случаях программа должна
печатать само число.
 */
package javaCore1.primitiveDataTypesAndOperators.task5;

public class Praktikum {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0 && i % 5 !=0) {
                System.out.println("Яндекс"); // Решение должно быть в теле цикла
            } else if (i % 5 == 0 && i % 3 !=0) {
                System.out.println("Практикум");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Яндекс.Практикум");
            } else {
                System.out.println(i);
            }
        }
    }
}
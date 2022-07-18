/*
Бесконечный цикл while (true) с прерыванием break применяется для решения достаточно ограниченного
спектра задач. Чаще всего его удобнее заменить на цикл while с условием. Потренируйтесь это делать.
Эта программа с помощью бесконечного цикла суммирует числа, которые вводит пользователь.
Она работает до тех пор, пока не будет введён 0. Перепишите её, заменив бесконечный цикл
на цикл while с условием.
 */
package introduction.javaBasics_loops.task12;

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Сумма
        int input = 1; // Ввод пользователя

        while (input != 0) {
            input = scanner.nextInt();
            sum = sum + input;
        }
        System.out.println("Сумма введённых чисел: " + sum);
    }
}

/*
Pre-code with different way of task solving

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Сумма
        int input; // Ввод пользователя

        while (true) {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            sum = sum + input;
        }
        System.out.println("Сумма введённых чисел: " + sum);
    }
}
*/
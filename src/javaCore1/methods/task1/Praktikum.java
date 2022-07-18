/*
Вам нужно запрограммировать робота, который должен познакомиться с пользователем,
поздороваться с ним в зависимости от времени суток и поздравить с успехами в программировании.
Для этого нужно объявить и реализовать такие методы:
Метод welcomeUserByName() должен спрашивать у пользователя имя, а потом сообщать, что рад знакомству.
Метод sayHelloByTime() должен спрашивать у пользователя время и в зависимости от ответа печатать
приветствие. Начиная с 22 часов вечера и до 6 утра не включительно — "Доброй ночи!".
Начиная с 6 и до 12 не включительно — "Доброе утро!", с 12 до 18 (не включительно) —
"Добрый день!", а с 18 до 22 (не включительно) — "Добрый вечер!".
Третий метод printSuccess() должен печать только одну строку — "У вас уже неплохо получается
программировать!".
 */
package javaCore1.methods.task1;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v1.0.");
    }

    public static void welcomeUserByName() { // Объявите ниже метод welcomeUserByName
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine(); // Сохраните введённое пользователем имя в переменную name
        System.out.println("Рад познакомиться, " + name + "!");
    }

    // Объявите метод sayHelloByTime
    // Спросите у пользователя "Который час?" и сохраните ответ в переменную currentHour
    // В зависимости от времени предусмотрите печать приветствий

    public static void sayHelloByTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();

        if (currentHour < 6) {
            System.out.println("Доброй ночи!");
        } else if (currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour < 18) {
            System.out.println("Добрый день!");
        } else if (currentHour >= 22) {
            System.out.println("Доброй ночи!");
        } else {
            System.out.println("Добрый вечер!");
        }
    }
    // Объявите метод printSuccess
    // Он должен печатать строку: У вас уже неплохо получается программировать!
    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }
}
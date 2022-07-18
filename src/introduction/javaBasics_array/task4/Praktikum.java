/*
Банк разрабатывает для своих клиентов валютный кошелёк для путешествий.
Базово в нём собраны всё те же четыре валюты: доллары, евро, иены и рубли.
Однако в зависимости от того, в какую страну отправляется клиент банка,
валюты можно будет менять. Пока доступных опций немного: при поездке в
Данию евро можно поменять на кроны, а при поездке в Китай иены на юани.
Допишите программу таким образом, чтобы она сначала спрашивала у пользователя,
куда он планирует отправиться, в Данию или Китай, и в зависимости от выбора варианта
меняла валюту в базовом наборе кошелька. Используйте конструкцию с условным выражением.
 */
package introduction.javaBasics_array.task4;

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        String[] currencies = {"USD","EUR","JPY","RUB"};

        System.out.println("В вашем тревел-кошельке доступны следующие валюты:");
        System.out.println(currencies[0]);
        System.out.println(currencies[1]);
        System.out.println(currencies[2]);
        System.out.println(currencies[3]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Если вы планируете поездку в Данию, введите 1, а если в Китай, введите 2");

        int country = scanner.nextInt();  // Считайте из консоли ввод пользователя

        // Если выбрана Дания, измените значение элемента евро на кроны DKK
        // Если Китай, измените значение элемента иена на юани CNY
        if (country == 1) {
            currencies[1] = ("DKK");
        } else if (country == 2) {
            currencies[2] = ("CNY");
        }


        System.out.println("В вашем тревел-кошельке доступны следующие валюты:");
        System.out.println(currencies[0]);
        System.out.println(currencies[1]);
        System.out.println(currencies[2]);
        System.out.println(currencies[3]);
    }
}

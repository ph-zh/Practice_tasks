/*
Завершите работу над кодом финансового приложения — соберите в отдельный класс код,
касающийся трат пользователя. Назовите этот класс ExpensesManager (англ. «менеджер по расходам»)
и опишите его, действуя по пунктам:
1/ Объявите одно поле — массив трат double[] expenses.
2/ Объявите конструктор без параметров, а внутри него инициализируйте массив так же, как это
происходит сейчас в классе Praktikum, — в нём должно храниться семь значений.
3/ Перенесите в ExpensesManager код методов saveExpense, findMaxExpense и printAllExpenses.
Удалите перед названием методов слова public и static.
4/ В классе Praktikum должно остаться взаимодействие с пользователем — печать меню, вопросов
пользователю, а также считывание его ответов: команд, значений зарплаты, дней и трат.
5/ Параметры метода saveExpense внутри класса ExpensesManager изменятся: теперь он должен принимать
остаток на счёте moneyBeforeSalary, размер траты expense и номер дня недели day, за который нужно её учесть.
6/ Уберите из методов findMaxExpense и printAllExpenses параметр double[] expenses. Теперь он
стал полем класса, и его не нужно передавать.
7/ Создайте объект класса ExpensesManager и вызовите его методы внутри класса Praktikum.
 */
package javaCore1.classesAndObjects.task14;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        Converter converter = new Converter(78.5,88.7,0.75);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
        // Здесь создайте объект класса ExpensesManager
        ExpensesManager expensesManager = new ExpensesManager();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
                int currency = scanner.nextInt();
                converter.convert(moneyBeforeSalary, currency);
            } else if (command == 2) {
                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
            } else if (command == 3) {
                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
                int day = scanner.nextInt();
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();
                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, expense, day);
            } else if (command == 4) {
                expensesManager.printAllExpenses();
            } else if (command == 5) {
                System.out.println("Самая большая сумма расходов на этой неделе составила " + expensesManager.findMaxExpense() + " руб.");
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать траты за неделю");
        System.out.println("5 - Показать самую большую сумму расходов за неделю");
        System.out.println("0 - Выход");
    }
}
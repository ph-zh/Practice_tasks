/*
Перед вами код финансового приложения, который вы написали при прохождении бесплатной части курса.
Для хранения трат в приложении сейчас используется массив и это не очень удобно. Вам нужно провести рефакторинг
с учётом новых знаний — сделайте так, чтобы траты хранились в списке вместо массива.
1/ Внесите правки в класс ExpensesManager — импортируйте ArrayList и создайте список expenses.
2/ Поправьте код методов. Измените saveExpense() так, чтобы не нужно было указывать день и записываемые
траты сохранялись в списке подряд, друг за другом. В методе findMaxExpense() используйте сокращённую форму цикла for.
3/ Поправьте код в Praktikum. В текст меню мы уже внесли изменения. Вам осталось только удалить вопрос
о выборе дня и отредактировать вызов метода saveExpense().
 */
package javaCore1.arrayListAndHashTable.task3;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        Converter converter = new Converter(78.5, 88.7, 0.75);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
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
                // Номер дня больше не нужен. Уберите вопрос и считывание номера дня
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();
                // Сигнатура метода изменится, учитывайте это
                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, expense);
            } else if (command == 4) {
                expensesManager.printAllExpenses();
            } else if (command == 5) {
                System.out.println("Самая большая сумма расходов составила " + expensesManager.findMaxExpense() + " руб.");
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
        System.out.println("4 - Показать траты");
        System.out.println("5 - Показать самую большую сумму расходов");
        System.out.println("0 - Выход");
    }
}
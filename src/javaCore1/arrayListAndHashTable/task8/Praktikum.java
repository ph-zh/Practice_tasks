/*
Замените список expenses в классе ExpensesManager на хеш-таблицу expensesByCategories.
Ключами в ней станут названия категорий, а значениями — списки трат. После этого нужно
поменять логику работы методов:
1/ Сделайте так, чтобы при добавлении траты теперь учитывалась её категория. В метод
saveExpense добавьте параметр category. Наличие категории нужно проверить. Если она есть,
в её список должна добавляться новая трата. В обратном случае нужно создать новый список
трат и добавить его вместе с названием категории в таблицу.
2/ Замените имя метода printAllExpenses() на printAllExpensesByCategories(). И исправьте
его функционал. Он должен печатать категории и расходы в них. Пример того, как это может выглядеть:
Дом
200.30
122.65
302.87
33.97
Здоровье
700.40
Еда
1300.56
800.00

3/ Имя метода findMaxExpense() замените на findMaxExpenseInCategory().
Этот метод должен принимать в качестве аргумента название категории. Если категория
есть в таблице, то метод должен найти в её списке максимальную трату. Если нет — то
сообщить об этом пользователю.
4/ Исправьте код в методе removeAllExpenses().
После рефакторинга ExpensesManager поменяйте вызов методов в классе Praktikum.
Мы уже внесли там нужные изменения в меню и добавили печать вопросов.
Задание непростое, но у вас всё получится!
 */
package javaCore1.arrayListAndHashTable.task8;

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
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();
                System.out.println("К какой категории относится трата?");
                String category = scanner.next();
                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, expense, category);
            } else if (command == 4) {
                expensesManager.printAllExpensesByCategories();
            } else if (command == 5) {
                System.out.println("В какой категории искать?");
                String category = scanner.next();
                System.out.println("Самая большая трата в категории " + category + " составила "
                        + expensesManager.findMaxExpenseInCategory(category) + " руб.");
            } else if (command == 6) {
                expensesManager.removeAllExpenses();
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
        System.out.println("4 - Показать траты по категориям");
        System.out.println("5 - Показать самую большую трату в выбранной категории");
        System.out.println("6 - Очистить таблицу трат");
        System.out.println("0 - Выход");
    }
}
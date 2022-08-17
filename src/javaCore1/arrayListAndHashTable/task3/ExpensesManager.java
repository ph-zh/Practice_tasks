package javaCore1.arrayListAndHashTable.task3;

// Импортируйте ArrayList
import java.util.ArrayList;

public class ExpensesManager {
    // Замените массив списком
    ArrayList<Double> expenses;
    ExpensesManager() {
        // Создайте список в конструкторе
        expenses = new ArrayList<>();
    }

    // Номер дня больше не нужен
    double saveExpense(double moneyBeforeSalary, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        // Эту строку нужно убрать
        expenses.add(expense);
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + expenses.get(i) + " рублей");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (Double expense : expenses) { // Используйте сокращённую форму цикла
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        return maxExpense;
    }
}
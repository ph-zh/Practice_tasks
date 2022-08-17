package javaCore1.arrayListAndHashTable.task9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories;

    ExpensesManager() {
        expensesByCategories = new HashMap<>();
    }

    double saveExpense(double moneyBeforeSalary, String category, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            expenses.add(expense);
        } else {
            ArrayList<Double> expenses = new ArrayList<>();
            expenses.add(expense);
            expensesByCategories.put(category, expenses);
        }
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpensesByCategories() {
        for (String category : expensesByCategories.keySet()) {
            System.out.println(category);
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (Double expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (Double expense : expenses) {
                if (expense > maxExpense) {
                    maxExpense = expense;
                }
            }
        } else {
            System.out.println("Такой категории пока нет.");
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear();
        System.out.println("Траты удалены.");
    }

    // Напишите метод для получения суммы всех трат
    double getExpensesSum() {
        double result = 0;
        /*
            Option #1
            for (String category : expensesByCategories.keySet()) {
                for (Double sum : category.get(category)) {
                result += sum;
               }
            }

            Option #2
         */

        for (Map.Entry<String, ArrayList<Double>> category : expensesByCategories.entrySet()) {
            for (Double sum : category.getValue()) {
                result += sum;
            }
        }
        return result;
    }

    // Напишите метод для удаления категории
    void removeCategory(String category) {
        expensesByCategories.remove(category);
    }

    String getMaxCategoryName() {
        // Напишите метод для получения категории, где размер трат больше всего
        // Используйте эти переменные для сохранения промежуточных значений
        double maxCategorySum = 0;
        String maxCategoryName = "";

        for (String category : expensesByCategories.keySet()) { // loop to define all keys
            double totalSum = 0;
            for (double sum : expensesByCategories.get(category)) { // values from particular key
                totalSum += sum; // total sum for One particular key
                }
            if (totalSum > maxCategorySum) { // comparison of TotalSum values between Keys
                maxCategorySum = totalSum;
                maxCategoryName = category;
            }
        }
        return maxCategoryName;
    }
}
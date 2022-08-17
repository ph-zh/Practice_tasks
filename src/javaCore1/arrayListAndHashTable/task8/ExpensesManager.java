package javaCore1.arrayListAndHashTable.task8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExpensesManager {
    // Замените на таблицу с именем expensesByCategories
    HashMap<String, ArrayList<Double>> expensesByCategories;

    ExpensesManager() {
        // Создайте таблицу
        expensesByCategories = new HashMap<>();
    }

    // Добавьте в метод ещё один параметр — category
    double saveExpense(double moneyBeforeSalary, double expense, String category) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
            // Замените на работу с таблицей
        if (expensesByCategories.containsKey(category)) { // Проверьте наличие категории
            // Получите список трат в этой категории
            // Добавьте трату
            expensesByCategories.get(category).add(expense);
        } else {
            // Создайте новый список трат и добавьте в него сумму
            ArrayList<Double> newExpense = new ArrayList<>();
            newExpense.add(expense);
            // Сохраните категорию и новый список трат в хеш-таблицу
            expensesByCategories.put(category, newExpense);
    }
        if (moneyBeforeSalary < 1000) {
        System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
    }
        return moneyBeforeSalary;
}


    void printAllExpensesByCategories() {
        // Замените логику для работы с таблицами
        for (Map.Entry<String, ArrayList<Double>> category : expensesByCategories.entrySet()) {
            System.out.println(category.getKey());
            for (Double expense : category.getValue()) {
                System.out.println(expense);
            }
        }
    }

    // Метод должен принимать название категории и называться findMaxExpenseInCategory
    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        /* Замените логику для работы с таблицами
        Если категория есть, то ищем максмальную трату.
        Иначе печатаем "Такой категории пока нет." */
        if(expensesByCategories.containsKey(category)) {
            for (Double exp : expensesByCategories.get(category)) {
                if (exp > maxExpense) {
                    maxExpense = exp;
                }
            }
        } else {
            System.out.println("Такой категории пока нет.");
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear(); // Таблица называется иначе
        System.out.println("Траты удалены.");
    }
}
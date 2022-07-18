/*
Прочитайте код. Сейчас программа анализирует расходы на корм одновременно для двух питомцев:
кота Пикселя и хомяка Байта — из-за этого в результатах печати можно запутаться. Декомпозируйте код
— разбейте его отдельные методы: sayHello, sayEnjoyMeal, findMaxExpense и findExpensesSum.
Методы с приветствием и пожеланием приятного аппетита должны быть типа void; методы, касающиеся
анализа трат, должны возвращать значение.
У всех методов должны быть параметры. Внутри главного метода main(String[] args) должны остаться
массивы с тратами, вызов методов и вывод результатов трат.
Вызовите методы так, чтобы сначала была напечатана информация про Пикселя, а потом про Байта.
 */
package javaCore1.methods.task9;

public class Praktikum {

    public static void main(String[] args) {

        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};

        sayHello("Пиксель");
        double maxExpenseCat = findMaxExpense(feedExpensesCat);
        System.out.println("Твой самый дорогой корм стоил " + maxExpenseCat);
        double sumOfExpenseCat = findExpensesSum(feedExpensesCat);
        System.out.println("Всего на корм было потрачено " + sumOfExpenseCat);
        sayEnjoyMeal("Пиксель");

        sayHello("Байт");
        double maxExpenseHamster = findMaxExpense(feedExpensesHamster);
        System.out.println("Твой самый дорогой корм стоил " + maxExpenseHamster);
        double sumOfExpenseHamster = findExpensesSum(feedExpensesHamster);
        System.out.println("Всего на корм было потрачено " + sumOfExpenseHamster);
        sayEnjoyMeal("Байт");
    }

        public static void sayHello(String username) {
            System.out.println("Привет, " + username);
        }

        public static void sayEnjoyMeal(String username) {
            System.out.println("Приятного аппетита, " + username);
        }

        public static double findMaxExpense(double[] feedExpenses) {
            double maxFeedExpense = 0;
            for (int i = 0; i < feedExpenses.length; i++) {
                if (feedExpenses[i] > maxFeedExpense) {
                    maxFeedExpense = feedExpenses[i];
                }
            }
            return maxFeedExpense;
        }
        public static double findExpensesSum(double[] feedExpenses) {
            double sumFeed = 0;
            for (int i = 0; i < feedExpenses.length; i++) {
                sumFeed = sumFeed + feedExpenses[i];
            }
            return sumFeed;
        }
}
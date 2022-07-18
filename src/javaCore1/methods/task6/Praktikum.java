/*
Объявите и реализуйте метод findMaxExpense — он должен находить в списке расходов за неделю самую большую
трату и возвращать её значение. В качестве единственного параметра этого метода укажите массив расходов expenses.
 */
package javaCore1.methods.task6;

public class Praktikum {

    public static void main(String[] args) {
        double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
        double maxExpense = findMaxExpense(expenses); // Вызовите метод и присвойте maxExpense значение его результата
        System.out.println("Самая большая трата недели " + maxExpense);
    }

	// Объявите метод findMaxExpense
    // Реализуйте метод. Чтобы найти самую большую трату, воспользуйтесь циклом
    // Самую большую трату запишите в переменную maxExpense
    public static double findMaxExpense(double[] expenses) {
        double maxExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        return maxExpense;
    }
}
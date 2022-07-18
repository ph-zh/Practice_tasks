/*
Расходы за неделю записаны в семи отдельных переменных. Соберите все их значения в
один массив с именем expenses (англ. «расходы»). Не забудьте, что тип данных массива
должен соответствовать его содержанию.
 */
package introduction.javaBasics_array.task1;

class Praktikum {
    public static void main(String[] args) {
        // Расходы за неделю

        double mondayExpense = 100.50;
        double tuesdayExpense = 500.00;
        double wednesdayExpense = 10.00;
        double thursdayExpense = 0.0;
        double fridayExpense = 40.60;
        double saturdayExpense = 500.10;
        double sundayExpense = 200.00;

        // Объявите массив expenses и соберите в него значения из переменных
        double[] expenses = {100.50, 500.00, 10.00, 0.0, 40.60, 500.10, 200.00};
    }
}
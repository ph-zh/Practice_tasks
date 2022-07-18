/*
Изучите код программы, которая автоматически заполняет массив расходов за неделю.
Найдите и исправьте допущенные ошибки.
 */
package introduction.javaBasics_array.task10;

class Praktikum {
    public static void main(String[] args) {

        double[] expenses = new double[7]; // Объявили массив трат за неделю (7 дней)

        double expense = 50; // В первый день потрачено 50 рублей

        // Заполнили массив, используя цикл for
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = expense; // значение 50 рублей будет работать всю длину массива
            expense = expense + 100;
        }
        System.out.println("Ошибок нет. Все расходы успешно занесены в приложение!");
    }
}
/*
Расчет expense на массив в 7 дней
1	150 = 50 + 100
2	250 = значение предыдущего 150 + 100
3	350 = 250 + 100
4	450 = ...
5	550
6	650
7	750
*/

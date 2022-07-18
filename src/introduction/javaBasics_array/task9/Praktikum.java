/*
Заполните массив трат за неделю — expenses, используя цикл for. Расходы за каждый день будут определяться
случайным образом с помощью генератора Random с ограничением в 1000. После заполнения массива
напечатайте значения его элементов и посчитайте сумму трат за неделю — также с помощью циклов.
 */
package introduction.javaBasics_array.task9;

import java.util.Random;

class Praktikum {
    public static void main(String[] args) {
        // Объявите пустой массив трат за неделю (7 дней)
        int[] expenses = new int[7];

        Random random = new Random(); // Генерирует случайное число

        // Допишите условие цикла for, чтобы заполнить массив случайными тратами
        // Выведите с помощью цикла все траты за неделю в виде: "День ... . Потрачено рублей: ..."
        System.out.println("Траты за неделю:");
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(1000);
            System.out.println("День " + (i + 1) + ". Потрачено рублей: " + expenses[i]);
        }
        // Посчитайте и выведите сумму трат за неделю — используйте цикл и здесь
        int sum = 0;
        for (int j = 0; j < expenses.length; j++ ) {
            sum = sum + expenses[j];
        }
        System.out.println("Траты в рублях за неделю: " + sum);
    }
}
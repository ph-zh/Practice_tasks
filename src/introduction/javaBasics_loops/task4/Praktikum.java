/*
Проектировать лифты — это слишком приземлённо, попробуйте себя в роли космического инженера.
Напишите программу для отправки в космос ракеты SpaceY. При ее запуске должен происходить
десятикратный обратный отсчёт. Однако учтите, что пилот не любит классический отсчёт из 10 секунд, —
он считает своим счастливым числом семь.
Цикл должен начинаться с 70 секунд и идти с шагом 7. Сохраните количество секунд до старта
в переменнуюsecondsBeforeStart и используйте её как начальное значение переменной итерирования i . Результат запуска цикла должен получиться таким:
До старта SpaceY осталось 70
До старта SpaceY осталось 63
До старта SpaceY осталось 56
До старта SpaceY осталось 49
До старта SpaceY осталось 42
До старта SpaceY осталось 35
До старта SpaceY осталось 28
До старта SpaceY осталось 21
До старта SpaceY осталось 14
До старта SpaceY осталось 7
До старта SpaceY осталось 0
Поехали! Узнаем, есть ли жизнь на Марсе!
 */
package introduction.javaBasics_loops.task4;

public class Praktikum {
    public static void main(String[] args) {
        int secondsBeforeStart = 70; // Секунды до старта, цикл должен начинаться с их значения

        for (int i = secondsBeforeStart; i >= 0; i = i - 7) {
            // Место для вывода
            System.out.println("До старта SpaceY осталось " + i);
        }

        System.out.println("Поехали! Узнаем, есть ли жизнь на Марсе!");
    }
}
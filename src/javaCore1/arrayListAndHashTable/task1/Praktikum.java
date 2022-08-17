/*
Вы уже немало знаете о Java и совсем скоро начнёте работать самостоятельно. Потренируйтесь это делать.
Напишите от начала и до конца код небольшого приложения для маркетингового отдела зоопарка. Оно должно
печатать список и количество животных, кормления которых смогут увидеть посетители, а также расписание сеансов.
Добавьте в список шиншиллу, крокодила, льва, медведя и слона — строго в таком порядке. При составлении
расписания учитывайте, что первым кормят крокодила, затем слона, ещё через час — шиншиллу, в полдень —
льва, а последним — медведя. Для печати животных используйте сокращённый цикл for. Весь необходимый текст
вы найдёте в комментариях — от вас нужен только код.
 */

package javaCore1.arrayListAndHashTable.task1;

import java.util.ArrayList;

public class Praktikum {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");
        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных:");
        System.out.println("Это будут: ");
        for (String animal : animals) {
            System.out.println(animal);
        }

        System.out.println("Расписание кормлений:");
        System.out.println("В 9:00 - " + animals.get(1));
        System.out.println("В 10:00 - " + animals.get(4));
        System.out.println("В 11:00 - " + animals.get(0));
        System.out.println("В 12:00 - " + animals.get(2));
        System.out.println("В 13:00 - " + animals.get(3));
    }
}
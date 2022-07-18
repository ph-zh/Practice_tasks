/*
Пока вы осваивали новый материал, хомяки успели поесть и побегать, и их вес изменился.
Прочитайте код и расположите имена хомяков в порядке убывания их веса:
 */
package javaCore1.classesAndObjects.task9;

public class Praktikum {
    public static void main(String[] args) {
        Hamster bite = new Hamster(); // Имя Байта менять не нужно
        bite.eat(35);
        for (int i = 0; i < 3; i++) {
            bite.runInWheel();
        }

        Hamster ninja = new Hamster();
        ninja.name = "Ниндзя";
        ninja.weight = 250;
        ninja.runInWheel();
        if (ninja.weight < 265) {
            ninja.eat(45);
        }

        Hamster kuzya = new Hamster();
        kuzya.name = "Кузя";
        kuzya.weight = 450;
        kuzya.weight = 325;
        kuzya.eat(20);

        Hamster paskal = new Hamster();
        paskal.name = "Паскаль";
        paskal.weight = 320;
    }
}

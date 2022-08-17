/*
История рубля насчитывает более 700 лет. Современные цены заметно отличаются от стоимости товаров времён
Российской империи или даже Советской России.
Не существует единого мнения о том, как точно переводить рубли дореволюционного или советского периода в
современные рубли, но приблизительные значения получить можно.
Перед вами заготовка конвертера современных рублей в рубли начала и конца XX века. Мы заранее посчитали, что:
- 1 дореволюционный рубль 1913 г. = 884 современных рубля,
- 1 советский рубль 1984 г. = 337 современных рублей.
Ваша задача — дописать код так, чтобы программа подсчитывала, сколько вы сможете приобрести товаров из
прошлого на сумму из настоящего.
Например, на семь тысяч современных рублей в 1913 году можно было бы купить гармонь или семь рубашек,
а в 1984 году — шапку-ушанку или пять бутылок «Советского» шампанского.
 */
package javaCore1.scopeOfVariablesAndSwitchOperator.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в современных рублях:");
        float amount = scanner.nextFloat();

        System.out.println("Введите год (1913 или 1984)");
        int year = scanner.nextInt();
        double result;


        // используйте switch
        // Посчитайте, сколько у вас рублей для введённого года
        // Если для указанного года нет курса, то выведите сообщение
        // "Для этого года у нас нет данных." и прекратите выполнение метода.
        switch(year) {
            case 1913:
                result = amount / 884;
                break;
            case 1984:
                result = amount / 337;
                break;
            default:
                System.out.println("Для этого года у нас нет данных.");
                return;
        }
        printPrices(year, result);
    }

    public static void printPrices(int year, double amount) {
        HashMap<String, Double> prices = getPrices(year);
        System.out.println("В " + year + " году эта сумма приблизительно равнялась бы "
                + String.format("%,.2f", amount) + " р. "
                + "На эти деньги вы могли бы купить следующие товары:");
        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            if (entry.getValue() < amount) {
                System.out.println(entry.getKey() + " — " + (int) (amount / entry.getValue()) + " шт.");
            }
        }
    }


    public static HashMap<String, Double> getPrices(int year) {
        HashMap<String, Double> prices = new HashMap<>();

        if (year == 1913) {

            prices.put("Корова", 60.0);
            prices.put("Курица", 0.60);
            prices.put("Рубашка", 1.0);
            prices.put("Шапка гусарская", 12.0);
            prices.put("Гармонь", 7.50);
            prices.put("Рояль", 200.0);}
        else {

            prices.put("Банка сгущёнки", 0.55);
            prices.put("Автомобиль «Запорожец»", 5600.0);
            prices.put("Мороженое", 0.20);
            prices.put("Шапка-ушанка цигейковая", 14.0);
            prices.put("Шампанское «Советское»", 3.6);
            prices.put("Карта мира", 2.54);
            prices.put("Мотоцикл «Восход»", 450.0);
            prices.put("Портативный кассетный магнитофон «Весна-202-1»", 195.0);
            prices.put("Пальто осеннее", 100.0);

        }

        return prices;
    }
}
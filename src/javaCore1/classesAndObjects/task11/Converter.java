/*
Добавьте конструктор в класс для конвертера валют, который вы написали в прошлом уроке.
Значения полей должны передаваться в качестве параметров со следующими названиями: usd, eur, jpy.
Обратите внимание: для правильной проверки вашего кода порядок параметров должен совпадать с
порядком объявления полей.
 */
package javaCore1.classesAndObjects.task11;

public class Converter {
    double rateUSD = 78.5;
    double rateEUR = 88.7;
    double rateJPY = 0.75;
    //добавьте конструктор здесь
    Converter(double usd, double eur, double jpy) {
        rateUSD = usd;
        rateEUR = eur;
        rateJPY = jpy;
    }
    void convert(double rubles, int currency) {
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в иенах: " + rubles / rateJPY);
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}
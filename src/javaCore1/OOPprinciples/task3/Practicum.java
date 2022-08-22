/*
Вам нужно снять наличные в банкомате, но он сломался и выводит только консоль с недописанным кодом.
По счастливой случайности — на Java. Допишите код — реализуйте методы в классе BankAccount. Чтобы установить
и считать значение суммы денег на счёте moneyAmount, вам понадобятся get- и set-методы. Чтобы снять деньги
со счёта и обнулить его — метод withdrawAll(), который должен обнулять счёт и печатать количество выданных
денег в формате: Со счёта снято 1000 р. Все методы должны иметь самый широкий уровень доступа. В результате
запуска программы в консоли должно появиться:

Количество денег на счету - 1000 р. (сумма может быть любой)
Со счёта снято 1000 р.
Количество денег на счету - 0 р.
 */
package javaCore1.OOPprinciples.task3;

public class Practicum {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        long money = 1000;
        // передайте в банкомат сумму на счету
        bankAccount.setMoneyAmount(money);
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        // вызовите метод вывода средств
        bankAccount.withdrawAll(money);
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {
    // допишите код методов
    // используйте параметр newMoneyAmount для установки нового значения
    private long moneyAmount;

    public long getMoneyAmount () {
        return moneyAmount;
    }

    public void setMoneyAmount (long newMoneyAmount) {
        if (newMoneyAmount > 0) {
            moneyAmount = newMoneyAmount;
        }
    }

    public void withdrawAll(long newMoneyAmount) {
        if(newMoneyAmount > 0) {
            System.out.println("Со счёта снято " + moneyAmount + " р.");
            moneyAmount = 0;
        }
    }
}
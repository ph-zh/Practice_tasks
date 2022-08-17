/*
В хеш-таблице customersOrders класса OrdersManager собрана информация о клиентах зоомагазина (это ключи) и их
заказах. Дополните код методов:
1/ В printAllOrders() и getOrdersSum(), которые печатают список всех заказов и их возвращают общую сумму, вызовите
нужные методы HashMap.
2/ В методе printCustomerOrders(String customerName) перед печатью заказов конкретного клиента добавьте проверку
наличия его имени в таблице. Это нужно, чтобы избежать ошибки ссылки на null.
3/ Метод getMaxOrderCustomerName() должен возвращать имя клиента, который потратил в зоомагазине больше всего.
Переменные для хранения имени клиента и максимальной суммы заказов мы объявили и инициализировали за вас.
Числовое переменной присвоили 0, а строковой — пустую строку "". Вам нужно дописать логику работы метода.
Вы уже не раз искали максимум в массивах или списках. Здесь получится очень похоже!
4/ Метод removeUnprofitableOrders должен удалять из таблицы клиентов, сумма заказов которых строго меньше 5000.
 */
package javaCore1.arrayListAndHashTable.task7;

public class Praktikum {
    public static void main(String[] args) {
        OrdersManager ordersManager = new OrdersManager();

        ordersManager.printAllOrders();
        System.out.println("Всего заказов на сумму: " + ordersManager.getOrdersSum());

        String maxOrderCustomerName = ordersManager.getMaxOrderCustomerName();
        System.out.println("Самая большая сумма заказов у " + maxOrderCustomerName);
        ordersManager.printCustomerOrders(maxOrderCustomerName);

        ordersManager.removeUnprofitableOrders();
    }
}
/*
Запрограммируйте с помощью цикла for подъём лифта в доме,
где 11 этажей и просторная трёхуровневая парковка. В результате
запуска цикла должен отображаться каждый этаж с минус третьего до одиннадцатого.
 */
package introduction.javaBasics_loops.task1;

public class Praktikum {
    public static void main(String[] args) {
        // Вместо точек подставьте нужные выражения
        for (int i = -3; i <= 11; i=i+1) {
            System.out.println("Этаж " + i);
        }
    }
}
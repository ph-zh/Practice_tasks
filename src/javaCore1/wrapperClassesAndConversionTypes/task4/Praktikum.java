/*
Кота Пикселя на вечер субботы оставили бабушке. Она приготовила ему на выбор говядину и курицу,
а перед сном налила молока и поставила блюдце сливок. Пиксель внимательно следит за питанием и
в обоих случаях выбрал наименее калорийную еду. Вычислите, сколько всего ккал съел Пиксель за
день, и проверьте, уложился ли питомец в свой лимит в 100 ккал. Чтобы код сработал, вам также
нужно найти и исправить ошибки, касающиеся типов.
 */
package javaCore1.wrapperClassesAndConversionTypes.task4;

public class Praktikum {
    public static void main(String[] args) {
        String pixelKcalDay = "43"; // столько калорий съел Пиксель до похода к бабушке
        String beefKcal = "30.2"; // калорийность говядины
        String chickenKcal = "23.8"; // калорийность курицы
        String creamKcal = "32.1"; // калорийность сливок
        String milkKcal = "13.5"; // калорийность молока

        float pixelChoice = getMinKcalsSum(beefKcal, chickenKcal, creamKcal, milkKcal);
        float totalKcal = Integer.parseInt(pixelKcalDay) + pixelChoice;
        checkKcal(totalKcal);
    }

    private static Float getMinKcalsSum(String firstDishKcal, String secondDishKcal, String firstDesert, String secondDesert) {
        float minDishKcal = Float.min(Float.parseFloat(firstDishKcal), Float.parseFloat(secondDishKcal)); // вычислите минимальную калорийность основного блюда
        float minDesertKcal = Float.min(Float.parseFloat(firstDesert), Float.parseFloat(secondDesert)); // вычислите минимальную калорийность десерта
        return minDishKcal + minDesertKcal;
    }

    private static void checkKcal(Float catKcal) {
        if (catKcal == null) { // В методе checkKcal параметр catKcal должен иметь тип Float, а не float.
                               // У примитива в отличие от класса-обёртки не может быть значение null.
            System.out.println("Что-то пошло не так");
        } else {
            System.out.println("Калорийность рациона Пикселя за день: " + catKcal);
            if (catKcal > 100) {
                System.out.println("Пиксель сегодня не уложился в норму.");
            } else {
                System.out.println("Лимит не превышен!");
            }
        }
    }
}
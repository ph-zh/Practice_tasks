package javaCore1.wrapperClassesAndConversionTypes.task1;

class WeatherCalendar {
    String month;
    int numberOfDays;
    int rainyDays;
    int year = 2020;
    boolean isRainyMonth;

    WeatherCalendar(String monthName, int monthNumberOfDays) {
        month = monthName;
        numberOfDays = monthNumberOfDays;

    }
    // Увеличить переменную rainyDays на единицу
    int addRainyDay() {
        rainyDays++;
        return rainyDays;
    }
}
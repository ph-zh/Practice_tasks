/*
Напишите код хеш-таблицы государственных праздников stateHolidays, которая
будет содержать месяцы и праздничные даты:
Январь — 1, 7;
Февраль — 23;
Март — 8;
Май — 1, 9;
Июнь — 12;
Ноябрь — 4
 */
package javaCore1.arrayListAndHashTable.task5;

import java.util.ArrayList;
import java.util.HashMap;

public class Praktikum {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();
        ArrayList<Integer> january = new ArrayList<>();
        january.add(1);
        january.add(7);
        stateHolidays.put("Январь", january);

        ArrayList<Integer> february = new ArrayList<>();
        february.add(23);
        stateHolidays.put("Февраль", february);

        ArrayList<Integer> march = new ArrayList<>();
        march.add(8);
        stateHolidays.put("Март", march);

        ArrayList<Integer> may = new ArrayList<>();
        may.add(1);
        may.add(9);
        stateHolidays.put("Май", may);

        ArrayList<Integer> june = new ArrayList<>();
        june.add(12);
        stateHolidays.put("Июнь", june);

        ArrayList<Integer> november = new ArrayList<>();
        november.add(4);
        stateHolidays.put("Ноябрь", november);

        System.out.println(stateHolidays);
    }
}
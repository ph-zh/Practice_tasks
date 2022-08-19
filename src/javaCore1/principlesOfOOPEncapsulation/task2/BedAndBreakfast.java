package javaCore1.principlesOfOOPEncapsulation.task2;

//package ru.yandex.practicum.model;
//
//public class BedAndBreakfast { // сделайте класс общедоступным
//
//    // число свободных номеров (10) сохраните в переменную capacity
//    private int capacity = 10;
//    // сохраните в переменную full значение false - есть номера в наличии
//    private boolean full = false;
//
//    public void book() { // метод для бронирования комнат
//        if (!full) { // если есть свободные номера
//            System.out.println("Забронирован ещё один номер!");
//            capacity = capacity - 1; // уменьшите количество свободных номеров на один
//            printRooms();
//            if (capacity == 0) {
//                full = true;
//            }
//        } else {
//            System.out.println("Свободных номеров нет!");
//        }
//    }
//
//    private void printRooms() {
//        System.out.println("Свободных номеров - " + capacity);
//    }
//
//    public void free() { // метод для освобождения комнат
//        if (capacity < 10) { // если свободных комнат меньше 10
//            capacity = capacity + 1; // увеличиваем количество свободных мест на одно
//            System.out.println("Освободился номер!");
//            printRooms();
//            full = false;
//        } else {
//            System.out.println("В гостинице только 10 номеров.");
//        }
//    }
//
//    public boolean isFull() {
//        return full;
//    }
//}
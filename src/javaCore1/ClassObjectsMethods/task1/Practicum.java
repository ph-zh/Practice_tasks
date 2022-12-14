/*
Допишите код класса — бюро находок LostAndFoundOffice. В нём должен быть список things для учёта потерянных
вещей, метод put() для добавления вещи в список, метод check() — для проверки её наличия. В зависимости от
результата check() должен возвращать true или false. Методы put() и check() должны быть универсальными —
принимать в качестве параметра объекты любых классов. Не забудьте предусмотреть ситуацию, если в check()
передана пустая ссылка.
 */
package javaCore1.ClassObjectsMethods.task1;

class Ball { }      // Класс "мяч"
class Accordion { } // Класс "аккордеон"
class Hat { }       // Класс "шляпа"
class Umbrella { }  // Класс "зонт"

public class Practicum {
    // Бюро находок
    static LostAndFoundOffice lostAndFound = new LostAndFoundOffice();

    public static void main(String[] args) {
        Ball ball = new Ball();
        Accordion accordion = new Accordion();
        Umbrella umbrella = new Umbrella();
        Hat hat = new Hat();

        // Сдаём в бюро находок найденные вещи
        lostAndFound.put(ball);
        lostAndFound.put(accordion);
        lostAndFound.put(umbrella);

        checkObject(accordion, "Aккордеон");
        checkObject(ball, "Мяч");
        checkObject(umbrella, "Зонт");
        checkObject(hat, "Шляпа");
    }

    private static void checkObject(Object object, String description) {
        if(lostAndFound.check(object)) {
            System.out.println('\'' + description + "' нашёлся!");
        } else {
            System.out.println('\'' + description + "' в бюро находок никто не приносил :(");
        }
    }
}
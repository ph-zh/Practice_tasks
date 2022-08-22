package javaCore1.ClassObjectsMethods.task1;

import java.util.ArrayList;

public class LostAndFoundOffice {
    // создайте список things
    ArrayList<Object> things = new ArrayList<>();
    // реализуйте метод put()
    // реализуйте метод check()

    public void put(Object object) {
        things.add(object);
    }

//    public boolean check(Object object) {
//        if(!things.isEmpty()){
//            if(things.contains(object)) {
//                return true;
//            } else {
//                return false;
//            }
//        } else {
//            return false;
//        }
//    }

    // логика проверки вещи в списке
    public boolean check(Object target) {
        for (Object object : things) {
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}








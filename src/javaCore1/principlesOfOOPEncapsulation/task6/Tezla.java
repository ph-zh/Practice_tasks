package javaCore1.principlesOfOOPEncapsulation.task6;

class Tezla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Tezla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        speed += autoPilotAcceleration;
        // исправьте метод для ускорения при автопилоте
    }

    // переопределите метод для ускорения

    // переопределите метод для торможения
}
package javaCore1.OOPprinciples.task6;

class Tezla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Tezla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }
    // исправьте метод для ускорения при автопилоте

    public void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        } else {
            speed = autoPilotMaxSpeed;
        }
    }

    // переопределите метод для ускорения
    @Override
    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        } else {
            speed = maxSpeed;
        }
    }
    // переопределите метод для торможения
    @Override
    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        } if (speed < 0) {
            speed = 0;
        }
    }
}
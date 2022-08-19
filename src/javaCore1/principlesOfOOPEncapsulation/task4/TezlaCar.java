package javaCore1.principlesOfOOPEncapsulation.task4;

class TezlaCar extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public TezlaCar() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 10;
    }

    public void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        }
    }
}
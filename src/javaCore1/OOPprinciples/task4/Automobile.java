package javaCore1.OOPprinciples.task4;

class Automobile extends Transport {
    public Automobile() {
        wheelsNumber = 4;
    }

    public String direction;

    public void turnTo(String worldSide) {
        direction = worldSide;
    }
}
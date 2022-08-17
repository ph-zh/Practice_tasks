package javaCore1.scopeOfVariablesAndSwitchOperator.task1;

public class BikeTimeCalculator {
    private double speed = 10; // средняя скорость в км/ч
    private double speedInMS = new SpeedConverter(speed).getSpeedInMs();
    private String courierName;

    public BikeTimeCalculator(String name) {
        courierName = name;
    }

    public long getDeliveryTime(int distanceInMeters) {
        if (distanceInMeters <= 0) {
            return 1;
        }
        return (int)Math.ceil(distanceInMeters / speedInMS);
    }

    public String getCourierName() {
        return courierName;
    }
}
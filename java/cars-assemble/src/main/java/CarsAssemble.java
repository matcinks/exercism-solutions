public class CarsAssemble {

    private static final int CARS_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {
        return CARS_PER_HOUR * speed * successRateMultiplier(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }

    private double successRateMultiplier(int speed) {
        if (speed > 9) {
            return 0.77;
        } else if (speed > 8) {
            return 0.8;
        } else if (speed > 4) {
            return 0.9;
        } else {
            return 1.0;
        }
    }
}

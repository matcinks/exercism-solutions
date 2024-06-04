public class ElonsToyCar {

    private int drivenDistance;
    private int batteryCapacity = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.drivenDistance);
    }

    public String batteryDisplay() {
        if (this.batteryCapacity <= 0) {
            return "Battery empty";
        }
        return String.format("Battery at %d%%", this.batteryCapacity);
    }

    public void drive() {
        if (this.batteryCapacity != 0) {
            this.drivenDistance += 20;
            this.batteryCapacity--;
        }
    }
}

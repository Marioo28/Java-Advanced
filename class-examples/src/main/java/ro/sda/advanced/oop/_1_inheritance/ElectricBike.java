package ro.sda.advanced.oop._1_inheritance;

public class ElectricBike extends Bicycle{

    public int batteryLevel;


    public ElectricBike(int gear, int speed, int batteryLevel) {
        super(gear, speed);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    void recharge() {
        this.batteryLevel = 100;
    }

    void useElectricPower() {
        if (batteryLevel - 10 > 0) {
            this.batteryLevel -= 10;
            speedUp(10);
        } else {
            System.out.println("Battery level insufficient!");
        }
    }
}

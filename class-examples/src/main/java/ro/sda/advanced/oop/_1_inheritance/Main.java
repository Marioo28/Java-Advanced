package ro.sda.advanced.oop._1_inheritance;

public class Main {
    public static void main(String[] args) {


        Bicycle bicycle1 = new Bicycle(5, 20);

        System.out.println("Bicycle 1 speed  - " + bicycle1.getSpeed());
        System.out.println("Bicycle 1 gear  - " + bicycle1.getGear());


        bicycle1.applyBreak(5);
        System.out.println("Bicycle 1 speed  - " + bicycle1.getSpeed());

        ElectricBike electricBike = new ElectricBike(7,30,75);


        System.out.println("ElectricBicycle  speed  - " + electricBike.getSpeed());
        System.out.println("ElectricBicycle  gear  - " + electricBike.getGear());
        System.out.println("ElectricBicycle  batery  - " + electricBike.getBatteryLevel());
        electricBike.useElectricPower();
        System.out.println("ElectricBicycle  batery  - " + electricBike.getBatteryLevel());
        System.out.println("ElectricBicycle  speed  - " + electricBike.getSpeed());


    }
}

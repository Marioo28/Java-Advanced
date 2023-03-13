package ro.sda.advanced.oop._3_inner_class;

public class Laptop {
    double price;

    class Processor {
        double cores;
        String manufacturer;

        public Processor(double cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        double getCache() {
            return 4.3;
        }
    }

    class Ram {
        double memeory;
        String manufacturer;

        public Ram(double memeory, String manufacturer) {
            this.memeory = memeory;
            this.manufacturer = manufacturer;
        }

        double getClockSpeed() {
            return 5.5;
        }
    }
}

class Main {

    public static void main(String[] args) {

        Laptop myLaptop = new Laptop();

        Laptop.Processor processor = myLaptop.new Processor(4, "AMD");

        Laptop.Ram ram = myLaptop.new Ram(8, "Gigabyte");

        System.out.println("Processor cache = " + processor.getCache());
        System.out.println("Ram clock speed = " + ram.getClockSpeed());
    }
}
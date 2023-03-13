package ro.sda.advanced.oop._1_inheritance;

public class Bicycle {
    //instance variables / fields
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void applyBreak(int decrement) {
        if (this.speed - decrement < 0) {
            this.speed = 0;
        } else {
            this.speed -= decrement;
        }
    }

    public void speedUp(int increment) {
        if (this.speed + increment > 50) {
            this.speed = 50;
        } else {
            this.speed += increment;
        }
    }



}

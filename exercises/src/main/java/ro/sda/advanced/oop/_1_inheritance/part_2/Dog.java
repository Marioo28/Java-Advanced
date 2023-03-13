package ro.sda.advanced.oop._1_inheritance.part_2;

// Crete Dog class which extends from Animal
// Dog has also eyes which is an int, legs which is an int, teeth which is an int and coat which is a String
// Dog overrides the method eat
// Dog also has another method called chew() which just print "Dog.chew() called"
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int teeth, String coat) {
        super(name, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }
    @Override
    public void eat(){
        this.chew();
        System.out.println("Dog.eat() called!");
    }


    public void chew(){
        System.out.println("CHEWW!");
    }
}

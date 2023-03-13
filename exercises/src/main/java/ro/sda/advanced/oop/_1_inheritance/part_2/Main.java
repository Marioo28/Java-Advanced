package ro.sda.advanced.oop._1_inheritance.part_2;

// Create an Animal class that has a name which is a String, size which is an int, and weight which is an int also
// Generate setters and getters for each instance variable
// Animal also contains a method eat() which just prints "Animal.eat() called"
//
// Crete Dog class which extends from Animal
// Dog has also eyes which is an int, legs which is an int, teeth which is an int and coat which is a String
// Dog overrides the method eat
// Dog also has another method called chew() which just print "Dog.chew() called"
public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Cleo", 10, 5);
        Dog dog = new Dog("Rex", 20, 5, 2, 4, 40, "Black");
        animal1.eat();
        dog.eat();
    }
}

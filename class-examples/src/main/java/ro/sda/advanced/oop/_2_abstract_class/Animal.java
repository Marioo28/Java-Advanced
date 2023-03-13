package ro.sda.advanced.oop._2_abstract_class;

public abstract class Animal {
    abstract void makeSound();

    public void eat(){
        System.out.println("I can eat!");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark Bark");
    }
}
class Main{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();
        d1.eat();
    }
}
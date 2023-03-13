package ro.sda.advanced.oop._1_inheritance.part_2;

// Create an Animal class that has a name which is a String, size which is an int, and weight which is an int also
// Generate setters and getters for each instance variable
// Animal also contains a method eat() which just prints "Animal.eat() called"
public class Animal {

    private String name;
    private int size;
    private int weight;

    public Animal(String name, int size, int weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWight() {
        return weight;
    }

    public void setWight(int wight) {
        this.weight = wight;
    }

    public void eat() {
        System.out.println("Animal.eat() called!");
    }
}

interface Soundable {
    void makeSound(); // Semua yg implement harus punya method ini
}
abstract class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    void eat(){
        // Method class -> Wajib di override di subclass
        System.out.println(name + " is eating");
    }
    
}
class Cat extends Animal implements Soundable{
    Cat(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name + " says Meow");
    }
}
class Bird extends Animal implements Soundable{
    Bird(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name + " says Chirp");
    }
}
public class Kelas {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        Bird bird = new Bird("Tweety");

        cat.eat();
        cat.makeSound();

        bird.eat();
        bird.makeSound();
    }
}

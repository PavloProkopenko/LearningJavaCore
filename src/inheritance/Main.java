package inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("I'm animal");
        animal.eat();
        animal.sleep();

        Cat newCat = new Cat();
        System.out.println("\nI'm cat!");
        newCat.sleep();
        newCat.meow();
        newCat.eat();
        newCat.showName();
    }

}

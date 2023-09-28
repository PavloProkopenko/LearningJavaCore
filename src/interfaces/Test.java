package interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(322);
        Person person = new Person("Pasha");
        animal.showInfo();
        animal.talk();
        System.out.println("--------------------------------------");
        person.showInfo();
        person.knowledge();
        System.out.println("--------------------------------------");
        // We also can do this
        Info info1 = new Animal(2);
        Info info2 = new Person("Pablo");
//        info1.showInfo(); // We can use methods which we have in interface
//        info2.showInfo();
        outputInfo(info1);
        outputInfo(info2);
        System.out.println("--------------------------------------");
        outputInfo(animal);
        outputInfo(person);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}

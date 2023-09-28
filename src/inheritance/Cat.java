package inheritance;

public class Cat extends Animal{
    public void meow(){
        System.out.println("Meoow");
    }

    // Переопределение метода
    public void eat(){
        System.out.println("I'm eating cat food");
    }

    public void showName(){
        System.out.println(name);
    }
}

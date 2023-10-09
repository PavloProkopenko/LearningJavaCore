package abstractClasses;

public class Student extends Person{
    @Override
    public void talk() {
        System.out.println("I can't work because I'm studying");
    }
}

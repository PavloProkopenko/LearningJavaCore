package interfaces;

public class Person implements Info{
    public String name;

    public Person(String name){
        this.name = name;
    }
    public void knowledge(){
        System.out.println("I'm coding on Java now");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is: " + this.name);
    }
}

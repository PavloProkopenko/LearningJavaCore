package interfaces;

public class Animal implements Info {
    public int id;

    public Animal(int id){
        this.id = id;
    }
    public void talk() {
        System.out.println("I don't know what is Java");
    }

    public void showInfo(){
        System.out.println("My ID number: " + this.id);
    }
}

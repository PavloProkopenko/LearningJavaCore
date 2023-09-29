package polymorph;

public class Main {
    public static void main(String[] args) {
        Person newPerson = new Person();
        Programer newProgramer = new Programer();

        newPerson.talk();
        newProgramer.talk();

        newProgramer.coding();
        System.out.println("---------------");

        test(newPerson);
        test(newProgramer);
    }

    public static void test(Person person){
        person.talk();
    }
}

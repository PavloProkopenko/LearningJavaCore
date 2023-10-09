package abstractClasses;

public class Test {
    public static void main(String[] args) {
//        Person someHuman = new Person(); <- we can do this, when class have modifier abstract
        Person student = new Student();
        Student worker = new Worker();
        System.out.println("Student:");
        student.indification();
        student.talk();
        System.out.println("Worker:");
        worker.indification();
        worker.talk();
    }
}

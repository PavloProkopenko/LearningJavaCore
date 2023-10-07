package anonimClasses;

class Student {
    public void spell(){
        System.out.println("I'm studying now");
    }
}

/**
 * We can do something like this, but...
 * class UnversityStudent extends Student {
 * public void spell(){
 * System.out.println("I'm studying in NULES");
 * }
 * }
 */
interface Teacher {
    public void teach();
}
public class AnonymousClass {
    public static void main(String[] args) {
        Student someStudent = new Student();
        someStudent.spell();
        Student universityStudent = new Student(){ // we can use anonymous class
            @Override
            public void spell() {
                System.out.println("I'm studying in NULES");
            }
        };
        Teacher newTeacher = new Teacher() { // More common use for anonymous class
            @Override
            public void teach() {
                System.out.println("I can give to you some new information");
            }
        };
    }
}

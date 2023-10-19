package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
//        Person person1 = new Person(1, "Pasha");
//        Person person2 = new Person(2, "Ilya");
        Person[] people =  {new Person(1, "Pasha"), new Person(2, "Ilya"), new Person(3, "Mikey")};

        try {
            FileOutputStream file = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(file);

//            oos.writeInt(people.length);
//            for (Person person: people) {
//                oos.writeObject(person);
//            }
            oos.writeObject(people);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

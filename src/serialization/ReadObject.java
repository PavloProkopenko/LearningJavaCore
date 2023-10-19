package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

//            Person person1 = (Person)ois.readObject();
//            Person person2 = (Person)ois.readObject();



//            Possibility #1
//            int personCount = ois.readInt();
//            Person[] people = new Person[personCount];
//            for (int i = 0; i < personCount; i++)
//            {
//                people[i] = (Person)ois.readObject();
//            }
//            System.out.println(Arrays.toString(people));

//            System.out.println(person1);
//            System.out.println(person2);

//            Possibility #2
            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

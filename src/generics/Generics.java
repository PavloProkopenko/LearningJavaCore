package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        // Java 5 version
        List listOfAnimals = new ArrayList();
        listOfAnimals.add("cat");
        listOfAnimals.add("dog");
        listOfAnimals.add("frog");

        String someAnimal = (String) listOfAnimals.get(1); // ArrayList have objects as default
        // With Generics
        List<String> listOfAnimals2 = new ArrayList<String>();

        listOfAnimals.add("dog");
        listOfAnimals.add("cat");
        listOfAnimals.add("cow");

        String someAnimal2 = listOfAnimals2.get(2);


        // Java 7

        List<String> listOfAnimals3 = new ArrayList<>();

    }
}

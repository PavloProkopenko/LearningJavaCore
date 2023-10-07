package wildcards;

import interfaces.Animal;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        Animal newAnimal1 = new Animal(1);
        Animal newAnimal2 = new Animal(2);
        Animal newAnimal3 = new Dog();
        listOfAnimal.add(newAnimal1);
        listOfAnimal.add(newAnimal2);
        listOfAnimal.add(newAnimal3);

        List<Dog> listOfDogs = new ArrayList<>();
        Dog newDog1 = new Dog();
        Dog newDog2 = new Dog();
        listOfDogs.add(newDog1);
        listOfDogs.add(newDog2);

        showList(listOfAnimal);
        showList(listOfDogs);
    }

    private static void showList(List<? extends Animal> list){ // We can use in this method only classes which
        // linked with Animal. Also, we can use super, if we want to use classes which are downer then some class
        // Wildcard
        for (Animal animal : list){
            System.out.println(animal);
        }
    }
}

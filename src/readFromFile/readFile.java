package readFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "D:\\JavaProd\\LearningJavaBase\\src\\readFromFile\\data.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        path = "D:\\JavaProd\\LearningJavaBase\\src\\readFromFile\\numbers.txt";
        File file1 = new File(path);
        scanner = new Scanner(file1);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");

        int[] arrayOfNumbers = new int[10];
        int counter = 0;
        for (String number: numbers ) {
            arrayOfNumbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(arrayOfNumbers));

        scanner.close();
    }
}

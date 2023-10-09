package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {


        try {
            System.out.println("Before scanner");
            readFile();
            System.out.println("After Scanner");
        } catch (FileNotFoundException e) {
            System.out.println("File does not exists");
        }

        System.out.println("After try/catch block");
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("somepath");
        Scanner scanner = new Scanner(file);
    }
}

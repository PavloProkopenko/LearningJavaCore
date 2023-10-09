package exceptions;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) throws ScannerException {

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Input number: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number != 0){
                throw new ScannerException("User input something but not 0");
            }
        }


    }
}

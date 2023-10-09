package writeToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile.txt");
        PrintWriter pw = new PrintWriter(file);

        pw.println("New line in file");
        pw.println("Second line of file");

        pw.close();

    }
}

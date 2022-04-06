package exceptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExcepDemo {
    public static void main(String[] args) throws FileNotFoundException {
        {
            File file = new File("/home/techvidvan/file.txt");
            FileReader fileReader = new FileReader(file);
            System.out.println("Successful");
        }
    }
}

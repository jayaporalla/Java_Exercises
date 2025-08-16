import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tryCatchException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("test.in"));
            System.out.println("Exit main");
            sc.close();
        } catch(FileNotFoundException ex){
            System.out.println("File not found caught...");
        } 
    }
}

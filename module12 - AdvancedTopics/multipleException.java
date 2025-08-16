import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class multipleException {
    public static void main(String[] args) {
        try{
            methodA();
            Scanner sc = new Scanner(new File("test.in"));
            System.out.println("Exit main()");
            sc.close();
        } catch(ArithmeticException ex){
            System.out.println("Airthmetic Exception caught...");
        } catch(FileNotFoundException ex){
            System.out.println("File not found caught...");
        } catch(Exception ex){
            System.out.println("Undefined new type exception");
        } finally {
            System.out.println("finally block of main code executed");
        }
        System.out.println("After try-catch-finally...");
    }

    public static void methodA(){
        System.out.println("Enter methodA()");
        try {
            System.out.println(1 / 0);
        } finally {
            System.out.println("finally in methodA()");
        }
        System.out.println("Exit methodA()");
    }
}

package inputAndOutput;
import java.io.*;
import java.util.*;

public class inputOutputExample {
    public static void main(String[] args) throws IOException{

        // BufferedReader Example
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name ");
        String s = br.readLine();
        System.out.println("You entered name is: " + s);


        // Scanner example
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name ");
        String st = sc.nextLine();
        System.out.println(st);
        sc.close();

        // Output methods example

        int x = 10;
        float y = 9.23f;
        String sr = "GFG";
        System.out.println(x);
        System.out.println(y);
        System.out.print(sr);
        System.out.println(" Courses");

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("Value of pi = %.2f\n", pi);
        System.out.printf("Value of pi = %6.3f\n", pi);

        // Escape sequence example

        System.out.println("c:\\xyz\\abc.txt");
        System.out.println("The best begineer website is \"GeeksforGeeks\" ");
        System.out.println("Hi, \nMy name is Jayasri");
    }
}

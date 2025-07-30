package module3;

import java.io.*;
import java.util.*;

public class Example {
    public static void main(String[] args) throws IOException{
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Enter your name ");
        // String s = br.readLine();
        // System.out.println("You entered name is: " + s);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name ");
        String s = sc.nextLine();
        System.out.println(s);
    }
}

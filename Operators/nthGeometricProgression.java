package Operators;
import java.util.*;

public class nthGeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int result =  a * (int) (Math.pow(r, n - 1));
        System.out.println("Result: " + result);
        sc.close();
    }
}

package Operators;
import java.util.Scanner;

public class nthArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter d: ");
        int d = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int result = a + (n - 1) * d;
        System.out.println("The result is: " + result);
        sc.close();
    }
}

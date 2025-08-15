import java.util.Scanner;

public class sumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        float result = (n * (n + 1)) / 2;
        System.out.println("The sum of " + n + " natural numbers is: " + result);
        sc.close();
    }
}

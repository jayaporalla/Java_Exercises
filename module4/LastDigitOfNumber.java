package module4;
import java.util.*;

public class LastDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int result = Math.abs(n % 10);
        System.out.println("Result: " + result);
        sc.close();
    }
}

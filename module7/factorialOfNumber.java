package module7;
import java.util.Scanner;

public class factorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        System.out.println(result);
        sc.close();
    }
}

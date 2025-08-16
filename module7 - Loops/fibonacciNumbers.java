import java.util.Scanner;

public class fibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i = b; i < n; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
        sc.close();
    }
}

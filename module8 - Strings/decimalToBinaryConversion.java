import java.util.Scanner;

public class decimalToBinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        String digit = "";
        while(n > 0){
            digit = n % 2 + digit;
            n = n / 2;
        }
        System.out.println("Result: " + digit);
        sc.close();
    }
}

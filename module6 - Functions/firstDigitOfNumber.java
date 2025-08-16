import java.util.Scanner;

public class firstDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        while(n > 10){
            n = n / 10;
        }
        System.out.println(n);
        sc.close();
    }
}

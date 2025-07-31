package module6;
import java.util.Scanner;

public class primeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Prime numbers are: ");
        while(n % 2 == 0){
            System.out.print(2 + " ");
            n = n / 2;
        }
        while(n % 3 == 0){
            System.out.print(3 + " ");
            n = n / 3;
        }
        for(int i = 5; i*i <= n; i=i+2){
            while(n % i == 0){
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if(n > 1){
            System.out.println(n);
        }
        sc.close();
    }
}

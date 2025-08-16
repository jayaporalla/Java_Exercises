import java.util.Scanner;

public class gcdOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int min = Math.min(a, b);
        int max = 0;
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0){
               max = i;
            }
        }
        System.out.println("Result: " + max);
        sc.close();
    }
}

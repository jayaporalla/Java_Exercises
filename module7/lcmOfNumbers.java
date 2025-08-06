package module7;
import java.util.Scanner;

public class lcmOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int mul = a * b;
        int max = Math.max(a, b);
        int result = 1;
        for(int i = max; i <= mul; i++){
            if(i % a == 0 && i % b == 0){
                result = i;
                break;
            }
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}

package module7;
import java.util.Scanner;

public class invertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int k = 1; k <= n; k++){
            for(int i = 0; i < n - k; i++){
                System.out.print(" " + " ");
            }
            for(int j = 0; j < k; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

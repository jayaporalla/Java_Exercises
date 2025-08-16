import java.math.BigInteger;
import java.util.Scanner;

public class fibonacciBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        sc.close();
    }

    private static BigInteger fibonacci(int n){

        if(n == 0) return BigInteger.ZERO;
        if(n == 1) return BigInteger.ONE;

        BigInteger A = BigInteger.ZERO;
        BigInteger B = BigInteger.ONE;
        BigInteger result = BigInteger.ZERO;
        for(int i = 2; i <= n; i++){
            result = A.add(B);
            A = B;
            B = result;
        }
        return result;
    }
}

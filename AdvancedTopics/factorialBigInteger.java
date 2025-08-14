package AdvancedTopics;
import java.math.BigInteger;
import java.util.Scanner;

public class factorialBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
    private static BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE;
        for(int i = 1; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

import java.math.BigInteger;
import java.util.Scanner;

public class checkPrimeNextPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = sc.nextInt();
        System.out.print("Checking entered number whether prime or not, true if it's prime and false if it's not a prime: ");
        System.out.print(isPrime(N));
        System.out.print("\nThe prime number after " + N + " is " + nextPrime(N));
        sc.close();
    }

    private static int nextPrime(int N){
        BigInteger n = BigInteger.valueOf(N);
        String s = n.nextProbablePrime().toString();
        return Integer.parseInt(s);
    }

    private static boolean isPrime(int N){
        BigInteger n = BigInteger.valueOf(N);
        return n.isProbablePrime(1);
    }
}

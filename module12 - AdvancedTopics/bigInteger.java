import java.math.BigInteger;
import java.util.Scanner;

public class bigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A value: ");
        BigInteger A = new BigInteger(sc.next());
        System.out.print("Enter B value: ");
        BigInteger B = new BigInteger(sc.next());
        BigInteger C = A.add(B);
        System.out.println("A + B = " + C);
        BigInteger D = A.multiply(B);
        System.out.println("A * B = " + D);
        BigInteger E = A.divide(B);
        System.out.println("A / B = " + E);
        BigInteger F = A.subtract(B);
        System.out.println("A - B = " + F);
        BigInteger I = A.remainder(B);
        System.out.println("A % B = " + I);
        System.out.println(A.compareTo(B));
        sc.close();
    }
}

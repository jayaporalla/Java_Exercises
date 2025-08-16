import java.util.Scanner;

public class binaryToDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String s = sc.nextLine();
        int m = 0;
        int k = 1;
        for(int i = s.length() - 1; i >= 0; i--){
            m += (s.charAt(i) - '0') * k;
            k = k * 2;
        }
        System.out.println("Result is: " + m);
        sc.close();
    }
}

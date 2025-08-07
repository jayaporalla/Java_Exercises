package module8;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String result = "";
        for(int i = s.length() - 1; i >= 0; i--){
            result += s.charAt(i);
        }
        System.out.println("Reversed String is: " + result);
        sc.close();
    }
}

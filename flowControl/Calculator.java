package flowControl;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.print("Select an operation from 1 - 4: ");
        System.out.println("\n1. Addition  \n2. Subtraction  \n3. Multiplication  \n4. Division");
        int operation = sc.nextInt();
        int result = 0;
        switch(operation){
            case 1:
                result = first + second;
                break;
            case 2:
                result = Math.abs(first - second);
                break;
            case 3:
                result = first * second;
                break;
            case 4:
                result = first / second;
                break;
            default:
                System.out.println("Enter operation number");
        }
        System.out.println("Result is: " + result);
        sc.close();
    }
}

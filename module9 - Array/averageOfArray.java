import java.util.Scanner;

public class averageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: " + "");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int average = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        average = sum / n;
        System.out.println("Average of Array: " + average);
        sc.close();
    }
}

package Array;
import java.util.Scanner;

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        System.out.print("Enter array numbers: " + "");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean boo = true;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]) {
                boo = false;
                break;
            } 
        }
        if(boo){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
package module9;
import java.util.Scanner;

public class countDistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: " + "");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(countDistinct(arr, n));
        sc.close();
    }

    private static int countDistinct(int[] arr, int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            boolean boo = true;
            for(int j = i - 1; j >= 0; j--){
                if(arr[i] == arr[j]){
                    boo = false;
                    break;
                }
            }
            if(boo == true){
                count++;
            }
        }
        return count;
    }
}

package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class smallerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: " + "");
        ArrayList<Integer> arr = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        System.out.print("Enter x value: ");
        int x = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(arr.get(i) < x){
                result.add(arr.get(i));
            }
        }
        System.out.print("Result array: " + result);
        sc.close();
    }
}

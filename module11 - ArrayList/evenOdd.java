import java.util.*;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: " + "");
        ArrayList<Integer> arr = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(arr.get(i) % 2 == 0){
                even.add(arr.get(i));
            } else {
                odd.add(arr.get(i));
            }
        }
        System.out.print("Even numbers are: " + even);
        System.out.print("\nOdd numbers are: " + odd);
        sc.close();
    }
}

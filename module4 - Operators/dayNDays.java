import java.util.*;

public class dayNDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        int d = sc.nextInt();
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(n > 7) {
            n = n - 7;
            d = d - n;
            if(d < 0){
                d = d + 7;
            }
            System.out.println(d);
        } else {
            System.out.println(d - n);
        }
        sc.close();
    }
}

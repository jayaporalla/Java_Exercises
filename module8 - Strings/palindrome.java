import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println(checkingPalindrome(s));
        sc.close();
    }

    private static String checkingPalindrome(String s){
        if(s.length() == 1){
            return "Yes";
        }
        int start = 0;
        int end = s.length() - 1;
        boolean boo = true;
        for(int i = start; i <= end; i++){
            if(s.charAt(start) != s.charAt(end)) {
                boo = false;
                break;
            }
            start++;
            end--;
        }
        if(boo == true){
            return "Yes";
        } 
        return "No";
    }
}

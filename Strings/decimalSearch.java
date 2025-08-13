package Strings;
import java.util.Scanner;

public class decimalSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        String txt = sc.nextLine();
        String pat = ".";
        System.out.println(patternSearch(txt, pat));;
        sc.close();
    }

    private static String patternSearch(String txt, String pat){
        int index = txt.indexOf(pat);
        if(txt.contains(pat)){
            System.out.println(txt.substring(index + 1));
        }
        return txt;
    }
}

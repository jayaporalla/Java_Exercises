package module8;
import java.util.Scanner;

public class patternSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String txt = sc.nextLine();
        System.out.print("Enter pattern to search in text: ");
        String pat = sc.nextLine();
        patternSearch(txt, pat);
        sc.close();
    }

    private static void patternSearch(String txt, String pat){
        int index = txt.indexOf(pat);
        while(index >= 0){
            System.out.print(index + " ");
            index = txt.indexOf(pat, index + 1);
        }
    }
}

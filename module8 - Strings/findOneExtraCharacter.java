import java.util.Scanner;

public class findOneExtraCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string2: ");
        String s2 = sc.nextLine();
        extraCharacter(s1, s2);
        sc.close();
    }

    private static void extraCharacter(String s1, String s2){
        int freq[] = new int[256];
        for(int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i)]++;
        }
        for(int i = 0; i < s2.length(); i++){
            freq[s2.charAt(i)]--;
        }
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0){
                System.out.println((char) i);
                break;
            }
        }
    }
}

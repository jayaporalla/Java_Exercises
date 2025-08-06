package module8;

public class pangram {
    public static void main(String[] args) {
        String s = "Thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(s));
    }

    private static boolean isPangram(String s){
        int n = s.length();
        if(n < 26){
            return false;
        }
        boolean ch[] = new boolean[26];
        for(int i = 0; i < n; i++){
            char cha = s.charAt(i);
            if(cha >= 'a' && cha <= 'z'){
                ch[cha - 'a'] = true;
            }
            if(cha >= 'A' && cha <= 'Z'){
                ch[cha - 'A'] = true;
            }
        }
        for(int i = 0; i < 26; i++){
            if(ch[i] == false){
                return false;
            }
        }
        return true;
    }
}

package module8;

public class stringBufferStringBuilder {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("geeks");
        StringBuffer s2 = s1;
        if(s1 == s2){
            System.out.println("Both are refering to same position");
        } else {
            System.out.println("Both are not refering to same position");
        }
    }
}

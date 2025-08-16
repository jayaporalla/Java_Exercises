public class stringMethods {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = s1;
        s1 += "forgeeks";
        if(s1 == s2){
            System.out.println("Both are refering to same position");
        } else {
            System.out.println("Both are not refering to same position");
        }

        //String Methods
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        s1 = "geeks";
        String s3 = "GeEkS";
        if(s1.contains(s3.toLowerCase())){
            System.out.println("s1 contains s3");
        } else {
            System.out.println("s1 not contains s3");
        }
        System.out.println(s1.equalsIgnoreCase(s3));

        int result = s1.compareTo(s3);
        if(result == 0){
            System.out.println("Same");
        } else if(result > 0){
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        String s4 = s1.substring(2);
        System.out.println("Substring of s1 is: " + s4);
        System.out.println(s4.indexOf('k'));
        System.out.println(s4.charAt(1));
    }
}

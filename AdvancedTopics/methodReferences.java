package AdvancedTopics;
import java.util.Arrays;
import java.util.List;

public class methodReferences {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 15, 5);
        // list.forEach(System.out::println);
        // list.forEach(x -> System.out.print(x + " "));
        list.forEach(methodReferences::Print);
        String a[] = {"gfg", "geek", "courses"};
        String b[] = {"GFG", "GEEK", "COURSES"};
        if(Arrays.equals(a, b, String::compareToIgnoreCase)){
            System.out.println("Both a and b have same values");
        } else {
            System.out.println("Both a and b doesn't have same values");
        }
    }

    private static void Print(Integer x){
        System.out.print(x * x + " ");
    }
}

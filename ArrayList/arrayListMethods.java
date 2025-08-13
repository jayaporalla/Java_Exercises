package ArrayList;
import java.util.ArrayList;

public class arrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("geeks");
        list.add("for");
        list.add("geeks");
        System.out.println("Arraylist items are: " + list);
        System.out.println("Arraylist size is: " + list.size());
        System.out.println(list.get(1));
        list.add(3, "course");
        System.out.println("Arraylist items are: " + list);
        System.out.println(list.contains("course"));
        list.remove(3);
        System.out.println("Arraylist items are: " + list);
        list.set(2, "geeks is a course");
        System.out.println("Arraylist items are: " + list);
        System.out.println(list.indexOf("for"));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
    }
}

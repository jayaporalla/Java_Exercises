import java.util.ArrayList;

public class arrayListLoopExample {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(100);
        array.ensureCapacity(1000);
        for(int i = 0; i <= 100; i++){
            array.add(i);
        }
        System.out.print("ArrayList items are: " + array);
    }
}

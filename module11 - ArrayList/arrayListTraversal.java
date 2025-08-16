import java.util.ArrayList;
import java.util.Iterator;

public class arrayListTraversal {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(4);
        arr.add(10);
        arr.add(15);
        arr.add(20);
        arr.add(5);
        System.out.print("Arraylist items are: ");
        
        //method1 traversal
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }

        System.out.print("\nArraylist items are: ");
        //method2 traversal
        for(Integer x : arr){
            System.out.print(x + " ");
        }

        System.out.print("\nArraylist items are: ");
        //method3 traversal
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.print("\nArraylist items are: ");
        //method3 traversal with condition by removing items
        Iterator<Integer> it1 = arr.iterator();
        while(it1.hasNext()){
            int x = (Integer) it1.next();
            if(x < 10){
                it1.remove();
            } else {
                System.out.print(x + " ");
            }
        }

         System.out.print("\nArraylist items are: ");
        //method4 traversal
        arr.forEach(x -> System.out.print(x + " "));
    }
}

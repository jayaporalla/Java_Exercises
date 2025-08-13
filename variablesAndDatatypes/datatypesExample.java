package variablesAndDatatypes;

public class datatypesExample {
    public static void main(String[] args) {
        int x = 10;
        float y = 13.45f;
        char gender = 'M';
        System.out.println("x: " + x + ", " + "y: " + y + ", " + "gender: " + gender);

        int a = 65;
        float b = a; //Autoboxing
        char ch = (char) b; //Auto-unboxing
        System.out.println("ch: " + ch);
    }
}

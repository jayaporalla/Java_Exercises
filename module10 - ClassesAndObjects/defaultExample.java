class Point {
    void run1(){ //here not mentioned any public or private for method type so by default it consider default
        System.out.println("Hello");
    }
}

public class defaultExample {
    public static void main(String[] args) {
        Point p = new Point();
        p.run1();
    }
}
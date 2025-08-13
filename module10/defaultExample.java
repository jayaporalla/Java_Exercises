package module10;

class Point {
    void run1(){ //here not mentioned any public or private for method type so by default it consider default
        System.out.println("Hello");
    }
}

public class defaultExample extends Point1 {
    public static void main(String[] args) {
        Point p = new Point();
        Point1 P = new Point1();
        p.run1();
        P.run();
    }
}
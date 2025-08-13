package classesAndObjects;

class Points {
    int x, y;
    // Point(int a, int b){
    //     x = a;
    //     y = b;
    // }
    Points(int x, int y){
        this.x = x;
        this.y = y;
    }
    Points setX(int x){
        this.x = x;
        return this;
    }
    Points setY(int y){
        this.y = y;
        return this;
    }
    void print(){
        System.out.println("X = " + x + ", Y = " + y);
    }
}

public class thisKeywordExample {
    public static void main(String[] args) {
        Points p1 = new Points(10, 20);
        Points p2 = new Points(5, 15);
        p1.print();
        // p2.setX(3).setY(6);
        p2.print();
    }
}

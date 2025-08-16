class Test {
    int x, y;
    Test(int i, int j){
        x = i;
        y = j;
    }
    Test(){
    }
    void print(){
        System.out.println("X = " + x + ", Y = " + y);
    }
}

public class constructorExample {
    public static void main(String[] args) {
        Test t = new Test(10, 20);
        Test t1 = new Test();
        t.print();
        t1.print();
    }
}

package ClassesAndObjects;

class A {
    final int MAX = 100;
}

public class finalKeywordExample {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.MAX);
        final StringBuffer sb = new StringBuffer("Jaya");
        sb.append("sri");
        System.out.println(sb);
    }
}

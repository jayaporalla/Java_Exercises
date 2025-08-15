package AdvancedTopics;

public class arithmeticException {
    public static void main(String[] args) {
        try{
            methodA();
        } catch(ArithmeticException ex){
            System.out.println("Exception caught...");
            ex.printStackTrace(); //very useful in case of debugging to know the exact line code fault
        }
        System.out.println("Exited main method");
    }

    public static void methodA(){
        try{
            System.out.println("Entered methodA()");
            int a = 5, b = 0;
            int c = a / b;
            System.out.println(c);
        } finally {
            System.out.println("Finally block code executed");
        }
        System.out.println("Exited methodA()");
    }
}

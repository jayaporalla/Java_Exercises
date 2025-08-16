public class throwThrowsException {
    public static void main(String[] args) {
        try{
            methodA();
            System.out.println("Exit main()");
        } catch(ArithmeticException ex){
            System.out.println("Exeception caught...");
        }
    }

    public static void methodA() throws ArithmeticException{
        try{
            int a = 5, b = 5;
            if(b == 0){
                throw new ArithmeticException();
            } else {
                int c = a / b;
                System.out.println(c);
                System.out.println("Executed methodA()");
            }
        } finally{
            System.out.println("Exited finally block");
        }
    }
}

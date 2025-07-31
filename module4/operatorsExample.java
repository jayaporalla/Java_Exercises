package module4;

public class operatorsExample {
    public static void main(String[] args) {

        //Airthmetic Operator
        int x = 10;
        int y = 20;
        System.out.print("x + y : ");
        System.out.println(x + y);
        System.out.print("y - x : ");
        System.out.println(y - x);
        System.out.print("x * y : ");
        System.out.println(x * y);
        System.out.print("y / x : ");
        System.out.println(y / x);
        System.out.print("y % x : ");
        System.out.println(y % x);

        //Assignment Operator
        int z = 15;
        z += y;
        System.out.print("Z value is: ");
        System.out.println(z);

        //Logical Operator
        boolean isValid = false;
        if(x != 0 && x < 0){
            System.out.println("Invalid or Negative Number");
        } else {
            System.out.println("The value of x is: " + x);
        }
        System.out.println("The value of isValid is: " + !isValid);

        //Relational or Comparison Operator
        if( x <= y) {
            System.out.println("Value of " + x + " is greater than " + y);
        } else {
            System.out.println("Value of " + x + " is less than " + y);
        }

        //Bitwise Operator
        System.out.println("The bitwise value of x is: " + ~x);
        System.out.println("left shift of " + x + " is " + (x << 1));
        System.out.println("right shift of " + x + " is " + (x >> 1));
        System.out.println("unsigned right shift of " + y + " is " + (x >>> 1));
    }
}

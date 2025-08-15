package AdvancedTopics;

class InvalidBalanceException extends Exception {
    public InvalidBalanceException(String message){
        super(message);
    }
}

public class userDefinedExceptions {
    public static void main(String[] args) {
        int balance;
        try{
            balance = Integer.parseInt(args[0]);
            updateBalance(balance);
        } catch(InvalidBalanceException ex){
            System.out.println("caught in catch of invalidbalanceexception");
            ex.printStackTrace();
        } catch(NumberFormatException ex){
            System.out.println("caught in catch of numberformatexception");
        } catch(Exception ex){
            System.out.println("caught in catch of parent exception");
        }
        System.out.println("Main method executed successfully.");
    }

    public static void updateBalance(int number) throws InvalidBalanceException{
        if(number < 0){
            throw new InvalidBalanceException("Account balance cannot be less than zero");
        }
        System.out.println("No exception occured in updateBalance() method");
    }
}

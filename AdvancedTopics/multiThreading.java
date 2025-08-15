package AdvancedTopics;

class Test extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Inside thread");
        }
    }
}

public class multiThreading {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        for(int i = 0; i < 5; i++){
            System.out.println("Inside Main");
            try{
                Thread.sleep(1);
            } catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}

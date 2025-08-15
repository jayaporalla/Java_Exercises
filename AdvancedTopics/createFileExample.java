package AdvancedTopics;
import java.io.*;

public class createFileExample {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Program Files\\GFG Pratice Folder\\Java\\File.txt");
            if(file.createNewFile()){
                System.out.println(file.getName());
            } else {
                System.out.println("Something gone wrong");
            }
        } catch(IOException e){
            System.out.println("Error message: " + e.getMessage());
        }
    }
}

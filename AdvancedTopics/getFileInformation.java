package AdvancedTopics;
import java.io.*;

public class getFileInformation {
    public static void main(String[] args) {
        File file = new File("C:\\Program Files\\GFG Pratice Folder\\Java\\File.txt");
        if(file.exists()){
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.length());
        } else {
            System.out.println("File doesn't exists");
        }
    }
}

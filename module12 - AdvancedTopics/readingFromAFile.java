import java.io.*;
import java.util.Scanner;

public class readingFromAFile {
    public static void main(String[] args) {
        try {
            File text = new File("C:\\Program Files\\GFG Pratice Folder\\Java\\Text.txt");
            Scanner sc = new Scanner(text);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch(IOException e){
            System.out.println("Error occured: " + e.getMessage());
        }
    }
}

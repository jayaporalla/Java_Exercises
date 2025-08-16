import java.io.*;

public class writingInAFile {
    public static void main(String[] args) {
        try{
            FileWriter text = new FileWriter("C:\\Program Files\\GFG Pratice Folder\\Java\\Text.txt");
            text.write("I love to solve problems in a very logical way and implement best efficient solutions on it");
            text.close();
            System.out.println("Successfully written in Text.txt");
        } catch(IOException e){
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}

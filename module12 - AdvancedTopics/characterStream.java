import java.io.*;

public class characterStream {
    public static void main(String[] args) {
        try{
            FileReader in = new FileReader("reader.txt");
            FileWriter out = new FileWriter("writer.txt");
            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
            in.close();
            out.close();
        } catch(IOException e){
            System.out.println("Error message: " + e.getMessage());
        }
    }
}

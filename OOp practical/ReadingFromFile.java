import java.io.*;
public class ReadingFromFile {
    public static void main(String[] args) {
        try{
            FileInputStream in = new FileInputStream("data.txt");
            int c;
            while((c=in.read())!=-1){
            System.out.print((char)c);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

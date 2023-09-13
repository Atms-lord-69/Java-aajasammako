import java.io.FileReader;
import java.util.io.*;
public class ReaderWriter{
    public static void main(String[] args) {
        
    try {
        FileReader r = new FileReader("D:\\OOp practical\\abc.txt");
        FileReader w = new FileReader("D:\\OOp practical\\pqr.txt");
        int c;
        while((c = r.read())!=-1){
            w.write(c);
        }
        System.out.println("Written Succesfully!");
    } 
    catch(Exception e){
        // TODO: handle exception
        System.err.println(e);
    }
    }
}

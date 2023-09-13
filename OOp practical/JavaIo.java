import java.beans.Expression;
import java.io.*;
public class JavaIo {
    public static void main(String[] args) {
        try{
            FileInputStream in = new FileInputStream("d:\\OOp practical\\abc.txt");
            FileOutputStream out = new FileOutputStream("d:\\OOp practical\\xyz.txt");
            int c;
            while((c=in.read())!=-1){
                out.write(c);
            }
            System.out.println("Written Sucessfully");
        }
        catch(Exception ie){
            System.err.println(ie);
        }
    }
}

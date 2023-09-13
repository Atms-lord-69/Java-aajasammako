import java.io.*;
import java.util.*;
public class WritingToFile {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        try {
            FileOutputStream fw = new FileOutputStream("data.txt");
            System.out.println("Enter any Text:-");
            String text = imp.nextLine();
            for(int i = 0; i< text.length();i++){
                fw.write(text.charAt(i));
                System.out.print(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
    }
}

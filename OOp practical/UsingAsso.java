import java.awt.*;
public class UsingAsso{

    // using inheritance
    UsingAsso(){
        Frame f = new Frame();
        Label num1 = new Label("Enter First Number");
        Label num2 = new Label("Enter Second Number");
        Label result = new Label("Result");
        TextField n1 = new TextField();
        TextField n2 = new TextField();
        TextField re = new TextField();
        Button add = new Button("Add");
        num1.setBounds(50,50,120,20);
        n1.setBounds(180,50,120,20);
        num2.setBounds(50,100,120,20);
        n2.setBounds(180,100,120,20);
        add.setBounds(150,150,120,20);
        result.setBounds(100,200,70,20);
        re.setBounds(180,200,120,20);
        f.add(num1);
        f.add(num2);
        f.add(n1);
        f.add(n2);
        f.add(add);
        f.add(result);
        f.add(re);
        f.setSize(400, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("Addition");
    }
    public static void main(String[] args) {
        UsingAsso aw= new UsingAsso();
    }
}



import java.awt.*;
import java.awt.event.*;
public class EventHandlingGui implements ActionListener{
    TextField n1;
    TextField n2;
    Label result;
    TextField re;

    EventHandlingGui(){
        Frame f = new Frame();
        Label num1 = new Label("Enter First Number");
        Label num2 = new Label("Enter Second Number");
         result = new Label("Result");
         n1 = new TextField();
         n2 = new TextField();
         re = new TextField();
        Button add = new Button("Add");
        Button add = new Button("null")
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
        add.addActionListener(this);
        f.add(re);
        f.setSize(400, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("Addition");
    }
     public void actionPerformed(ActionEvent e){
        int numa=Integer.parseInt(n1.getText());
        int numb=Integer.parseInt(n2.getText());
        int sum = numa+numb;
        //result.setText("sum:-"+sum);
        re.setText(String.valueOf(sum));
    }
    public static void main(String[] args) {
        EventHandlingGui aw= new EventHandlingGui();
    }
}


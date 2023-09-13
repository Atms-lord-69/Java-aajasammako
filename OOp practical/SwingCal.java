import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SwingCal extends JFrame implements ActionListener {
    JTextField n1;
    JTextField n2;
    JLabel result;
    JTextField re;
    JButton add;
    JButton sub;
    JButton mul;
    JButton div;

    SwingCal() {
        JLabel lblnum1 = new JLabel("Enter First Number");
        JLabel lblnum2 = new JLabel("Enter Second Number");
        JLabel lblresult = new JLabel("Result");
        n1 = new JTextField(10);
        n2 = new JTextField(10);
        re = new JTextField(10);
        add = new JButton("Add");
        sub = new JButton("Subtract");
        mul = new JButton("Multiply");
        div = new JButton("Divide");

        add(lblnum1);
        add(n1);
        add(lblnum2);
        add(n2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(lblresult);
        add(re);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setTitle("Calculator");
        setSize(310, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(n1.getText());
            int b = Integer.parseInt(n2.getText());

            if (e.getSource() == add) {
                int sum = a + b;
                re.setText(String.valueOf(sum));
            } else if (e.getSource() == sub) {
                int diff = a - b;
                re.setText(String.valueOf(diff));
            } else if (e.getSource() == mul) {
                int pro = a * b;
                re.setText(String.valueOf(pro));
            } else if (e.getSource() == div) {
                if (b == 0) {
                    re.setText("Error: Division by zero");
                } else {
                    float quot = (float) a / b;
                    re.setText(String.valueOf(quot));
                }
            }
        } catch (NumberFormatException ex) {
            re.setText("Error: Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingCal se = new SwingCal();
    }
}

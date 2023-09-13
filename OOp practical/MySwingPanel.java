import javax.swing.*;
import java.awt.*;
class MySwingPanel{
    MySwingPanel(){
        JFrame frame = new JFrame("My First Swing App");
        JPanel jp = new JPanel();
        JLabel lblName = new JLabel("Enter Name:");
        // JTextField txtName = new JTextField();
        JLabel lblAge = new JLabel("Enter Age:");
        JTextField txtAge = new JTextField();
        JButton btnSubmit = new JButton("Submit");
        JButton btnCancel = new JButton("Cancel");
        jp.setLayout(new BorderLayout(15,5));
        jp.add(lblName, BorderLayout.NORTH);
        // jp.add(txtName, BorderLayout.NORTH);
        jp.add(lblAge, BorderLayout.WEST);
        jp.add(txtAge, BorderLayout.CENTER);
        jp.add(btnSubmit, BorderLayout.SOUTH);
        jp.add(btnCancel, BorderLayout.EAST);
        
        frame.add(jp);
        frame.setSize(400,400);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        MySwingPanel sp = new MySwingPanel();
    }
}
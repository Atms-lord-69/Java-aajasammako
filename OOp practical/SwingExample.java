import java.awt.FlowLayout;
import javax.swing.*;
public class SwingExample extends JFrame {
    SwingExample(){

        String prog[]={"BCA","BBA","BIT"};
        JLabel lblName = new JLabel("Name");
        lblName.setBounds(50,20,100,20);
        JTextField txtName=new JTextField();
        txtName.setBounds(100,20,100,20);
        JLabel lblAge = new JLabel("Age");
        lblAge.setBounds(50,50,100,20);
        JTextField txtAge=new JTextField();
        txtAge.setBounds(100,50,100,20);
        JLabel lblAddress = new JLabel("Address");
        lblAddress.setBounds(50,80,100,20);
        JTextField txtAddress=new JTextField();
        txtAddress.setBounds(100,80,100,20);
        JLabel lblGender = new JLabel("Gender");
        lblGender.setBounds(50,110,100,20);
        JRadioButton jrbM = new JRadioButton("Male");
        jrbM.setBounds(100,110,60,20);
        JRadioButton jrbF = new JRadioButton("Female");
        jrbF.setBounds(170,110,80,20);
        JRadioButton jrbO = new JRadioButton("Other");
        jrbO.setBounds(250,110,60,20);
        JLabel lblProgram = new JLabel("Program");
        lblProgram.setBounds(50,140,100,20);
        JComboBox cmbProg = new JComboBox(prog);
        cmbProg.setBounds(100,140,70,20);
        JLabel lblInterest = new JLabel("Interest");
        lblInterest.setBounds(50,170,100,20);
        JCheckBox cbr = new JCheckBox("Reading");
        cbr.setBounds(100,170,100,20);
        JCheckBox cbs = new JCheckBox("Swimming");
        cbs.setBounds(100,200,100,20);
        JCheckBox cbt = new JCheckBox("Travelling");
        cbt.setBounds(100,230,100,20);
        JButton btn1 = new JButton("Submit");
        btn1.setBounds(100, 260, 80, 20);
        JButton btn2 = new JButton("Clear");
        btn2.setBounds(200, 260, 80, 20);
        add(lblName);
        add(txtName);
        add(lblAge);
        add(lblAddress);
        add(lblGender);
        add(lblProgram);
        add(lblInterest);
        add(txtAge);
        add(txtAddress);
        add(jrbM);
        add(jrbF);
        add(jrbO);
        add(cmbProg);
        add(cbr);
        add(cbs);
        add(cbt);
        add(btn1);
        add(btn2);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        






    }
        public static void main(String[] args) {
            SwingExample sw = new SwingExample();
        }

}
        
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingSwing implements KeyListener {
    JLabel lblBox = new JLabel("Label");
    JTextField txtBox = new JTextField();
    SwingSwing(){
        JFrame f = new JFrame("Swing Swing");
        txtBox.setBounds(50, 50, 150, 20);
        lblBox.setBounds(50, 80, 150, 20);
        txtBox.addKeyListener(this);
        f.add(txtBox);
        f.add(lblBox);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    public void keyPressed(KeyEvent e){
        lblBox.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e){
        lblBox.setText("Key Released");
    }
    public void keyTyped(KeyEvent e){
        lblBox.setText("You are Typing...");
    }
    public static void main(String[] args) {
        SwingSwing ss = new SwingSwing();
    }
}

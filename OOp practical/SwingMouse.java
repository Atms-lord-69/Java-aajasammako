import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingMouse implements MouseListener {
    JLabel lblBox = new JLabel("Label");
    JTextField txtBox = new JTextField();
    SwingMouse(){
        JFrame f = new JFrame("Swing Swing");
        txtBox.setBounds(50, 50, 150, 20);
        lblBox.setBounds(50, 80, 150, 20);
        txtBox.addMouseListener(this);
        f.add(txtBox);
        f.add(lblBox);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    public void mousePressed(MouseEvent e){
        lblBox.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e){
        lblBox.setText("Mouse Released");
    }
    public void mouseExited(MouseEvent e){
        lblBox.setText("Mouse Exited");
    }
    public void mouseEntered(MouseEvent e){
        lblBox.setText("Mouse Entered");
    }
    public void mouseClicked(MouseEvent e){
        lblBox.setText("Mouse Clicked");
    }
    public static void main(String[] args) {
        SwingMouse sm = new SwingMouse();
    }
}

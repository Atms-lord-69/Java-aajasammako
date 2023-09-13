import java.awt.*;

public class AsbractWindow extends Frame {
    AsbractWindow(){
        Button b = new Button("Click Here");
        b.setSize(80, 20);
        add(b);
        setSize(300,300);
        setTitle("First Gui Form");
        setVisible(true);
        setLayout(null);

    }
    public static void main(String[] args) {
        AsbractWindow fg = new AsbractWindow();
    }
}

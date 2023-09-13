import javax.swing.*;
public class SwingTable {
    SwingTable(){
        JFrame f = new JFrame("JTableExample");
        String[][] data={{"Ram", "25", "KTM"}, {"Sita", "22", "PKR"}};
        String[] columName = {"Name", "Age", "Address"};
        JTable jt = new JTable(data, columName);
        jt.setBounds(20, 020, 200, 50);
        JScrollPane sp = new JScrollPane(jt);
        f.add(jt);
        f.add(sp);
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String[] args) {
        SwingTable st = new SwingTable();
    }
}

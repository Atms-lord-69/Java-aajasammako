import javax.swing.*;

class MenuExample { // JMenuBar
    // JMenuItem
    // JMenu
    JMenu menu1, submenu, menu2, menu3;
    JMenuItem mi1, mi2, mi3, mi4, mi5, micopy, micut, mipaste;

    MenuExample() {
        JFrame f = new JFrame("Menu Example");
        JMenuBar mb = new JMenuBar();
        menu1 = new JMenu("File");
        menu2 = new JMenu("Edit");
        menu3 = new JMenu("Help");

        submenu = new JMenu("Sub Menu");
        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        mi3 = new JMenuItem("Save As");
        mi4 = new JMenuItem("Print");
        mi5 = new JMenuItem("Exit");
        micopy = new JMenuItem("Copy");
        micut = new JMenuItem("Cut");
        mipaste = new JMenuItem("Paste");

        menu1.add(mi1);
        menu1.add(mi2);
        menu1.add(mi3);
        submenu.add(mi4);
        submenu.add(mi5);
        menu1.add(submenu);
        menu2.add(micopy);
        menu2.add(micut);
        menu2.add(mipaste);

        mb.add(menu1);
        mb.add(menu2);
        mb.add(menu3);
        f.setJMenuBar(mb);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new MenuExample();
    }
}
package AppGUI;
import javax.swing.*;

public class AppLayout {
    private JPanel rootPanel = new JPanel();
    private JScrollBar scrollBar1;
    private JTextField helloTextField;

    static void main(String[] args) {
        JFrame frame = new JFrame("My GUI App");
        frame.setContentPane(new AppLayout().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    //public static void main(String a[]) {new AppLayout()};
}

package AppGUI;

import javax.swing.*;

public class AppLayout {
    private JPanel rootPanel = new JPanel();
    private JTabbedPane tabbedPane1;

    public AppLayout() {
        PrepareApp();
    }
    public static void main(String[] args) {
        AppLayout layout = new AppLayout();
    }

    private void PrepareApp() {
        JFrame frame = new JFrame("My GUI App");
        frame.setSize(1000,1000);
        frame.setContentPane(this.rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

import javax.swing.*;
public class swing {
    public class Main {
        static void main(String[] args) {
            // create an instance of JFrame - a swing window
            JFrame frame = new JFrame("hello, world");
            frame.setSize(300, 200);
            // shut down application when we close window
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new MyPanel("string of text :)"));

            // show the window
            frame.setVisible(true);
        }
    }


}

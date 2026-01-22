package AppGUI;

// Java program to create three buttons
// with caption OK, SUBMIT, CANCEL
import javax.swing.*;
import java.awt.*;


class button {
    button()
    {
        Frame f = new Frame();

        // Button 1 created
        // OK button
        Button b1 = new Button("OK");
        b1.setBounds(100, 50, 80, 50);
        b1.addActionListener(e -> System.out.println("Button Clicked!"));
        f.add(b1);

        // Button 2 created
        // Submit button
        Button b2 = new Button("Submit");
        b2.setBounds(100, 101, 80, 50);
        b2.addActionListener(e -> System.out.println("Button 2 Clicked!"));
        f.add(b2);

        // Button 3 created
        // Cancel button
        Button b3 = new Button("Cancel");
        b3.setBounds(400, 400, 80, 50);
        b3.addActionListener(e -> f.dispose());
        f.add(b3);

        f.setPreferredSize(new Dimension(500,500));
        f.setLayout(null);
        f.setVisible(true);
        f.setBackground(new Color(100,100,100));
    }

    public static void main(String[] args) { new button(); }
}


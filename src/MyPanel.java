//import javax.swing.*;
//import java.awt.event.*;
//
//public class MyPanel extends JPanel {
//
//
//        JLabel myLabel; //a text label
//        JTextField myTextField;
//        JButton myButton;
//        ActionEvent event;
//
//        //constructor
//        MyPanel(String text) {
//            myLabel = new JLabel(text);
//            add(myLabel); //place component on panel
//
//            //create a text field 20 characters wide
//            myTextField = new JTextField(20);
//            add(myTextField); //place component on panel
//
//            myButton = new JButton("Greet");
//            myButton.addActionListener(this); //associate an event with button
//            add(myButton);
//
//
//        }
//
//    //methods: implement interface method for actionListener
//    void actionPerformed(ActionEvent event) {
//        if (event.getSource() == myButton) {
//            System.out.println("d");
//        }
//    }
//
//
//    }//endclass
//

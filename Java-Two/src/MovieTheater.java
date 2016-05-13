/**
 * Name:		Bekabil Tolassa
 * Class:		ICS 141
 * Date:		May 28, 2014
 * Project:	    This program is a GUI written for movie theater, for the user to type in text
 * movie name, unit price, and amount in the text fields.
 * When submit button pressed the program captures the inputs and prints out to the text field area.
 * The program imports and uses several classes from java.awt and javax.swing packages for the GUI works effectively.
 * Assignment:	Programming Assignment 1.
 *
 */
//imports classes from java.awt and javax.swing.
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

//class MovieTheater that extends JFrame class
public class MovieTheater extends JFrame {

    //create private data fields
    private JLabel jlblName = new JLabel("Movie Name:");
    private JTextField jtxtName = new JTextField(10);

    private JLabel jlblPrice = new JLabel("Unit Price:");
    private JTextField jtxtPrice = new JTextField(4);

    private JLabel jlblAmount = new JLabel("Amount:");
    private JTextField jtxtAmount = new JTextField(3);

    private JButton jbtSubmit = new JButton("Submit");
    private JTextArea jtxtAreaOutput = new JTextArea(4, 4);

    //constructor MovieTheater
    public MovieTheater() {

        //create 2 panels for the components and set BorderLayout.
        JPanel panel = new JPanel();
        JPanel panelOutput = new JPanel(new BorderLayout());

        //set grid layout layout on panel.
        panel.setLayout(new GridLayout(3, 2, 3, 3));

        //add components to the panel.
        panel.add(jlblName);
        panel.add(jtxtName);

        panel.add(jlblPrice);
        panel.add(jtxtPrice);

        panel.add(jlblAmount);
        panel.add(jtxtAmount);

        //add submit button and jtxtAreaOutput to panelOutput accordingly.
        panelOutput.add(jbtSubmit, BorderLayout.EAST);
        panelOutput.add(jtxtAreaOutput, BorderLayout.CENTER);

        //textPanel is holding panel and placed on north border
        panelOutput.add(panel, BorderLayout.NORTH);
        add(panelOutput); //add panelBlurb to frame

        //text area for output is not editable.
        jtxtAreaOutput.setEditable(false);

        //create listener
        SubmitButtonListenerClass submitButtonListener = new SubmitButtonListenerClass();

        //register listener
        jbtSubmit.addActionListener(submitButtonListener);


    }
    //main method
    public static void main(String[] args) {

        //frame is an instance of class TestingGUI 
        JFrame frame = new MovieTheater();

        //make the frame visible and set its properties
        frame.setTitle("AMC Movie Theater");
        frame.setSize(350, 160);
        frame.setLocation(600, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    //create class submitButtonListenerClass that implements action listener
    class SubmitButtonListenerClass implements ActionListener {
        //overrides method actionPerformed
        @
        Override

        public void actionPerformed(ActionEvent e) {


            //Movie name, unit price, amount being sold is displayed in to JText Area
            jtxtAreaOutput.setText(" " + jlblName.getText() + " is: " + jtxtName.getText() 
            		              + "\n " + jlblPrice.getText() + " is: " + "$" + jtxtPrice.getText() 
            		              + "\n " + jlblAmount.getText() + " sold is: " + jtxtAmount.getText());

        }

    }


}




/**
 * Name:		Bekabil Tolassa
 * Class:		ICS 141
 * Date:		July 10, 2014
 * Project:	    This program is a GUI written for movie theater thicket sales. The program allow for the user to type
 * 				movie name, unit price, and amount in the text fields. When submit button pressed the program captures the inputs,
 * 				calculate the total cost, and prints out the information to the text field area. This GUI program also allow user
 * to press buttons list all sales and calculate total price. Sales information will be displayed accordingly.
 * The program imports and uses several classes from java.awt and javax.swing packages for the GUI  to work effectively.
 * Project:	Programming Assignment 3.
 *
 */
//imports classes from java AWT
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;

//import classes from javax swing
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;


//class MovieTheater that extends JFrame
public class MovieTheater extends JFrame {

    //create private data fields, labels and text fields. 
    private JLabel jlblName = new JLabel("Item Name:");
    private JTextField jtxtName = new JTextField(15);

    private JLabel jlblPrice = new JLabel("Item Price:");
    private JTextField jtxtPrice = new JTextField(4);

    private JLabel jlblQuantity = new JLabel("Quantity:");
    private JTextField jtxtQuantity = new JTextField(3);

    private JLabel jlblbtn = new JLabel("Submit Button:");
    private JButton jbtnSubmit = new JButton("Submit Sale");

    private JButton jbtnListSales = new JButton("List All Sales");
    private JButton jbtnCalculateTotalPrice = new JButton("Calculate Total Price");
    
    private JScrollBar jscbVert= new JScrollBar(JScrollBar.VERTICAL);

    //text area is created to be used for outputs
    private JTextArea jtxtSalesOutput = new JTextArea(4, 4);

    //manageTicketSold is an instance of Manager
    private Manager manageTicketSold = new Manager();

    //constructor MovieTickets
    public MovieTheater() {
        //create JPanel itemsPanel
        JPanel itemsPanel = new JPanel();

        //create JPanel salesPanel
        JPanel salesPanel = new JPanel(new BorderLayout());

        //set GridLayout 4 rows, 2 columns, and gaps 5 between
        //components horizontally and vertically
        itemsPanel.setLayout(new GridLayout(5, 2, 5, 5));

        //add components to itemsPanel
        itemsPanel.add(jlblName);
        itemsPanel.add(jtxtName);
        itemsPanel.add(jlblPrice);
        itemsPanel.add(jtxtPrice);
        itemsPanel.add(jlblQuantity);
        itemsPanel.add(jtxtQuantity);
        itemsPanel.add(jlblbtn);
        itemsPanel.add(jbtnSubmit);
        itemsPanel.add(jbtnListSales);
        itemsPanel.add(jbtnCalculateTotalPrice);
        
        
        
        //add itemPanel on to salesPanel panel and place it in south 
        salesPanel.add(itemsPanel, BorderLayout.NORTH);
        
       

        
        
        

        //add jtxtSalesOutput to salesPanel and place it in the center	
        //salesPanel.add(jtxtSalesOutput, BorderLayout.CENTER);
        
        
        
        salesPanel.add(jscbVert, BorderLayout.EAST);
        
        
        salesPanel.add(jtxtSalesOutput, BorderLayout.CENTER);
        
        jtxtSalesOutput.add(jscbVert);
        
        
        

        //add salesPanel panel to the frame.
        add(salesPanel);

        //text area for output is not editable.
        jtxtSalesOutput.setEditable(false);

        //create listener object of type PressedButtonListener to use it for submit button.
        PressedButtonListener submitButtonListener = new PressedButtonListener();

        //create listener object of type PressedButtonListener to use it for list all sales button.
        PressedButtonListener listAllSalesButtonListener = new PressedButtonListener();

        //create listener object of type PressedButtonListener to use it for calculate total price button.
        PressedButtonListener calculateTotalPriceButtonListener = new PressedButtonListener();

        //register listener onto jbtnSubmit button
        jbtnSubmit.addActionListener(submitButtonListener);

        //register listener onto jbtnListSales button.
        jbtnListSales.addActionListener(listAllSalesButtonListener);

        //register listener onto jbtnCalculateTotalPrice button.
        jbtnCalculateTotalPrice.addActionListener(calculateTotalPriceButtonListener);

    }

    //class PressedButtonListener is responsible to listen for 
    //three buttons, and perform actions accordingly.
    class PressedButtonListener implements ActionListener {
        //submitButtonListener  listAllSalesButtonListener  calculateTotalPriceButtonListener
        //overriding method actionPerformed
        @
        Override
        public void actionPerformed(ActionEvent event) {

            //if jbtnSubmit button is pressed
            //createSale() method is called.
            //movie name, price, and quantity is entered by user and passed as an argument.      	
            if (event.getSource() == jbtnSubmit) {
                manageTicketSold.createSale(jtxtName.getText(), Double.parseDouble(jtxtPrice.getText()),
                    Integer.parseInt(jtxtQuantity.getText()));

                //method returnLastSaleOutput() is called.
                //last sale information is printed out to text area.
                jtxtSalesOutput.append(manageTicketSold.returnLastSaleOutput());
            }
            //jbtnListSales button is pressed
            //method listAllSales() is called.
            //all sales information are printed out to text area.
            else if (event.getSource() == jbtnListSales) {
                String temp = manageTicketSold.listAllSales();
                jtxtSalesOutput.append(temp);
            }
            //jbtnCalculateTotalPrice button is pressed.
            //method calculateTotalPrice() is called
            //total sales are added and printed out to text area.
            else if (event.getSource() == jbtnCalculateTotalPrice) {
                String temp = manageTicketSold.calculateTotalPrice();
                jtxtSalesOutput.append(temp);

            }

        }


    }

    //main method
    public static void main(String[] args) {

        //create object salesFrame which is type MovieTickets.
        MovieTheater salesFrame = new MovieTheater();
        // give the frame a title
        salesFrame.setTitle("Riverview Theater Thicket Sales");
        //set the frame size
        salesFrame.setSize(400, 400);
        // center the frame
        salesFrame.setLocationRelativeTo(null);
        //the frame closes when an 'X' button is clicked
        salesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // display the frame
        salesFrame.setVisible(true);

    }


}
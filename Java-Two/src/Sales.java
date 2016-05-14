/**
 * Name:		Bekabil Tolassa
 * Class:		ICS 141
 * Date:		July 09, 2014
 * Project:	    class Sales will be used by class Manager.
 * 				This class is responsible to construct each sale, calculate each sales price, gets each sales name and quantity,
 * 				and release string representation of each sales information.
 * 				This class imports java.util.Date and class DecimalFormat and use it to format date and sales value.
 * Project:	Programming Assignment 3.
 */
//class DecimalFormat is imported
import java.text.DecimalFormat;
//DateFormat and SimpleDateFormat will be used to format date and time
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

//class Sales
public abstract class Sales {

    //private data fields
    private String name;
    private double price;
    private int quantity;

    //constructor Sales with three arguments
    public Sales(String name, double price, int quantity) {
        //data fields are assigned with new values
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //method calculatePrice
    public double calculatePrice() {
        //total is local variable
        double total = price * quantity;

        //newFormat is a type DecimalFormat created to format total to 2 decimal places
        DecimalFormat newFormat = new DecimalFormat("#.##");

        //total is assigned with double type formated value
        total = Double.valueOf(newFormat.format(total));

        //total is returned to caller
        return total;
    }

    //method getName() gets the name and return.
    public String getName() {
        //name is returned to caller.
        return name;
    }

    //method getQuantity() gets quantity and return
    public int getQuantity() {
        //quantity is returned to caller.
        return quantity;
    }
    
  //method getQuantity() gets quantity and return
    public double getPrice() {
        //quantity is returned to caller.
        return price;
    }

    //method getSalesDate() returns sales date.
    public String getSalesDate() {
        //dateFormat is a type DateFormat
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        //date is a type Date
        Date date = new Date();
        //return current formated date and time.
        return dateFormat.format(date);
    }


}
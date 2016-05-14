
/**
 * Name:		Bekabil Tolassa
 * Class:		ICS 141
 * Date:		July 09, 2014
 * Project:	    The purpose of this project is to learn how multiple classes interact with one another accordingly, and
 * to learn the idea that a class should represent single entity.
 * Class Manager will be used by GUI class MovieTheater. The Manager class is responsible to manage our Sale objects.
 * The Manager class will be responsible for creating and storing Sale objects, and return
 * the string representation of each sale objects to GUI.
 * The Manager class uses Sales class to to calculate price, and to return
 * string representation of sale objects.
 * Project:	Programming Assignment 3.
 */
//class Manager is to manage Sales class.
public class Manager {

    //data fields salesArray is type Sales to hold sales objects created
    private Sales[] salesArray = new Sales[10];
    //data field salesObjectCounter is to count number of sales objects to be created
    private int salesObjectCounter = 0;

    //input is passed to method createSale() when'Submit Sale' button is pressed
    public void createSale(String name, double price, int quantity) {
        //sales object is created and stored in sales array at position salesObjectCounter 
        salesArray[salesObjectCounter] = new Sales(name, price, quantity);
    }

    //return the last sale we created in string form.
    //this will be used in 'submit sale' button
    public String returnLastSaleOutput() {
        //method toString() is called to return string representation of
        //sales object at salesObjectCounter position.
        String temp = salesArray[salesObjectCounter].toString();

        //sales object is increased
        salesObjectCounter++;
        //string representation of sales object is returned.
        return temp;
    }

    //method calculateTotalPrice() will add up the sale price of each sale and
    //return the total value in string form.
    public String calculateTotalPrice() {
        //temp and total are local variables
        String temp = "\n  Date: " + salesArray[0].getSalesDate() + "\nTotal Sales: $";
        double total = 0;
        //for statement goes through salesArray based on number of sales objects 
        //been created, which is salesObjectCounter number of time.
        for (int i = 0; i < salesObjectCounter; i++) {
            //method calculatePrice() from Sales class is called
            //to calculate each sale in salesArray position (i).
            //the entire sales are added and the value is assigned to total.
            total += salesArray[i].calculatePrice();
        }
        //string representation of total sale is returned.
        temp += total;
        temp += "\n";
        return temp;
    }

    //method listAllSales() prints a short list of each sales created.
    public String listAllSales() {
        //temp is local variable
        String temp = "\n  Sales Listing:\n";
        //for statement goes through salesArray based on number of sales objects 
        //been created, which is salesObjectCounter number of time.
        for (int i = 0; i < salesObjectCounter; i++) {
            //methods getName() and getQuantity are called from Sales class.
            //each sales name and quantity are retrieved and assigned to temp.
            temp += "Sale " + (i + 1) + ": " + salesArray[i].getName() +
                ", Amount Sold: " + salesArray[i].getQuantity() + "\n";
        }
        //string representation of short list of each sales are returned.
        return temp;

    }


}
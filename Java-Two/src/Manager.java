
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
    private Sales[] tickeSalesArray = new Ticket[10];
    private Sales[] snackSalesArray = new Snack[10];
    
    //data field salesObjectCounter is to count number of sales objects to be created
    private int ticketObjectCounter= 0;
    private int snackObjectCounter= 0;
     
     //input is passed to method createTicketSale() when'Submit Sale' button is pressed
    public void createTicketSale(String name, double price, int quantity) {
        //sales object is created and stored in sales array at position salesObjectCounter
    	
        tickeSalesArray[ticketObjectCounter] = new Ticket(name, price, quantity);
        
    	}
    	 
  //input is passed to method createTicketSale() when'Submit Sale' button is pressed
    public void createSnackSale(String name, double price, int quantity) {
        //sales object is created and stored in sales array at position salesObjectCounter
    	
        snackSalesArray[snackObjectCounter] = new Snack(name, price, quantity);
       
    	
    }
    

    //return the last sale we created in string form.
    //this will be used in 'submit sale' button
    public String returnLastTicketSale() {
    	
        //method toString() is called to return string representation of
        //sales object at salesObjectCounter position.
    		 
        String currentTicket = tickeSalesArray[ticketObjectCounter].toString();
        
        ticketObjectCounter++;
        
        return currentTicket;
    	}
    
    public String returnLastSnackSale() {
      //method toString() is called to return string representation of
        //sales object at salesObjectCounter position.
    		
        String currentSnack = snackSalesArray[snackObjectCounter].toString();

        //sales object is increased
        snackObjectCounter++;
        //string representation of sales object is returned.
        return currentSnack;
       }
    
  //method listAllSales() prints a short list of each sales created.
    public String listAllTicketSales() {
    	
    	//if (ticketStatus == 'Y') {
        //listTicket is local variable
        String listOfTickets = "\n  Ticket sale Listing:\n";
        //for statement goes through salesArray based on number of sales objects 
        //been created, which is salesObjectCounter number of time.
        for (int i = 0; i < ticketObjectCounter; i++) {
            //methods getName() and getQuantity are called from Sales class.
            //each sales name and quantity are retrieved and assigned to listTicket.
            listOfTickets += "Sale " + (i + 1) + ": " + tickeSalesArray[i].getName() +
                ", Amount Sold: " + tickeSalesArray[i].getQuantity() + "\n";
        }
        //string representation of short list of each ticket sales are returned.
        return listOfTickets;
    	
    	
    }
    
  //method listAllSales() prints a short list of each sales created.
    public String listAllSnackSales() {
    	
       	//listTicket is local variable
        String listOfSnacks = "\n  Snack sale Listing:\n";
        //for statement goes through salesArray based on number of sales objects 
        //been created, which is salesObjectCounter number of time.
        for (int i = 0; i < snackObjectCounter; i++) {
            //methods getName() and getQuantity are called from Sales class.
            //each sales name and quantity are retrieved and assigned to listSnack.
             listOfSnacks += "Sale " + (i + 1) + ": " + snackSalesArray[i].getName() +
                ", Amount Sold: " + snackSalesArray[i].getQuantity() + "\n";
        }
        //string representation of short list of each snack sales are returned.
          return listOfSnacks;
    	
    	
    }
    	
    
    //method calculateTotalPrice() will add up the sale price of each sale and
    //return the total value in string form.
    public String calculateTotalSales() {
        //totalSales and total are local variables
        String totalSales = ""; 
        double ticketTotal = 0;
        double snackTotal=0;
        //for statement goes through salesArray based on number of sales objects 
        //been created, which is salesObjectCounter number of time.
        if(tickeSalesArray[0] != null) {
        for (int i = 0; i < ticketObjectCounter; i++) {
            //method calculatePrice() from Sales class is called
            //to calculate each sale in salesArray position (i).
            //the entire sales are added and the value is assigned to total.
            ticketTotal += tickeSalesArray[i].calculatePrice();
        }
        
        }
        
        if(snackSalesArray[0] != null) {
      //for statement goes through salesArray based on number of sales objects 
        //been created, which is salesObjectCounter number of time.
        for (int i = 0; i < snackObjectCounter; i++) {
            //method calculatePrice() from Sales class is called
            //to calculate each sale in salesArray position (i).
            //the entire sales are added and the value is assigned to total.
            snackTotal += snackSalesArray[i].calculatePrice();
        }
        
        
        }
        totalSales= "\n\nDate of Sales: " + tickeSalesArray[0].getSalesDate() + "\nList of Sales: \n";
        //string representation of total sale is returned.
        totalSales += "  Tickets:\t$" + ticketTotal + " \n";
        
        totalSales += "  Snacks:\t$" + snackTotal + " \n";
        
        totalSales += "  Total Sales:\t$" + (ticketTotal + snackTotal) + " \n";
        
        
        totalSales += "\n";
        return totalSales;
    }

    
    public String getChocoalteSnacks() {
    	
    	String tempSnack= "\n  List of Chocolate snacks:\n";
    	for (int i = 0; i < snackObjectCounter; i++) {
            //methods getName() and getQuantity are called from Sales class.
            //each sales name and quantity are retrieved and assigned to listSnack.
    		String temp= snackSalesArray[i].getName();
    		boolean b = temp.matches("(?i).*CHOCOLATE.*");
    		if(b == true) {
            tempSnack += temp + "\n";
    		}
        }
    	
    	return tempSnack;
    }

}
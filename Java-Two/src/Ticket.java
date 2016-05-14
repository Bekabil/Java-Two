
/**
 * 
 * @author Bekabil
 *
 */
public class Ticket extends Sales {
	
	public Ticket(String name, double price, int quantity) {
		
		super(name, price, quantity);
		
	}
	
	//method toString returns sales information as string object
    //method calculatePrice() is called to get total thicket sales
    public String toString() {
    	
        //salesInfo is type string used to build string representation of sales
        String salesInfo = "  Ticket sale is created and stored.";
        salesInfo += "\nName: " + super.getName() +
            "\nPrice: $" + super.getPrice() + "\nQuantity: " + super.getQuantity() +
            "\nTotal Sale: $" + calculatePrice() + "\n\n";
        //sales information is returned.
        return salesInfo;
        
    }

}


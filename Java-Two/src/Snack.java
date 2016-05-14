/**
 * 
 * @author Bekabil
 *
 */
public class Snack extends Sales {
	
public Snack(String name, double price, int quantity) {
		
		super(name, price, quantity);

}

public String getSnackType() {
	
	return "Chocolate";
}

//method toString returns sales information as string object
//method calculatePrice() is called to get total thicket sales
public String toString() {
    //salesInfo is type string used to build string representation of sales
    String salesInfo = "  Snack sale is created and stored.";
    salesInfo += "\nName: " + super.getName() +
        "\nPrice: $" + super.getPrice() + "\nQuantity: " + super.getQuantity() +
        "\nTotal Sale: $" + calculatePrice() + "\n\n";
    //sales information is returned.
    return salesInfo;
}
}

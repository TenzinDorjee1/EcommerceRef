package classes;
import java.util.ArrayList;


public class ShoppingCart {
	ArrayList<Item> cartItems = new ArrayList<Item>();
	private double Shippingcosts;
	
	
	private void addToCart(Item product) {
        cartItems.add(product);
    }
	
	private double getShippingcosts() { 
		return Shippingcosts;
	}
	
	private void setShippingcosts(double shippingcosts) {
		Shippingcosts = shippingcosts;
	}
	
	

	
}

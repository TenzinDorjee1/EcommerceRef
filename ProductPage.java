/*
 * @author Hala Mesallam
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductPage  {
	private String color;
	private String Productavailability;
	private static ArrayList<String> orderProducts = new ArrayList<>();


	public  ProductPage() {
		
	}


	private void getProductavailability() {

	}

	private void setProductavailability(String productavailability) {
		Productavailability = productavailability;
	}


	private static ArrayList<String> getOrderProducts() {
		return orderProducts;
	}


	private static void setOrderProducts(ArrayList<String> orderProducts) {
		ProductPage.orderProducts = orderProducts;
	}
	
	
	
}


	

package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

<<<<<<< Updated upstream:ProductPage.java
public class ProductPage extends HomePage  {
	private double Shippingcosts;
=======
public class ProductPage  extends ItemsList {
>>>>>>> Stashed changes:classes/ProductPage.java
	private String color;
	private String Productavailability;
	private static ArrayList<String> orderProducts = new ArrayList<>();


	public  ProductPage() {
<<<<<<< Updated upstream:ProductPage.java
		this.Shippingcosts= Shippingcosts;
		this.color=color;
		this.Productavailability=Productavailability;

		getOrderProducts().addAll(Selling.getList());
		for (int i=0;i<getOrderProducts().size();i++) {
			System.out.println(getOrderProducts().get(i));
		}
	}

	private double getShippingcosts() { 
		return Shippingcosts;
	}



	private void setShippingcosts(double shippingcosts) {
		Shippingcosts = shippingcosts;
	}


	private String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}



=======
	}

>>>>>>> Stashed changes:classes/ProductPage.java
	private void getProductavailability() {

	}

	private void setProductavailability(String productavailability) {
		Productavailability = productavailability;
	}



	public static ArrayList<String> getOrderProducts() {
		return orderProducts;
	}



	public void setOrderProducts(ArrayList<String> orderProducts) {
		this.orderProducts = orderProducts;
	}
}

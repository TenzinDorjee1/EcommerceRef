package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProductPage extends HomePage  {
	private double Shippingcosts;

//public class ProductPage  extends ItemsList {

	private String color;
	private String Productavailability;
	private static ArrayList<String> orderProducts = new ArrayList<>();


	public  ProductPage() {

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

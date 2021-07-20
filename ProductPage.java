/*
 * @author Hala Mesallam
 */

public class ProductPage {
	private double Shippingcosts;
	private String color;
	private boolean Productavailability;
	
	
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

	private boolean isProductavailability() {
		return Productavailability;
	}

	private void setProductavailability(boolean productavailability) {
		Productavailability = productavailability;
	}
	


}

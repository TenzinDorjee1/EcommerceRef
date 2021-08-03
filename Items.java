import java.util.ArrayList;

    

public class Items {
	private String name;
	private String price;
	private String category;
	private String size;
	private String color;
	private String datePosted;
	private double Shippingcosts;
	private String Productavailability;
	private static ArrayList<String> orderProducts = new ArrayList<>();
	
	
	
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getPrice() {
		return price;
	}
	private void setPrice(String price) {
		this.price = price;
	}
	private String getCategory() {
		return category;
	}
	private void setCategory(String category) {
		this.category = category;
	}


}


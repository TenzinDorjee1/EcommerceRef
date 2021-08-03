import java.util.ArrayList;

    

public class Items {
	private String name;
	private String price;
	private String category;
	private String size;
	private String color;
	private String datePosted;
//	private double Shippingcosts;
//	private String Productavailability;
	private ArrayList<String> orderProducts = new ArrayList<>();
	
	
	public Items(String sellItemName, String sellItemPrice, String sellItemCat, String sellItemSize, String sellItemColor, String sellItemdatePosted) {
		this.name = sellItemName;
		this.price = sellItemPrice;
		this.category = sellItemCat;
		this.size = sellItemSize;
		this.color = sellItemColor;
		this.datePosted = sellItemdatePosted;
		
	}
	
	public void buyItems(Items aItem) {
		
		
	}
	
	public void sellItems(Items aItem) {
		
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		getOrderProducts().add(name);
		
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
		getOrderProducts().add(price);
		
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
		getOrderProducts().add(category);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		getOrderProducts().add(color);
	}

	public String getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(String datePosted) {
		this.datePosted = datePosted;
		getOrderProducts().add(datePosted);
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
		getOrderProducts().add(size);
	}

	public ArrayList<String> getOrderProducts() {
		return orderProducts;
	}

	public void setOrderProducts(ArrayList<String> orderProducts) {
		this.orderProducts = orderProducts;
	}
	
	



}



/**
 * 
 * 
 * 
 * 
 */


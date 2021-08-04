import java.util.ArrayList;
import java.util.Scanner;
    

public class Item  {
	protected ArrayList<Item> name;
	protected String price;
	protected String category;
	protected String size;
	protected String color;
	protected String datePosted;
	Item ecommItem = new Item(name, price, category, size, color, datePosted);
	
	
	public Item(ArrayList<Item> sellItemName, String sellItemPrice, String sellItemCat, String sellItemSize, String sellItemColor, String sellItemdatePosted) {
		this.name = sellItemName;
		this.price = sellItemPrice;
		this.category = sellItemCat;
		this.size = sellItemSize;
		this.color = sellItemColor;
		this.datePosted = sellItemdatePosted;
		
	}

	public Item() {
	}

	public ArrayList<Item> getName() {
		return name;
	}
	public void setName(ArrayList<Item> name) {
		this.name = name;
	
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
		
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(String datePosted) {
		this.datePosted = datePosted;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}


}


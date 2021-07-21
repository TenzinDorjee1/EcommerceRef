import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Tenzin Dorjee
 *
 */
public class Selling {
	private String name;
	private String price;
	private String category;
	private String size;
	private String color;
	private String datePosted;
	
	ArrayList<String> itemSellArr = new ArrayList<String>();



public Selling(String name, String sellItemPrice, String category, String size, String color, String datePosted) {

	this.price = sellItemPrice;
	this.category = category;
	this.size = size;
	this.color = color;
	this.datePosted = datePosted;
	
	itemSellArr.add(price);
	itemSellArr.add(category);
	itemSellArr.add(size);
	itemSellArr.add(color);
	itemSellArr.add(datePosted);
	
	for (int i = 0; i <itemSellArr.size(); i++) {
		System.out.println(itemSellArr.get(i));
	}
	
}

public String getName(){;
	return name;
}

public void setName(String name) {
	
	this.name = name;
	
}

public String getPrice(){
	return price;
}

public void setPrice(String price) {
	itemSellArr.add(price);
	this.price = price;
}



public String getCategory() {
	return category;
}
public void setCategory(String category) {
	
	this.category = category;
	itemSellArr.add(category);
}



public String getSize() {
	return size;
}
public void setSize(String size) {
	
	this.size = size;
	itemSellArr.add(size);
}



public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
	itemSellArr.add(color);
}

public String getDatePosted() {
	return datePosted;
}

public void setDatePosted() {
	this.datePosted = datePosted;
	itemSellArr.add(datePosted);
}
}
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Tenzin Dorjee
 *
 */
public class Selling {
	private String name;
	private float price;
	private String category;
	private String size;
	private String color;
	private String datePosted;



public Selling(String name, float sellItemPrice, String category, String size, String color, String datePosted) {

	this.price = sellItemPrice;
	this.category = category;
	this.size = size;
	this.color = color;
	this.datePosted = datePosted;
	
	System.out.println(price);
	
}

public String getName(){
	System.out.println(name);
	return name;
}

public void setName(String name) {
	
	this.name = name;
	
}

public float getPrice(){
	return price;
}

public void setPrice(float price) {
	this.price = price;
}



public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}



public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}



public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
}
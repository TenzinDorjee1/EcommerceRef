/**
 * 
 * @author Tenzin Dorjee
 *
 */
public class Selling {
	private double price;
	private String category;
	private char size;
	private String color;
	private String datePosted;



public Selling(double price, String category, char size, String color, String datePosted) {

	this.price = price;
	this.category = category;
	this.size = size;
	this.color = color;
	this.datePosted = datePosted;
}

public double getPrice(){
	return price;
}

public void setPrice(double price) {
	this.price = price;
}



public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}



public char getSize() {
	return size;
}
public void setSize(char size) {
	this.size = size;
}



public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
}
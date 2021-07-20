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

	public static void main(String[] args) {
		
		System.out.println("Would you like to sell and item? (yes/no)");
		Scanner keyboard = new Scanner(System.in);
		String sellUserInput = keyboard.nextLine();
		if (sellUserInput.equalsIgnoreCase("yes")){
			
			System.out.println("What is the name of the item?");
			String sellItemName = keyboard.nextLine();
			
			System.out.println("What is the price of the item?");
			String sellItemPrice = keyboard.nextLine();
			
			System.out.println("What is the category of the item?");
			String sellItemCat = keyboard.nextLine();
			
			System.out.println("what is the size of the item (XS,S,M,L,XL or N/A)");
			String sellItemSize = keyboard.nextLine();
			
			System.out.println("what is the color of the item");
			String sellItemColor = keyboard.nextLine();	
			
			System.out.println("what is the date posted of the item (ex.2021/07/23)");
			String sellItemdatePosted = keyboard.nextLine();	
			
			float sellItemPriceFloat = Float.parseFloat(sellItemPrice);
			Selling sellingItem = new Selling(sellItemName, sellItemPriceFloat, sellItemCat, sellItemSize, sellItemColor, sellItemdatePosted);
		}	
	}

public Selling(String name, float sellItemPrice, String category, String size, String color, String datePosted) {

	this.price = sellItemPrice;
	this.category = category;
	this.size = size;
	this.color = color;
	this.datePosted = datePosted;
	
	System.out.println(sellItemPrice);
	System.out.println(category);
	System.out.println(size);
	System.out.println(color);
	System.out.println(datePosted);
	
}

public String getName(){
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
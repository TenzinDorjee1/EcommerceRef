package model;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Item call collects and is responsible for the specific items information such as 
 * itemNo,item's name,price,category,size,color and datePosted 
 */

public class Item  {
	private Scanner scannerIn = new Scanner(System.in);
	private SimpleIntegerProperty itemNo;
	private SimpleStringProperty name;
	private SimpleStringProperty price;
	private SimpleStringProperty category;
	private SimpleStringProperty size;
	private SimpleStringProperty color;
	private SimpleStringProperty datePosted;

	/**
	 * Item() Keep track of the items properties 
	 * @param itemNo
	 * @param name
	 * @param price
	 * @param category
	 * @param size
	 * @param color
	 * @param datePosted
	 * SimpleIntegerProprty is used in the GUI as facilitating how items 
	 * is added to the TableView
	 */

	public Item(int itemNo, String name, String price, String category, 
    		String size, String color, String datePosted) {
    	SimpleIntegerProperty s0 = new SimpleIntegerProperty(itemNo);
    	SimpleStringProperty s1  = new SimpleStringProperty(name);
    	SimpleStringProperty s2 = new SimpleStringProperty(price);
    	SimpleStringProperty s3 = new SimpleStringProperty(category);
    	SimpleStringProperty s4 = new SimpleStringProperty(size);
    	SimpleStringProperty s5 = new SimpleStringProperty(color);
    	SimpleStringProperty s6 = new SimpleStringProperty(datePosted);
    	this.itemNo = s0;
        this.name = s1;
        this.price = s2;
        this.category = s3;
        this.size = s4;
        this.color = s5;
        this.datePosted = s6;
    }
	
	/**
	 * Default Constructor
	 */
	
	public Item() {
    }
	
	/**
	 * setItemNo() set the item No to be viewed in the TableView in GUI
	 * and to be used in GUI when purchasing an item in the Buy Page
	 * @param intemNo
	 */

	public void setItemNo(int intemNo) {
    	SimpleIntegerProperty str0 = new SimpleIntegerProperty(intemNo);
        this.itemNo = str0;
    }

	/**
	 * @return itemNo  
	 */

	public int getItemNo() {
    	return itemNo.get();
	}

	/**
	 * @return name 
	 */

	public String getName() {
        return name.get();
    }

	/**
	 * setName() set the item size to be viewed in the TableView in GUI
	 * @param itemName
	 */

	public void setName(String itemName) {
    	SimpleStringProperty str1 = new SimpleStringProperty(itemName);
        this.name = str1;
    }

	/**
	 * @return price 
	 */

	public String getPrice() {
        return price.get();
    }

	/**
	 * setPrice() set the item's price to be viewed in the TableView in GUI
	 * @param itemPrice
	 */

	public void setPrice(String itemPrice) {
    	SimpleStringProperty str2 = new SimpleStringProperty(itemPrice);
        this.price = str2;
    }

	/**
	 * @return category
	 */

	public String getCategory() {
        return category.get();
    }

	/**
	 * setCategory() set the category to be viewed in the TableView in GUI
	 * @param itemCat
	 */

	public void setCategory(String itemCat) {
    	SimpleStringProperty str3 = new SimpleStringProperty(itemCat);
        this.category = str3;
    }

	/**
	 * @return color 
	 */

	public String getColor() {
        return color.get();
    }

	/**
	 * setColor() set the item's color to be viewed in the TableView in GUI
	 * @param itemColor
	 */

	public void setColor(String itemColor) {
    	SimpleStringProperty str4 = new SimpleStringProperty(itemColor);
        this.color = str4;
    }

	/**
	 * @return datePosted
	 */

	public String getDatePosted() {
        return datePosted.get();
    }

	/**
	 * setDatePosted() set the date when the item is posted to be viewed in the 
	 * TableView in GUI
	 * @param itemDatePosted
	 */

	public void setDatePosted(String itemDatePosted) {
    	SimpleStringProperty str5 = new SimpleStringProperty(itemDatePosted);
        this.datePosted = str5;
    }

	/**
	 * @return size 
	 */

	public String getSize() {
        return size.get();
    }

	/**
	 * setSize() set the item's size to be viewed in the TableView in GUI
	 * @param itemSize
	 */

	public void setSize(String itemSize) {
    	SimpleStringProperty str6 = new SimpleStringProperty(itemSize);
        this.size = str6;
    }

	/**
	 * String representation of the items with their specific identification
	 * This String includes the name,price,category,color,date posted
	 */

	public String toString() {
        return "ItemNo." + getItemNo() +" , name: " + getName() + ", price: " + getPrice() + ", category: " + getCategory() + ", color: " + getColor() 
        + ", date posted:" + getDatePosted();
    }
}
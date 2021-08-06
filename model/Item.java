package model;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


public class Item  {
    public Scanner scannerIn = new Scanner(System.in);
    public SimpleIntegerProperty itemNo;
    public SimpleStringProperty name;
    public SimpleStringProperty price;
    public SimpleStringProperty category;
    public SimpleStringProperty size;
    public SimpleStringProperty color;
    public SimpleStringProperty datePosted;



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

    public Item() {
    }
    public void setItemNo(int intemNo) {
    	SimpleIntegerProperty str0 = new SimpleIntegerProperty(intemNo);
        this.itemNo = str0;
    }
    public int getItemNo() {
    	return itemNo.get();
    	
    }
    public String getName() {
        return name.get();
    }
    public void setName(String itemName) {
    	SimpleStringProperty str1 = new SimpleStringProperty(itemName);
        this.name = str1;

    }
    public String getPrice() {
        return price.get();
    }
    public void setPrice(String itemPrice) {
    	SimpleStringProperty str2 = new SimpleStringProperty(itemPrice);
        this.price = str2;

    }
    public String getCategory() {
        return category.get();
    }
    public void setCategory(String itemCat) {
    	SimpleStringProperty str3 = new SimpleStringProperty(itemCat);
        this.category = str3;

    }

    public String getColor() {
        return color.get();
    }

    public void setColor(String itemColor) {
    	SimpleStringProperty str4 = new SimpleStringProperty(itemColor);
        this.color = str4;
    }

    public String getDatePosted() {
        return datePosted.get();
    }

    public void setDatePosted(String itemDatePosted) {
    	SimpleStringProperty str5 = new SimpleStringProperty(itemDatePosted);
    
        this.datePosted = str5;
    }

    public String getSize() {
        return size.get();
    }

    public void setSize(String itemSize) {
    	SimpleStringProperty str6 = new SimpleStringProperty(itemSize);
        this.size = str6;
    }


    public String toString() {

        return "ItemNo." + getItemNo() +" , name: " + getName() + ", price: " + getPrice() + ", category: " + getCategory() + ", color: " + getColor() 
        + ", date posted:" + getDatePosted();
    }


}
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

public class ItemsList   {
	public Item aItem;
	public Scanner scannerIn = new Scanner(System.in);
	ArrayList<Item> productList = new ArrayList<Item>();
	

	
	public ItemsList() {
		
	}	
	public Item getItemsList() {
		return aItem;
	}
	public void setItemsList(Item aItem) {
		this.aItem = aItem;
	}
	

	public void setAddItem(Item itemToAdd) {
		aItem = itemToAdd;
		productList.add(getItemsList());
		
		
	}
	
	public ArrayList<Item> getAddItem(){
		System.out.println(productList);
		System.out.println(productList.size());
		return productList;
	}
	
	public void displayItem() {
		for (int i = 0; i < productList.size(); i++) {
			System.out.println("Product: " + i);
			System.out.println(productList.get(i));
			
		}
	}
		
	public void buyItem() {
		System.out.println("Please enter the Product number for the item to purchase");
		int itemToBuy = scannerIn.nextInt();
	
		productList.remove(itemToBuy);
				
			}
		
	
	
	
}







	
		

	
	
	
	




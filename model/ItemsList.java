package model;
import java.util.ArrayList;
import java.util.Scanner;




public class ItemsList  {
    public Item aItem;
    //public Scanner scannerIn = new Scanner(System.in);
    public ArrayList<Item> productList = new ArrayList<Item>();
    ArrayList<Item> productListBuy = new ArrayList<Item>();
    private static ItemsList singleton;
    
	public static ItemsList getInstance() {
		if (singleton == null) {
			singleton = new ItemsList();
		}
		return singleton;
	}
    
    public ItemsList() {

    }    
    public Item getItemsList() {
        return aItem;
    }
    public void setItemsList(Item aItem) {
        this.aItem = aItem;
    }


    public void setAddItem(Item itemToAdd) {
        this.aItem = itemToAdd;
        productList.add(aItem);


    }

    public ArrayList<Item> getItems(){
        
        return productList;
    }

    public void displayItem() {
    	int itemNums = 1;
        for (int i = 0; i < productList.size(); i++) {
            System.out.println("Product Number: " + itemNums++);
            System.out.println(productList.get(i));

        }
    }

    public void buyItem(int itemToBuy) {
    	itemToBuy--;
        productListBuy.add(productList.get(itemToBuy));
        productList.remove(itemToBuy);
        for (int i = 0; i < productList.size(); i++) {
        	productList.get(i).setItemNo(i+1);
        }
    }

    public void shoppingCartItems() {
        for (int i = 0; i < productListBuy.size(); i++){
            System.out.println(productListBuy.get(i));

        }
    }
    public ArrayList<Item> getShoppingCartItems() {
           
            return productListBuy;
        }
    

    public double shoppingCartItemsPrice() {
        double totalSum = 0;
        for (int i = 0; i < productListBuy.size(); i++){
            double sum = Double.parseDouble(productListBuy.get(i).getPrice());
            totalSum = totalSum + sum;

        }
        return totalSum;
        
    }


}




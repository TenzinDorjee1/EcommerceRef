package model;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The ItemsList class represent a collections of items 
 * and storing these items in an arrayList
 */

public class ItemsList  {
    public Item aItem;
    public ArrayList<Item> productList = new ArrayList<Item>();
    public ArrayList<Item> productListBuy = new ArrayList<Item>();
    private static ItemsList singleton;

    /**
     * Get the single instance of ItemsList.
     * @return the single instance of itemList.
     */

    public static ItemsList getInstance() {
        if (singleton == null) {
            singleton = new ItemsList();
        }
        return singleton;
    }

    /**
     * Default Constructor 
     */

    public ItemsList() {

    }    

    /**
     * @return aItem
     */

    public Item getItemsList() {
        return aItem;
    }

    /**
     * The setItemsList() takes an instance of Item as an argument
     * @param aItem
     */

    public void setItemsList(Item aItem) {
        this.aItem = aItem;
    }

    /**
     * The setAddIem() takes an instance of Item as an argument and add the item to
     * an arrayList
     * @param itemToAdd
     */

    public void setAddItem(Item itemToAdd) {
        this.aItem = itemToAdd;
        productList.add(aItem);
    }

    /**
     * @return productList
     */

    public ArrayList<Item> getItems(){
        return productList;
    }

    /**
     * This method displays the item with the correct sequence of it's product
     * number and it is displayed in the GUI
     */

    public void displayItem() {
        int itemNums = 1;
        for (int i = 0; i < productList.size(); i++) {
            System.out.println("Product Number: " + itemNums++);
            System.out.println(productList.get(i));
        }
    }

    /**
     * This method adds all the items the user need to buy 
     * into one arrayList and removes a specific item after the user choose to buy it
     * This is shown in the GUI
     * @param ItemToBuy
     */

    public void buyItem(int itemToBuy) {
        itemToBuy--;
        productListBuy.add(productList.get(itemToBuy));
        productList.remove(itemToBuy);
        for (int i = 0; i < productList.size(); i++) {
            productList.get(i).setItemNo(i+1);
        }
    }

    /**
     *  The shoppingCartItems method loops through the size of the productListBuy 
     *  and displays the productListBuy which is used in the GUI
     */

    public void shoppingCartItems() {
        for (int i = 0; i < productListBuy.size(); i++){
            System.out.println(productListBuy.get(i));
        }
    }

    /**
     * @return productListBuy
     */

    public ArrayList<Item> getShoppingCartItems() {
        return productListBuy;
    }

    /**
     *  This method keeps track of the price of the item as the item is added to the shopping cart
     *  As the number of items increases the the total price will increase respectively 
     *  This is shown in the GUI 
     * @return totalSum
     */

    public double shoppingCartItemsPrice() {
        double totalSum = 0;
        for (int i = 0; i < productListBuy.size(); i++){
            double sum = Double.parseDouble(productListBuy.get(i).getPrice());
            totalSum = totalSum + sum;
        }
        return totalSum;
    }
}




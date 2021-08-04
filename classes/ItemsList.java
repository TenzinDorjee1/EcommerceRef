package classes;
import java.util.ArrayList;
import java.util.Scanner;


public class ItemsList  {
    public Item aItem;
    //public Scanner scannerIn = new Scanner(System.in);
    ArrayList<Item> productList = new ArrayList<Item>();
    ArrayList<Item> productListBuy = new ArrayList<Item>();

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
        return productList;
    }

    public void displayItem() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println("Product: " + i);
            System.out.println(productList.get(i));

        }
    }

    public void buyItem(int ItemToBuy) {
        productListBuy.add(productList.get(ItemToBuy));
        productList.remove(ItemToBuy);


    }

    public void shoppingCartItems() {
        for (int i = 0; i < productListBuy.size(); i++){
            System.out.println(productListBuy.get(i));

        }
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

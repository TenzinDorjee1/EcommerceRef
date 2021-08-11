package application;
import model.*;
import java.util.ArrayList;
import java.util.Scanner;

import model.Item;
import model.ItemsList;

/**
 * This Class interacts with the user (TextBased) and prompts them for several inputs 
 * and according to the user input, the user is directed to the specific page related to the 
 * response 
 */

public class HomePage {
	private Scanner scannerIn = new Scanner(System.in);
	private int itemNo;
	private String name;
	private String price;
	private String category;
	private String size;
	private String color;
	private String datePosted;
	ItemsList ecommProduct = new ItemsList();
	int itemNum = 0;

	/**
	 * HomeOptions Method that ask the user for several inputs and directing them to different pages 
	 * according to their responses 
	 */
	
	public String HomeOptions(){
		while(true) {
			Item ecommItem = new Item(itemNo,name, price, category, size, color, datePosted);

			System.out.println("Home Page: What would you like to do? type 'Sell' Item(s), 'Buy' Item(s), Go to 'Product Page',Go to 'Shopping cart, or Exit");
			String homePageChoice = scannerIn.nextLine();
			if(homePageChoice.equalsIgnoreCase("Sell")) {

				System.out.println("SELL ITEM:");
				System.out.println("---------------------");
				ecommItem.setItemNo(itemNum++);

				System.out.println("What is the name of the item?");

				ecommItem.setName(scannerIn.nextLine());

				System.out.println("What is the price of the item?");

				ecommItem.setPrice(scannerIn.nextLine());

				System.out.println("What is the category of the item?");
				ecommItem.setCategory(scannerIn.nextLine());

				System.out.println("what is the size of the item (XS,S,M,L,XL or N/A)");

				ecommItem.setSize(scannerIn.nextLine());

				System.out.println("what is the color of the item");

				ecommItem.setColor(scannerIn.nextLine());

				System.out.println("what is the date posted of the item (ex.2021/07/23)");

				ecommItem.setDatePosted(scannerIn.nextLine());

				ecommProduct.setAddItem(ecommItem);
			}

			// if the user wrote "Buy" then all the products will appear with an option of asking the user which
			// of the products they want to buy 
			else if (homePageChoice.equalsIgnoreCase("Buy")) {
				System.out.println("BUY PRODUCTS");
				System.out.println("---------------------");
				if (ecommProduct.productList.size() == 0) {
					System.out.println("There are no products to buy");
				}
				// if there is no products available to buy the user will be prompted with a text message 
				else {
					ecommProduct.displayItem();
					System.out.println("Please enter the Product number for the item to purchase");
					String ItemToBuy = scannerIn.nextLine();
					ecommProduct.buyItem(Integer.parseInt(ItemToBuy));
				}
			}

			// if the user wrote "Shopping Cart" then all the products that the user chose to buy in the Buy Page will appear
			// if there is no products available to buy the user will be prompted with a text message 
			else if (homePageChoice.equalsIgnoreCase("Shopping Cart")) {
				System.out.println("SHOPPING CART");
				System.out.println("---------------------");
				if (ecommProduct.productListBuy.size() == 0) {
					System.out.println("The Shoppping cart is empty!");
				}
				//the total price of the items will be shown
				else {
					ecommProduct.shoppingCartItems();
					ecommProduct.shoppingCartItemsPrice();
					System.out.println("the total price of the the item in cart is: " + ecommProduct.shoppingCartItemsPrice());
					System.out.println("Type finish to finalize purchase");
					String finish = scannerIn.nextLine();
					if (finish.equalsIgnoreCase("finish")) {
						System.out.println("Thank you for shopping with us!");
						System.exit(0);
					}
					else {
						System.exit(0);
					}
				}
			}
			// if the user wrote "Product Page" the all the products the user choose to sell will appear
			// if there is no products available to buy the user will be prompted with a text message 
			else if(homePageChoice.equalsIgnoreCase("Product Page")) {
				System.out.println("PRODUCT PAGE");
				System.out.println("---------------------");
				if (ecommProduct.productList.size() == 0) {
					System.out.println("The product page is empty!");
				}
				else {
					ecommProduct.displayItem();
				}
			}
			// if the user wrote "Exit" the user will exit the program
			else if (homePageChoice.equalsIgnoreCase("Exit")) {
				System.exit(0);
			}
			// if user writes anything else invalid input will be displayed and loop to take input again
			else {
				System.out.println("Invalid Input");
			}
			return homePageChoice;
		}
	}
}



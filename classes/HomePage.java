package classes;
import java.util.ArrayList;
import java.util.Scanner;

public class HomePage {

	public Scanner scannerIn = new Scanner(System.in);

	private int itemNo;
	private String name;
	private String price;
	private String category;
	private String size;
	private String color;
	private String datePosted;
	ItemsList ecommProduct = new ItemsList();

	int itemNum = 0;
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
			else if (homePageChoice.equalsIgnoreCase("Buy")) {
				System.out.println("BUY PRODUCTS");
				System.out.println("---------------------");
				if (ecommProduct.productList.size() == 0) {
					System.out.println("There are no products to buy");

				}
				else {
					ecommProduct.displayItem();
					System.out.println("Please enter the Product number for the item to purchase");
					int ItemToBuy = scannerIn.nextInt();
					ecommProduct.buyItem(ItemToBuy);
				}

			}

			else if (homePageChoice.equalsIgnoreCase("Shopping Cart")) {
				System.out.println("SHOPPING CART");
				System.out.println("---------------------");
				if (ecommProduct.productListBuy.size() == 0) {
					System.out.println("The Shoppping cart is empty!");

				}
				else {
					ecommProduct.shoppingCartItems();
					ecommProduct.shoppingCartItemsPrice();
					System.out.println("the total price of the the item in cart is: " + ecommProduct.shoppingCartItemsPrice());
				}
			}

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

			else if (homePageChoice.equalsIgnoreCase("Exit")) {
				System.exit(0);
			}
			else {
				System.out.println("Invalid Input");
			}
			return homePageChoice;
		}
	}

}



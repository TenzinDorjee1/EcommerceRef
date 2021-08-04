import java.util.ArrayList;
import java.util.Scanner;

public class HomePage {

	public Scanner scannerIn = new Scanner(System.in);
	public int storedPrice;
	public boolean checkIfBuy = false;
	
	private String name;
	private String price;
	private String category;
	private String size;
	private String color;
	private String datePosted;
	ItemsList ecommProduct = new ItemsList();
//	Items ecommItem = new Items(name, price, category, size, color, datePosted);

	public String HomeOptions(){
		while(true) {
			Item ecommItem = new Item(name, price, category, size, color, datePosted);
			
			System.out.println("Home Page: What would you like to do? type 'Sell' Item(s), 'Buy' Item(s), Go to 'Product Page',Go to 'Shopping cart, or Exit");
			String homePageChoice = scannerIn.nextLine();
			if(homePageChoice.equalsIgnoreCase("Sell")) {

				System.out.println("SELL ITEM:");
				System.out.println("---------------------");

				System.out.println("What is the name of the item?");
				ecommItem.setName();
				
				System.out.println("What is the price of the item?");
				
				ecommItem.setPrice();
				
				System.out.println("What is the category of the item?");
				ecommItem.setCategory();

				System.out.println("what is the size of the item (XS,S,M,L,XL or N/A)");
				
				ecommItem.setSize();
				
				System.out.println("what is the color of the item");
					
				ecommItem.setColor();
				
				System.out.println("what is the date posted of the item (ex.2021/07/23)");
				
				ecommItem.setDatePosted();
				
				ecommProduct.setAddItem(ecommItem);
				

				
			}
		
	

	
			else if (homePageChoice.equalsIgnoreCase("Buy")) {
				System.out.println("BUY PRODUCTS");
				System.out.println("---------------------");
				ecommProduct.displayItem();
				ecommProduct.buyItem();
				

			}
//			
//			else if (homePageChoice.equalsIgnoreCase("Shopping Cart")) {
//				System.out.println("SHOPPING CART");
//				System.out.println("---------------------");
//				if (checkIfBuy == true) {
//					checkIfBuy = false;
//					System.out.println("The total checkout price is: " + orderProducts.get(storedPrice));
//
//					System.out.println("type 'finish' to buy the product");
//					String finishBuy = scannerIn.nextLine();
//					if (finishBuy.equalsIgnoreCase("finish")) {
//						System.out.println("Thank you for shopping with us!");
//
//						orderProducts.remove(storedPrice-1);
//						orderProducts.remove(storedPrice-1);
//						orderProducts.remove(storedPrice-1);
//						orderProducts.remove(storedPrice-1);
//						orderProducts.remove(storedPrice-1);
//						orderProducts.remove(storedPrice-1);
//
//					}
//					else {
//						System.out.println("");
//					}
//				}
//				else {
//					System.out.println("There is nothing in the Shopping Cart!");
//				}
//			}
//			
//			
			else if(homePageChoice.equalsIgnoreCase("Product Page")) {
				System.out.println("PRODUCT PAGE");
				System.out.println("---------------------");
				ecommProduct.displayItem();
			

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
	

import java.util.ArrayList;
import java.util.Scanner;
public class HomePage {
	Scanner scannerIn = new Scanner(System.in);
	ArrayList<String> orderProducts = new ArrayList<>();
	int storedPrice;
	boolean checkIfBuy = false;

	public String HomeOptions(){
		while(true) {
			System.out.println("Home Page: What would you like to do? type 'Sell' Item(s), 'Buy' Item(s), Go to 'Product Page'");
			String homePageChoice = scannerIn.nextLine();
			if(homePageChoice.equalsIgnoreCase("Sell")) {

				System.out.println("SELL ITEM: \n");

				System.out.println("What is the name of the item?");
				String sellItemName = scannerIn.nextLine();
				System.out.println("What is the price of the item?");
				String sellItemPrice = scannerIn.nextLine();

				System.out.println("What is the category of the item?");
				String sellItemCat = scannerIn.nextLine();

				System.out.println("what is the size of the item (XS,S,M,L,XL or N/A)");
				String sellItemSize = scannerIn.nextLine();

				System.out.println("what is the color of the item");
				String sellItemColor = scannerIn.nextLine();	

				System.out.println("what is the date posted of the item (ex.2021/07/23)");
				String sellItemdatePosted = scannerIn.nextLine();	

				//float sellItemPriceFloat = Float.parseFloat(sellItemPrice);
				Selling sellingItem = new Selling(sellItemName, sellItemPrice, sellItemCat, sellItemSize, sellItemColor, sellItemdatePosted);
				orderProducts.addAll(Selling.getList());
			}

			else if (homePageChoice.equalsIgnoreCase("Buy")) {

				int productCount = 1;
				int checkCount =0;
				if (orderProducts.size() == 0) {
					System.out.println("No items to be bought!");
				}
				System.out.println("Product " + productCount++);
				for(int i = 0; i < orderProducts.size();i++) {
					checkCount++;
					System.out.println(orderProducts.get(i));
					if (i != 0 && checkCount % 6 == 0 && checkCount != orderProducts.size()) {
						System.out.println("");
						System.out.println("Product" + productCount++);

					}

				}
				System.out.println("Which product do you want to buy? Enter only the product number");
				String buyItem = scannerIn.nextLine();
				int buyItemInt = Integer.parseInt(buyItem);
				int increaseIndex =0;

				for (int i =1; i <= buyItemInt; i++) {

					if (buyItemInt == 1) {
						System.out.println("The price of the item is: " + orderProducts.get(storedPrice = 1));
						checkIfBuy = true;
					}
					else if (buyItemInt == i) {
						System.out.println("The price of the item is: " + orderProducts.get(storedPrice = buyItemInt + increaseIndex));
						checkIfBuy = true;
					}
					increaseIndex += 5;
				}



			}

			else if (homePageChoice.equalsIgnoreCase("Shopping Cart")) {
				if (checkIfBuy == true) {
					System.out.println("The total checkout price is: " + orderProducts.get(storedPrice));
					System.out.println("type 'finish' to buy the product");
					String finishBuy = scannerIn.nextLine();
					if (finishBuy.equalsIgnoreCase("finish")) {
						System.out.println("Thank you for shopping with us!");

						orderProducts.remove(storedPrice-1);
						orderProducts.remove(storedPrice-1);
						orderProducts.remove(storedPrice-1);
						orderProducts.remove(storedPrice-1);
						orderProducts.remove(storedPrice-1);
						orderProducts.remove(storedPrice-1);


					}


					else {
						System.out.println("");
					}
				}
				else {
					System.out.println("There is nothing in the Shopping Cart!");
				}

			}

			else if(homePageChoice.equalsIgnoreCase("Product Page")) {
				int productCount = 1;
				int checkCount =0;
				if (orderProducts.size() == 0) {
					System.out.println("No items to be sold!");
				}
				
				for(int i = 0; i < orderProducts.size();i++) {
					if(i==0) {
						System.out.println("Product:"+""+ productCount++);
					}
					checkCount++;
					System.out.println(orderProducts.get(i));
					if (i != 0 && checkCount % 6 == 0 && checkCount != orderProducts.size()) {
						System.out.println("");
						System.out.println("Product:"+"" + productCount++);

					}
				}



			}

			else {

				System.out.println("Invalid Input");
			}
			return homePageChoice;

		}
	}

}
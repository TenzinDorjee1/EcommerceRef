import java.util.ArrayList;

public class ItemsList  {

	private final ArrayList<Item> productList = new ArrayList<Item>();

	public ItemsList() {
		this.collectItems();
	}	


	public ArrayList<Item> getProductList() {
		return productList;
	}

	public void collectItems() {
		ArrayList<Item> productName = new ArrayList<Item>(); 
				productName=productList.getName();
		Double [] productPrice = {40.00d, 60.00d, 30.00d};
		String [] sellItemCat=
		String [] sellItemSize=
		String [] sellItemdatePosted=
		for (int i=0; i < productNames.length; i++) {
			this.productList.add(new Item(i+1, productNames[i], productPrice[i],sellItemCat[i], 
					      sellItemSize[i], sellItemColor[i], sellItemdatePosted[i]));
		}

	}

}



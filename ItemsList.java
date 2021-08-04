import java.util.ArrayList;

public class ItemsList extends Item {
	
	public ItemsList(String sellItemName, String sellItemPrice, String sellItemCat, String sellItemSize,
			String sellItemColor, String sellItemdatePosted) {
		super(sellItemName, sellItemPrice, sellItemCat, sellItemSize, sellItemColor, sellItemdatePosted);
		
	}
	public ArrayList<Item> productList = new ArrayList<>();
	private ArrayList<String> orderProducts = new ArrayList<>();
	
	public void addItems(Item aItem) {
		aItem=new Item();
		productList.add(aItem);
		System.out.println(productList);
	}
	

	

}



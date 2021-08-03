
public class ItemHandler extends Items{
	public ItemHandler(String sellItemName, String sellItemPrice, String sellItemCat, String sellItemSize,
			String sellItemColor, String sellItemdatePosted) {
		super(sellItemName, sellItemPrice, sellItemCat, sellItemSize, sellItemColor, sellItemdatePosted);
	}

	public Items[] items;
	public ItemHandler i = new ItemHandler(name, price, category, size, color, datePosted);
	
	public void addItem(Items getOrderProducts) {
		i.addItem(getOrderProducts);
		
		
		
	}


}

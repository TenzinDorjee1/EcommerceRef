package application;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.*;

/**
 * presents a table view of all the items available to buy
 * clicking load, loads the items
 * if the user clicks buy then the item will be moved to the shopping cart
 * the user also has the option to go back to the home page
 */
public class BuyController {
	
	private ItemsList allItemsList = ItemsList.getInstance();
	private Scene goHomePage;
	@FXML
	private TableColumn<Item, String> itemCat;

	@FXML
	private Button hompageButton;

	@FXML
	private TableColumn<Item, String> itemName;

	@FXML
	private TextField intToBuy;

	@FXML
	private TableColumn<Item, String> itemColor;

	@FXML
	private TableColumn<Item, String> itemDate;

	@FXML
	private TableColumn<Item, String> itemPrice;

	@FXML
	private TableColumn<Item, String> itemNo;

	@FXML
	private TableColumn<Item, String> itemSize;

	@FXML
	private Button loadButton;

	@FXML
	private TableView<Item> thisTableView;
	@FXML
	private Button buyThis;

	/**
	 * represents information on each item on via TableView
	 * Uses the ItemsList arrayList	to SetItems
	 * @param event - ActionEvent    
	 */

	@FXML 
	void loadThis(ActionEvent event) {
		//sets items using the itemsList observableList and using the instance variables in Item.java class
		ObservableList<Item> itemsList=FXCollections.observableArrayList(allItemsList.getItems());
		thisTableView.setItems(itemsList);
		itemNo.setCellValueFactory(new PropertyValueFactory<>("itemNo"));
		itemName.setCellValueFactory(new PropertyValueFactory<>("name"));
		itemPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
		itemCat.setCellValueFactory(new PropertyValueFactory<>("category"));
		itemSize.setCellValueFactory(new PropertyValueFactory<>("size"));
		itemColor.setCellValueFactory(new PropertyValueFactory<>("color"));
		itemDate.setCellValueFactory(new PropertyValueFactory<>("datePosted"));
	}

	/**
	 * Takes user input and calls BuyItem method to remove Item from
	 * original arrayList - productList to productListBuy. 
	 * @param event - ActionEvent
	 */

	@FXML 
	void buyThis(ActionEvent event) {
		String buyNum = intToBuy.getText();
		int buyNumInt = Integer.parseInt(buyNum);
		allItemsList.buyItem(buyNumInt);
	}

	/**
	 * Takes user back to home page using the loaded scene
	 * @param event - ActionEvent
	 * @throws IOException
	 */

	@FXML
	void clickHome(ActionEvent event) throws IOException {
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(goHomePage);
		app_stage.show();
	}

	/**
	 * Receives home scene form home page and 
	 * assign it to local variables goHomePage
	 * @param homeScene - home scene from home page
	 */

	public void passPage(Scene homeScene) {
		goHomePage = homeScene;	
	}
}

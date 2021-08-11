package application;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.*;

/**
 *allows the user to purchase the item from the shopping cart
 *prompts the user to enter payment information
 */
public class CartController {

	private  ItemsList allItemsList = ItemsList.getInstance();
	private Scene goHomePage;

	@FXML
	private TableColumn<Item, String> itemCat;

	@FXML
	private TableColumn<Item, String> itemColor;

	@FXML
	private PasswordField creditfield;

	@FXML
	private TextField emailfield;

	@FXML
	private TableColumn<Item, String> itemDate;

	@FXML
	private Label messagelabel;

	@FXML
	private TextField firstfield;

	@FXML
	private TableColumn<Item, String> itemName;

	@FXML
	private TableView<Item> cartTableView;

	@FXML
	private TextField addressfield;

	@FXML
	private TextField lastfield;

	@FXML
	private TableColumn<Item, String> itemPrice;

	@FXML
	private TableColumn<Item, String> itemSize;
	@FXML
	private Label totalPriceBox;
	@FXML
	private Label totalPriceLabel;
	@FXML
	private Button goHome;

	/**
	 * if the text fields are not all entered then display message
	 * once all text fields are entered then load EndView.fxml
	 * @param event - ActionEvent
	 * @throws IOException
	 */

	@FXML
	void purchaseClick(ActionEvent event) throws IOException {
		if (addressfield.getText().equals("")||creditfield.getText().equals("")||emailfield.getText().equals("")||
				lastfield.getText().equals("")||firstfield.getText().equals("")){
			messagelabel.setText("Enter all fields");
		}
		else {
			AnchorPane homepage_parent = FXMLLoader.load(getClass().getResource("/view/EndView.fxml"));
			Scene homepage_scene = new Scene(homepage_parent);
			Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
			app_stage.setScene(homepage_scene);
			app_stage.show();
		}
	}

	/**
	 * display cart items in TableView using productListBuy arrayList
	 * @param event - ActionEvent
	 */

	@FXML
	void cartLoad(ActionEvent event) {
		ObservableList<Item> itemsList=FXCollections.observableArrayList(allItemsList.getShoppingCartItems());
		cartTableView.setItems(itemsList);
		//sets items using the itemsList observableList and using the instance variables in Item.java class
		itemName.setCellValueFactory(new PropertyValueFactory<>("name"));
		itemPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
		itemCat.setCellValueFactory(new PropertyValueFactory<>("category"));
		itemSize.setCellValueFactory(new PropertyValueFactory<>("size"));
		itemColor.setCellValueFactory(new PropertyValueFactory<>("color"));
		itemDate.setCellValueFactory(new PropertyValueFactory<>("datePosted"));

		//using the label totalPrice Box sum the items in the cart using shoppingCartItemsPrice method
		totalPriceBox.setText((String.valueOf("$" + String.format("%,.2f",allItemsList.shoppingCartItemsPrice()))));
	}

	/**
	 * Takes user back to home page using the loaded scene
	 * @param event - ActionEvent
	 * @throws IOException
	 */

	@FXML
	void goHome(ActionEvent event) {
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(goHomePage);
		app_stage.show();
	}

	/**
	 * receives home scene form home page and 
	 * assign it to local variables goHomePage
	 * @param homeScene - home scene from home page
	 */

	public void passPage(Scene homeScene) {
		goHomePage = homeScene;	
	}
}

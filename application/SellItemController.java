package application;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.*;

import java.io.IOException;

/*
 * prompts the user to enter in each text field for information on the item
 */
public class SellItemController {

	private ItemsList itemlist1 = ItemsList.getInstance();
	private Scene goHomePage;

	@FXML
	private TextField sizefield;

	@FXML
	private Label itemCat;

	@FXML
	private Label itemColor;

	@FXML
	private TextField datefield;

	@FXML
	private Button productbutoon;

	@FXML
	private TextField colorfield;

	@FXML
	private TextField Catfield;

	@FXML
	private Label itemDatePosted;

	@FXML
	private Label itemName;

	@FXML
	private TextField Namefield;

	@FXML
	private TextField pricefield;

	@FXML
	private Label itemPrice;

	@FXML
	private Button resetbutton;

	@FXML
	private Label itemSize;

	@FXML
	private Label label;
	private Scene productPage;
	int itemNum = 1;

	@FXML
	/**
	 * stores the text from the text field and uses them to create a new object of Item
	 * which is then used to create a new Item
	 * @param event - Action event
	 */
	void saveItems(ActionEvent event) {

		// stores the text from the Text Fields as a String
		String name = Namefield.getText();
		String price = pricefield.getText();
		String category = Catfield.getText();
		String size = sizefield.getText();
		String color = colorfield.getText();
		String datePosted = datefield.getText();

		// if any of the Text Fields are empty then display message
		if(name.isEmpty()||price.isEmpty()||category.isEmpty()||size.isEmpty()||color.isEmpty()||datePosted.isEmpty()) {
			label.setText("Please enter all the required fields ");
		}
		// create a new object of Item and pass in those values inputed by the user
		else {
			Item ecommItem = new Item(itemNum++,name, price, category, size, color, datePosted);
			itemlist1.setAddItem(ecommItem);
		}
	}

	/**
	 * clears the Text Fields back to an empty String
	 * @param event
	 */
	@FXML
	void clearItem(ActionEvent event) {
		sizefield.setText("");
		datefield.setText("");
		colorfield.setText("");
		Catfield.setText("");
		Namefield.setText("");
		pricefield.setText("");
	}

	/**
	 * Takes user back to home page using the loaded scene
	 * @param event - ActionEvent
	 * @throws IOException
	 */

	@FXML
	void clickHomepage(ActionEvent event) throws IOException {
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


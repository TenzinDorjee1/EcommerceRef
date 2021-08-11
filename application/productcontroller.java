package application;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.*;

/**
 * uses a table view to display all the items for sale in the product page.
 */
public class ProductController {

	private ItemsList allItemsList = ItemsList.getInstance();
	private Scene goHomePage;

	@FXML
	private TableColumn<Item, String> namecolumn;

	@FXML
	private TableColumn<Item, String> pricecolumn;

	@FXML
	private TableColumn<Item, String> sizecolumn;

	@FXML
	private TableColumn<Item, String> catcolumn;

	@FXML
	private TableColumn<Item, String> colorcolumn;

	@FXML
	private TableColumn<Item, String> datecolumn;

	@FXML
	private TableView<Item> itemstable;

	public ProductController() {

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
	 * when user clicks load it presents all the items available for sale in a TableView format
	 * @param event - ActionEvent
	 */

	@FXML
	void loadData(ActionEvent event) {

		ObservableList<Item> itemsList=FXCollections.observableArrayList(allItemsList.getItems());
		itemstable.setItems(itemsList);

		namecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		pricecolumn.setCellValueFactory(new PropertyValueFactory<>("price"));
		sizecolumn.setCellValueFactory(new PropertyValueFactory<>("size"));
		catcolumn.setCellValueFactory(new PropertyValueFactory<>("category"));
		colorcolumn.setCellValueFactory(new PropertyValueFactory<>("color"));
		datecolumn.setCellValueFactory(new PropertyValueFactory<>("datePosted"));
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



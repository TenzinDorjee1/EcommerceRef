package application;

import classes.Item;
import classes.ItemsList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class BuyController {
	ItemsList allItemsList = ItemsList.getInstance();
	Scene goHomePage;
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
void loadThis(ActionEvent event) {
		System.out.println(allItemsList.getItems());
   	
    	
    	
      	ObservableList<Item> itemsList=FXCollections.observableArrayList(allItemsList.getItems());
      	thisTableView.setItems(itemsList);
    	
     	itemName.setCellValueFactory(new PropertyValueFactory<>("name"));
    	itemPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
    	itemCat.setCellValueFactory(new PropertyValueFactory<>("size"));
    	itemColor.setCellValueFactory(new PropertyValueFactory<>("category"));
    	itemSize.setCellValueFactory(new PropertyValueFactory<>("color"));
    	itemDate.setCellValueFactory(new PropertyValueFactory<>("datePosted"));
}

public void passPage(Scene homeScene) {
	goHomePage = homeScene;
	
	
}
}

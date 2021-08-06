package application;

import java.io.IOException;

import classes.Item;
import classes.ItemsList;
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

public class CartController {
	ItemsList allItemsList = ItemsList.getInstance();
	Scene goHomePage;
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


    @FXML
    void purchaseclick(ActionEvent event) throws IOException {
    	if (addressfield.getText().equals("")||creditfield.getText().equals("")||emailfield.getText().equals("")||
    			lastfield.getText().equals("")||firstfield.getText().equals("")){
    		messagelabel.setText("Enter all fields");
    	}
    	else {
    		AnchorPane homepage_parent = FXMLLoader.load(getClass().getResource("Done.fxml"));
            Scene homepage_scene = new Scene(homepage_parent);
            Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(homepage_scene);
            app_stage.show();
    		
    	}
    	

    }
    
    @FXML
    void cartLoad(ActionEvent event) {
       	ObservableList<Item> itemsList=FXCollections.observableArrayList(allItemsList.getShoppingCartItems());
      	cartTableView.setItems(itemsList);

     	itemName.setCellValueFactory(new PropertyValueFactory<>("name"));
    	itemPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
    	itemCat.setCellValueFactory(new PropertyValueFactory<>("size"));
    	itemColor.setCellValueFactory(new PropertyValueFactory<>("category"));
    	itemSize.setCellValueFactory(new PropertyValueFactory<>("color"));
    	itemDate.setCellValueFactory(new PropertyValueFactory<>("datePosted"));
    	
    	
    	
    	totalPriceBox.setText((String.valueOf("$" + String.format("%,.2f",allItemsList.shoppingCartItemsPrice()))));
    }
    
    @FXML
    void goHome(ActionEvent event) {
    	Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
    	app_stage.setScene(goHomePage);
    	app_stage.show();
    }
    public void passPage(Scene homeScene) {
    	goHomePage = homeScene;
    	
    }

}

package application;
import classes.Item;
import classes.*;

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




public class productcontroller {
	
	ItemsList itemlist123;
	
	
	
	
	//ItemsList ecommProduct=new ItemsList();
	
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
	    

	    @FXML
	    void AddItems(ActionEvent event) throws IOException {
	    	AnchorPane homepage_parent = FXMLLoader.load(getClass().getResource("SellView.fxml"));
			Scene homepage_scene = new Scene(homepage_parent);
			Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
			homepage_scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			homepage_scene.getRoot().setStyle("-fx-font-family: 'serif'");
			app_stage.setScene(homepage_scene);
			app_stage.show();
	    	

	    }
	    
	  

    @FXML
    void clickhomepage(ActionEvent event) throws IOException {
    	AnchorPane homepage_parent = FXMLLoader.load(getClass().getResource("Homepage.fxml"));
		Scene homepage_scene = new Scene(homepage_parent);
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		homepage_scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		homepage_scene.getRoot().setStyle("-fx-font-family: 'serif'");
		app_stage.setScene(homepage_scene);
		app_stage.show();
    	

    }
    
    @FXML
    void loaddata(ActionEvent event) {
    	//System.out.println(super.abc);
       itemlist123.getAddItem();
//    	
      	ObservableList<ItemsList> itemsList=FXCollections.observableArrayList(itemlist123);
//    	System.out.println(ecommProduct.getAddItem());
//  
        //itemlist1.getAddItem();
       	//System.out.print(super.productList1);
//     	namecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
//    	pricecolumn.setCellValueFactory(new PropertyValueFactory<>("price"));
//    	sizecolumn.setCellValueFactory(new PropertyValueFactory<>("size"));
//    	catcolumn.setCellValueFactory(new PropertyValueFactory<>("category"));
//    	colorcolumn.setCellValueFactory(new PropertyValueFactory<>("color"));
//    	datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));

    }
    
    
    
    private void loadData() {
    	
    	namecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
    	pricecolumn.setCellValueFactory(new PropertyValueFactory<>("price"));
    	sizecolumn.setCellValueFactory(new PropertyValueFactory<>("size"));
    	catcolumn.setCellValueFactory(new PropertyValueFactory<>("category"));
    	colorcolumn.setCellValueFactory(new PropertyValueFactory<>("color"));
    	datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));
    }
    
    public void myfunction(ItemsList itemlist1) {
    	
    	itemlist123=itemlist1;
    	
    }
    
    
   
    	
    }



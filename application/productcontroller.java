package application;
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
	
	ItemsList allItemsList = ItemsList.getInstance();
	ItemsList allItemsListHome;
	AnchorPane homepage_parent;
	Scene goHomePage;
	
	
	
	
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
	    

	    
	
	    public productcontroller() {
			// TODO Auto-generated constructor stub
		}



		@FXML
	    void AddItems(ActionEvent event) throws IOException {
	    	AnchorPane homepage_parent = FXMLLoader.load(getClass().getResource("SellView.fxml"));
			Scene homepage_scene = new Scene(homepage_parent);
			Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
			app_stage.setScene(homepage_scene);
			app_stage.show();
	    	

	    }
	    
	  

    @FXML
    void clickhomepage(ActionEvent event) throws IOException {
    	
    	
//    	AnchorPane homepage_parent = FXMLLoader.load(getClass().getResource("Homepage.fxml"));
//		Scene homepage_scene = new Scene(homepage_parent);
//		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();

    	Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(goHomePage);
		app_stage.show();
    	

    }
    
    @FXML
    void loaddata(ActionEvent event) {
    	//System.out.println(super.abc);
    	
      
    	System.out.println(allItemsList.getItems());
   	
    	
    	
      	ObservableList<Item> itemsList=FXCollections.observableArrayList(allItemsList.getItems());
      	itemstable.setItems(itemsList);
    	
     	namecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
    	pricecolumn.setCellValueFactory(new PropertyValueFactory<>("price"));
    	sizecolumn.setCellValueFactory(new PropertyValueFactory<>("size"));
    	catcolumn.setCellValueFactory(new PropertyValueFactory<>("category"));
    	colorcolumn.setCellValueFactory(new PropertyValueFactory<>("color"));
    	datecolumn.setCellValueFactory(new PropertyValueFactory<>("datePosted"));

    }
    
    
    
    private void loadData() {
    	
    	namecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
    	pricecolumn.setCellValueFactory(new PropertyValueFactory<>("price"));
    	sizecolumn.setCellValueFactory(new PropertyValueFactory<>("size"));
    	catcolumn.setCellValueFactory(new PropertyValueFactory<>("category"));
    	colorcolumn.setCellValueFactory(new PropertyValueFactory<>("color"));
    	datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));
    }
    
 
//  public void myfunction2(ItemsList itemlist1) {
//    	
//    	this.allItemsListHome=itemlist1;
//    	System.out.println(this.allItemsListHome.getItemsList());
//    	
//    }







	public void passPage(Scene homeScene) {
		goHomePage = homeScene;
		
	}
    
    
   
    	
    }



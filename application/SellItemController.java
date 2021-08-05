package application;

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

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import classes.*;

public class SellItemController {
	//public ArrayList<Item> productList1 = new ArrayList<Item>();
	ItemsList itemlist1 = new ItemsList();
	String abc="Hello";
	

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
    
//    private String name;
//	private String price;
//	private String category;
//	private	String size;
//	private String color;
//	private String datePosted;
	
    
    @FXML
    void saveitems(ActionEvent event) {
    	this.abc="bye";
    	String name = Namefield.getText();
    	String price = pricefield.getText();
    	String category = Catfield.getText();
    	String size = sizefield.getText();
    	String color = colorfield.getText();
    	String datePosted = datefield.getText();
//    	Item ecommItem = new Item(name, price, category, size, color, datePosted);
//    	productList1.add(ecommItem);
    	
    	if(name.isEmpty()||price.isEmpty()||category.isEmpty()||size.isEmpty()||color.isEmpty()||datePosted.isEmpty()) {
    		label.setText("Please enter all the required fields ");
    	}
    	else {
    		Item ecommItem = new Item(name, price, category, size, color, datePosted);
    		
        	//this.productList1.add(ecommItem);
        	//System.out.println(productList1);
        	itemlist1.setAddItem(ecommItem);
        	itemlist1.displayItem();
        
    	}
    }
    
    
    @FXML
    void clearitem(ActionEvent event) {
    	sizefield.setText("");
    	datefield.setText("");
    	colorfield.setText("");
    	Catfield.setText("");
    	Namefield.setText("");
    	pricefield.setText("");
   
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
    void clickproductpage(ActionEvent event) throws IOException {
//    	String name = Namefield.getText();
//    	String price = pricefield.getText();
//    	String category = Catfield.getText();
//    	String size = sizefield.getText();
//    	String color = colorfield.getText();
//    	String datePosted = datefield.getText();
// 
//    	Item ecommItem = new Item(name, price, category, size, color, datePosted);
//    	productList1.add(ecommItem);
    	
 //   	itemlist1.setAddItem(ecommItem);
    	//ecommProduct.displayItem();
    	//System.out.println("HI");
    	//itemlist1.getAddItem();
    	System.out.println("123");
    	try {
    		FXMLLoader loader=new FXMLLoader(getClass().getResource("productpage.fxml"));
    		Parent root=(Parent)loader.load();
    		productcontroller Controller=loader.getController();
    		Controller.myfunction(itemlist1);
    		Stage stage=new Stage();
      		stage.setScene(new Scene(root));
      		root.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    		stage.show();
    		
    	} catch(IOException e ) {
    		e.printStackTrace();
    	}
//    	
//    	AnchorPane homepage_parent = FXMLLoader.load(getClass().getResource("productpage.fxml"));
//		Scene homepage_scene = new Scene(homepage_parent);
//		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
//		homepage_scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//		homepage_scene.getRoot().setStyle("-fx-font-family: 'serif'");
//		app_stage.setScene(homepage_scene);
//		app_stage.show();
//    	
    	
    	
    	
    	
    	
    }

   
 

}


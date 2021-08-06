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

public class SellItemController {

	ItemsList itemlist1 = ItemsList.getInstance();

	
	Scene goHomePage;
	

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
    void saveitems(ActionEvent event) {
    
    	
    	String name = Namefield.getText();
    	String price = pricefield.getText();
    	String category = Catfield.getText();
    	String size = sizefield.getText();
    	String color = colorfield.getText();
    	String datePosted = datefield.getText();

    	
    	if(name.isEmpty()||price.isEmpty()||category.isEmpty()||size.isEmpty()||color.isEmpty()||datePosted.isEmpty()) {
    		label.setText("Please enter all the required fields ");
    	}
    	else {
    		Item ecommItem = new Item(itemNum++,name, price, category, size, color, datePosted);
        	itemlist1.setAddItem(ecommItem);
        
        
        		

        		
     
        		
        		
        		
        	
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
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(goHomePage);
		app_stage.show();
		

    }

    
    @FXML
    void clickproductpage(ActionEvent event) throws IOException {



 	    	
    	
    	
    	
    	
    }


	public void passPage(Scene homeScene) {
		goHomePage = homeScene;
		
		
	}

   
 

}


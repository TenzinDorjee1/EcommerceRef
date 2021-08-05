package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import classes.*;

public class SellItemController {

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
    
    void keyTyped(KeyEvent event) {
    	
    	
    }

    @FXML
    void clickproductpage(ActionEvent event) {
    	String name = Namefield.getText();
    	String price = pricefield.getText();
    	String category = Catfield.getText();
    	String size = sizefield.getText();
    	String color = colorfield.getText();
    	String datePosted = datefield.getText();
    	
    	Item ecommItem = new Item(name, price, category, size, color, datePosted);
    	ItemsList ecommProduct = new ItemsList();
    	
    	ecommProduct.setAddItem(ecommItem);
    	ecommProduct.displayItem();
    	
    	
    	
    }

   
 

}


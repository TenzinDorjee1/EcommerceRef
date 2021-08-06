package application;

import java.io.IOException;

import classes.ItemsList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HomepageController {

    @FXML
    private Button buybutton;
    
    public AnchorPane buyingPage;
    
   

    @FXML
    private Button sellbutton;
    
    ItemsList thisList;
    
    @FXML
    void clickSell(ActionEvent event) throws IOException {
  
    	
    	AnchorPane sellingPage = FXMLLoader.load(getClass().getResource("SellView.fxml"));
		Scene sellingPage_scene = new Scene(sellingPage);
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		sellingPage_scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		sellingPage_scene.getRoot().setStyle("-fx-font-family: 'serif'");
		app_stage.setScene(sellingPage_scene);
		app_stage.show();
		

    }
    public void myfunction1(ItemsList itemlist1) {
    	
    	this.thisList=itemlist1;
    	System.out.println(thisList.getItemsList());
    }
    @FXML
    void clickproductpage(ActionEvent event) throws IOException {
//    	FXMLLoader loader=new FXMLLoader(getClass().getResource("productpage.fxml"));
//		Parent root=(Parent)loader.load();
//		productcontroller Controller2=loader.getController();
//		Controller2.myfunction2(thisList);
		
    	AnchorPane homepage_parent = FXMLLoader.load(getClass().getResource("productpage.fxml"));
		Scene homepage_scene = new Scene(homepage_parent);
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		homepage_scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		homepage_scene.getRoot().setStyle("-fx-font-family: 'serif'");
		app_stage.setScene(homepage_scene);
		app_stage.show();
		
		
		

    }
    
    @FXML
    void clickBuy(ActionEvent event) throws IOException {
    	AnchorPane homepage_parent = FXMLLoader.load(getClass().getResource("buyView.fxml"));
		Scene homepage_scene = new Scene(homepage_parent);
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		homepage_scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		homepage_scene.getRoot().setStyle("-fx-font-family: 'serif'");
		app_stage.setScene(homepage_scene);
		app_stage.show();


    }
    
    @FXML
    void clickCart(ActionEvent event) throws IOException {
    	AnchorPane homepage_parent = FXMLLoader.load(getClass().getResource("Shopping.fxml"));
		Scene homepage_scene = new Scene(homepage_parent);
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		homepage_scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		homepage_scene.getRoot().setStyle("-fx-font-family: 'serif'");
		app_stage.setScene(homepage_scene);
		app_stage.show();


    }
    
    
    

}

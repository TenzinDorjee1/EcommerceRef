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

	private Scene sellingPage;
	private Scene productPage;
	private Scene buyPage;
	@FXML
	private Button sellbutton;

	ItemsList thisList;

	@FXML
	void clickSell(ActionEvent event) throws IOException {

		if (sellingPage == null) {

			FXMLLoader loader = new FXMLLoader((getClass().getResource("SellView.fxml")));
			AnchorPane sellingPagePane = loader.load();
			SellItemController controller = loader.getController();
			controller.passPage((Scene)((Node) event.getSource()).getScene());
			sellingPage = new Scene(sellingPagePane);
		}
		else {
			Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
			app_stage.setScene(sellingPage);
			app_stage.show();
		}


	}
//	public void myfunction1(ItemsList itemlist1) {
//
//		this.thisList=itemlist1;
//		System.out.println(thisList.getItemsList());
//	}
	@FXML
	void clickproductpage(ActionEvent event) throws IOException {
		//    	FXMLLoader loader=new FXMLLoader(getClass().getResource("productpage.fxml"));
		//		Parent root=(Parent)loader.load();
		//		productcontroller Controller2=loader.getController();
		//		Controller2.myfunction2(thisList);
		if (productPage == null) {
			FXMLLoader loader = new FXMLLoader((getClass().getResource("productpage.fxml")));
			AnchorPane productPagePane = loader.load();
			productcontroller controller = loader.getController();
			controller.passPage((Scene)((Node) event.getSource()).getScene());
			productPage = new Scene(productPagePane);
		}
		else {
			Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
			app_stage.setScene(productPage);
			app_stage.show();
		}


	}

	@FXML
	void clickBuy(ActionEvent event) throws IOException {
		
		if (buyPage == null) {
			FXMLLoader loader = new FXMLLoader((getClass().getResource("buyView.fxml")));
			AnchorPane buyPagePane = loader.load();
			BuyController controller = loader.getController();
			controller.passPage((Scene)((Node) event.getSource()).getScene());
			productPage = new Scene(buyPagePane);
		}
		else {
			Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
			app_stage.setScene(buyPage);
			app_stage.show();
		}
		
		
		
		AnchorPane homepage_parent = FXMLLoader.load(getClass().getResource("buyView.fxml"));
		Scene homepage_scene = new Scene(homepage_parent);
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();

		app_stage.setScene(homepage_scene);
		app_stage.show();


	}

	@FXML
	void clickCart(ActionEvent event) throws IOException {
		AnchorPane homepage_parent = FXMLLoader.load(getClass().getResource("Shopping.fxml"));
		Scene homepage_scene = new Scene(homepage_parent);
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
	
		
		app_stage.setScene(homepage_scene);
		app_stage.show();


	}




}

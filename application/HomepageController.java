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
	private Scene shoppingCartPage;
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

	@FXML
	void clickproductpage(ActionEvent event) throws IOException {
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
           buyPage = new Scene(buyPagePane);
          
		}
		else {
			Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
			app_stage.setScene(buyPage);
			app_stage.show();
		}
		
		


	}

	@FXML
	void clickCart(ActionEvent event) throws IOException {
		if (shoppingCartPage == null) {
			FXMLLoader loader = new FXMLLoader((getClass().getResource("Shopping.fxml")));
            AnchorPane ShoppingCartPagePane = loader.load();
            CartController controller = loader.getController();
           controller.passPage((Scene)((Node) event.getSource()).getScene());
           shoppingCartPage = new Scene(ShoppingCartPagePane);
          
		}
		else {
			Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
			app_stage.setScene(shoppingCartPage);
			app_stage.show();
		}

	}




}

package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.ItemsList;
/**
 *home page of the ecommerce application
 *users have the option to sell, buy, view product page and go to shopping cart
 */
public class HomepageController {

	@FXML
	private Button buybutton;

	private AnchorPane buyingPage;

	private Scene sellingPage;
	private Scene productPage;
	private Scene buyPage;
	private Scene shoppingCartPage;
	@FXML
	private Button sellbutton;

	/**
	 * if the Scene sellingPage is null then create a new scene or else use the scene that is stored in sellingPage
	 * @param event - ActionEvent
	 * @throws IOException
	 */

	@FXML
	void clickSell(ActionEvent event) throws IOException {

		if (sellingPage == null) {
			FXMLLoader loader = new FXMLLoader((getClass().getResource("/view/SellView.fxml")));
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

	/**
	 * if the Scene productPage is null then create a new scene or else use the scene that is stored in sellingPage
	 * @param event - ActionEvent
	 * @throws IOException
	 */

	@FXML
	void clickProductPage(ActionEvent event) throws IOException {
		if (productPage == null) {
			FXMLLoader loader = new FXMLLoader((getClass().getResource("/view/ProductPage.fxml")));
			AnchorPane productPagePane = loader.load();
			ProductController controller = loader.getController();
			controller.passPage((Scene)((Node) event.getSource()).getScene());
			productPage = new Scene(productPagePane);
		}
		else {
			Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
			app_stage.setScene(productPage);
			app_stage.show();
		}
	}

	/**
	 * if the Scene buyPage is null then create a new scene or else use the scene that is stored in sellingPage
	 * @param event - ActionEvent
	 * @throws IOException
	 */

	@FXML
	void clickBuy(ActionEvent event) throws IOException {
		if (buyPage == null) {
			FXMLLoader loader = new FXMLLoader((getClass().getResource("/view/BuyView.fxml")));
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

	/**
	 * if the Scene shoppingCartPage is null then create a new scene or else use the scene that is stored in sellingPage
	 * @param event - ActionEvent
	 * @throws IOException
	 */

	@FXML
	void clickCart(ActionEvent event) throws IOException {
		if (shoppingCartPage == null) {
			FXMLLoader loader = new FXMLLoader((getClass().getResource("/view/ShoppingView.fxml")));
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

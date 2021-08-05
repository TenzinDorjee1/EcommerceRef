package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BuyController {
	
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

}

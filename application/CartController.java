package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CartController {
	@FXML
    private TextField addressfield;

    @FXML
    private PasswordField creditfield;

    @FXML
    private TextField emailfield;

    @FXML
    private TextField lastfield;

    @FXML
    private Label messagelabel;

    @FXML
    private TextField firstfield;

    @FXML
    void purchaseclick(ActionEvent event) throws IOException {
    	if (addressfield.getText().equals("")||creditfield.getText().equals("")||emailfield.getText().equals("")||
    			lastfield.getText().equals("")||firstfield.getText().equals("")){
    		messagelabel.setText("Enter all fields");
    	}
    	else {
    		AnchorPane homepage_parent = FXMLLoader.load(getClass().getResource("Done.fxml"));
    		Scene homepage_scene = new Scene(homepage_parent);
    		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
    		homepage_scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    		homepage_scene.getRoot().setStyle("-fx-font-family: 'serif'");
    		app_stage.setScene(homepage_scene);
    		app_stage.show();
    		
    	}
    	

    }

}

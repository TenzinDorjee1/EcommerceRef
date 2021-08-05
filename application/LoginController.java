package application;




import java.io.IOException;

import application.applicationtester;
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


public class LoginController {
		@FXML
	    private Label passwordlabel;

	    @FXML
	    private Label userlabel;

	    @FXML
	    private TextField usernamefield;

	    @FXML
	    private TextField passwordfield;
	    
	    @FXML
	    private PasswordField passwordfie;
	    
	    
	    @FXML
	    private Label messageLabel;
	    
	    @FXML
	    private Label welcome;
	    @FXML
	    private Label welcomemessage;
	    
	    @FXML
	    private AnchorPane yes;


		private applicationtester applicationtester;
		
		
		@FXML
	    void clickloginb(ActionEvent event) throws IOException{
			if (usernamefield.getText().equals("")||passwordfie.getText().equals("")){
	    		messageLabel.setText("Enter a valid username or password");
	    	}
	    	else {
	    		AnchorPane homepage_parent = FXMLLoader.load(getClass().getResource("Homepage.fxml"));
	    		Scene homepage_scene = new Scene(homepage_parent);
	    		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
	    		homepage_scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	    		homepage_scene.getRoot().setStyle("-fx-font-family: 'serif'");
	    		app_stage.setScene(homepage_scene);
	    		app_stage.show();
	    		
	    	}

	    }
		
	

		public void linkWithApplication(applicationtester applicationtester) {
			this.applicationtester = applicationtester;
			
		}
}

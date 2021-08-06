package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EndController {
	
	 @FXML
	    void clickexit(ActionEvent event) {
		 ((Node)(event.getSource())).getScene().getWindow().hide();
	    }

}

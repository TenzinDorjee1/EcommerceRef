package application;
import java.io.IOException;
import application.ApplicationTester;
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

/**
 * welcome page and prompts the user to enter their credentials
 */
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
	private AnchorPane loginPage;

	private ApplicationTester applicationtester;

	/**
	 * if all the text fields are not filled then display message
	 * @param event
	 * @throws IOException
	 */
	@FXML
	void clickLoginb(ActionEvent event) throws IOException{
		if (usernamefield.getText().equals("")||passwordfie.getText().equals("")){
			messageLabel.setText("Enter a valid username or password");
		}
		// once the TextFields have been filled then open Homepage.fxml
		else {
			FXMLLoader loader = new FXMLLoader();
			AnchorPane homepage_parent = loader.load(getClass().getResource("/view/Homepage.fxml"));
			HomepageController controller = loader.getController();

			Scene homepage_scene = new Scene(homepage_parent);
			Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();


			app_stage.setScene(homepage_scene);
			app_stage.show();	
		}
	}

	/**
	 * links with tester
	 * @param applicationtester
	 */
	public void linkWithApplication(ApplicationTester applicationtester) {
		this.applicationtester = applicationtester;		
	}
}

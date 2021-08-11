package application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 *ApplicationTester class extends the Application class
 *upon starting the application it will open the application to the SetupView.fxml scene
 */

public class ApplicationTester extends Application {
	Stage primaryStage;

	/**
	 * opens SetUpView.fxml upon loading the application
	 */

	public void setupView() {
		FXMLLoader loader = new FXMLLoader();
		Scene scene;
		try {
			// FileInputStream is the path to SetUpView.FXML
			Parent setupView = (Parent) loader.load(new FileInputStream("view/SetupView.fxml"));
			LoginController setupController = loader.getController();
			setupController.linkWithApplication(this);
			scene = new Scene(setupView,600,400);
			// setScene and show
			primaryStage.setScene(scene);
			primaryStage.show();		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
		}
	}

	/**
	 * sets stage to prepare for setting up the scene
	 */

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		setupView();
		
	/**
	 * launch(args)
	 * default	
	*/
	}
	public static void main(String[] args) {
		launch(args);
	}	
}




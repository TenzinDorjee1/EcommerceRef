package application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import classes.UserProfile;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;


public class applicationtester extends Application {
	Stage primaryStage;
	
	public void setupView() {
		FXMLLoader loader = new FXMLLoader();
		Scene scene;
		try {
			Parent setupView = (Parent) loader.load(new FileInputStream("application/SetupView.fxml"));
			LoginController setupController = loader.getController();
			setupController.linkWithApplication(this);
			scene = new Scene(setupView,500,400);
			scene.getRoot().setStyle("-fx-font-family: 'serif'");
			primaryStage.setScene(scene);
			primaryStage.show();		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void setupHome() {
		FXMLLoader loader = new FXMLLoader();
		Scene scene;
		try {
			loader = new FXMLLoader();
			Parent setupView = (Parent) loader.load(new FileInputStream("application/Homepage.fxml"));
			UserProfile setupController = loader.getController();
			setupController.linkWithApplication(this);
			scene = new Scene(setupView,300,300);
			scene.getRoot().setStyle("-fx-font-family: 'serif'");
			primaryStage.setScene(scene);
			primaryStage.show();		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		setupView();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	

	

		
	}




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

public class applicationtester extends Application {
	Stage primaryStage;

	
	public void setupView() {
		FXMLLoader loader = new FXMLLoader();
		Scene scene;
		try {
		
			Parent setupView = (Parent) loader.load(new FileInputStream("application/SetupView.fxml"));
			LoginController setupController = loader.getController();
			setupController.linkWithApplication(this);
			scene = new Scene(setupView,600,400);


			primaryStage.setScene(scene);
			primaryStage.show();		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
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




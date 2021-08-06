package model;


import java.io.IOException;

import application.applicationtester;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UserProfile {
	
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private applicationtester applicationtester;

	public UserProfile() {
		
	}

	public UserProfile(long id, String username, String email, String firstName, String lastName) {
		super();
		this.username = username;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		if(username!=" ") {
			this.username = username;
		}
		else {
			System.out.println("please enter a correct username");
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email!=" ") {
			this.email = email;
		}
		else {
			System.out.println("please enter a correct email address");
		}
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(email!=" ") {
			this.firstName = firstName;
		}
		else {
			System.out.println("please enter a correct email address");
		}
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if(lastName !=" ") {
			this.lastName = lastName;
		}
		else {
			System.out.println("please enter a correct name");
		}
	}

	public void linkWithApplication(applicationtester applicationtester) {
		this.applicationtester = applicationtester;
		
	}

}

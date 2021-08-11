package model;
import java.io.IOException;
import application.ApplicationTester;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * UserProfile Class is responsible for collecting user specific
 * information
 */

public class UserProfile {

    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private ApplicationTester applicationtester;

    /**
     * The userProfile method stores the customers private information
     * @param id
     * @param username
     * @param email
     * @param firstName
     * @param lastName
     */

    public UserProfile(long id, String username, String email, String firstName, String lastName) {
        super();
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     *  The getUsername() returns the user's userName
     */

    public String getUsername() {
        return username;
    }

    /**
     * This method set the user's userName if it is not equal to an empty string 
     * if the userName is empty the user is prompted a message 
     * @param username
     */

    public void setUsername(String username) {
        if(username!=" ") {
            this.username = username;
        }
        else {
            System.out.println("please enter a correct username");
        }
    }

    /**
     * getEmail method
     * @return email
     */

    public String getEmail() {
        return email;
    }

    /**
     * This method set the user's email if it is not equal to an empty string 
     * if the email is empty the user is prompted a message to enter a valid email 
     * @param email
     */

    public void setEmail(String email) {
        if(email!=" ") {
            this.email = email;
        }
        else {
            System.out.println("please enter a correct email address");
        }
    }

    /**
     * getFirstName()
     * @return firstName 
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     * This method set the user's firstName if it is not equal to an empty string 
     * if the firstName the user entered is empty, the user is prompted a message to enter a valid name 
     * @param firstName
     */

    public void setFirstName(String firstName) {
        if(email!=" ") {
            this.firstName = firstName;
        }
        else {
            System.out.println("please enter a correct email address");
        }
    }

    /**
     * getLastName()
     * @return lastName 
     */

    public String getLastName() {
        return lastName;
    }

    /**
     * This method set the user's lastName if it is not equal to an empty string 
     * if the user entered is empty field, the user will be  prompted a message to enter a valid name 
     * @param lastName
     */

    public void setLastName(String lastName) {
        if(lastName !=" ") {
            this.lastName = lastName;
        }
        else {
            System.out.println("please enter a correct name");
        }
    }

    /**
     *  linkWithApplication that takes an instance of applicationTester as an argument. 
     *  This method should initialize a new instance variable of type applicationTester using this argument 
     * @param applicationtester
     */

    public void linkWithApplication(ApplicationTester applicationtester) {
        this.applicationtester = applicationtester;
    }
}


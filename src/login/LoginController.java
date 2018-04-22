package login;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;


public class LoginController {
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private ComboBox userType;
    @FXML
    private Button loginButton;
    //TODO : Delete the gridpane object and id from FXML
    @FXML
    private GridPane gp;

    @FXML
    public void initialize(){
        //Stage s = (Stage) gp.getScene().getWindow();
        //System.out.println(s);
        //s.setResizable(false);
        //s.setTitle("Login to Resource Management System");


        userType.getItems().addAll("Admin", "Technician","Manager","Customer Service Rep");
    }

    /**TODO Connect to DB and login
     * Checks : If no userType is selected, throw error message box
     * Checks : Username, password should not be empty
     */
    @FXML
    private void loginButtonPressed(){
        String username = usernameTextField.getText().trim();
        String password = passwordField.getText();

        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
        System.out.println("Loggin as: " + userType.getValue());
    }



}

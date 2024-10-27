package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnEnter;

    @FXML
    private Button btnForgotPassword;

    @FXML
    private Button btoSignIn;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void OnEnter(ActionEvent event) {

    }

    @FXML
    void OnForgotPassword(ActionEvent event) {

    }

    @FXML
    void OnPassword(ActionEvent event) {

    }

    @FXML
    void OnSignIn(ActionEvent event) {

    }

    @FXML
    void OnUsername(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnEnter != null : "fx:id=\"btnEnter\" was not injected: check your FXML file 'login-view.fxml'.";
        assert btnForgotPassword != null : "fx:id=\"btnForgotPassword\" was not injected: check your FXML file 'login-view.fxml'.";
        assert btoSignIn != null : "fx:id=\"btoSignIn\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtUsername != null : "fx:id=\"txtUsername\" was not injected: check your FXML file 'login-view.fxml'.";

    }

}

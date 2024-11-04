package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
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
    private Button btnSignIn;

    @FXML
    private Button txtForgotPassword;

    @FXML
    private TextField txtIngresarContrasena;

    @FXML
    private TextField txtIngresarUsuario;

    @FXML
    void initialize() {
        assert btnEnter != null : "fx:id=\"btnEnter\" was not injected: check your FXML file 'login-view.fxml'.";
        assert btnSignIn != null : "fx:id=\"btnSignIn\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtForgotPassword != null : "fx:id=\"txtForgotPassword\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtIngresarContrasena != null : "fx:id=\"txtIngresarContrasena\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtIngresarUsuario != null : "fx:id=\"txtIngresarUsuario\" was not injected: check your FXML file 'login-view.fxml'.";

    }

}


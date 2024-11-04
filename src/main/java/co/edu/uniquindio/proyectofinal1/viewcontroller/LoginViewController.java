package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyectofinal1.MarketPlaceApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    void OnEnter(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("ingresar-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Registro!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void initialize() {
        assert btnEnter != null : "fx:id=\"btnEnter\" was not injected: check your FXML file 'login-view.fxml'.";
        assert btnSignIn != null : "fx:id=\"btnSignIn\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtForgotPassword != null : "fx:id=\"txtForgotPassword\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtIngresarContrasena != null : "fx:id=\"txtIngresarContrasena\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtIngresarUsuario != null : "fx:id=\"txtIngresarUsuario\" was not injected: check your FXML file 'login-view.fxml'.";

    }

}


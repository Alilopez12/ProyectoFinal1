package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;

public class IngresarViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnRegistrarse;

    @FXML
    private MenuButton btnRol;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtFirstName;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void OnRegistrarse(ActionEvent event) {

    }

    @FXML
    void OnRol(ActionEvent event) {

    }

    @FXML
    void Onback(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnBack != null : "fx:id=\"btnBack\" was not injected: check your FXML file 'ingresar-view.fxml'.";
        assert btnRegistrarse != null : "fx:id=\"btnRegistrarse\" was not injected: check your FXML file 'ingresar-view.fxml'.";
        assert btnRol != null : "fx:id=\"btnRol\" was not injected: check your FXML file 'ingresar-view.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'ingresar-view.fxml'.";
        assert txtFirstName != null : "fx:id=\"txtFirstName\" was not injected: check your FXML file 'ingresar-view.fxml'.";
        assert txtLastName != null : "fx:id=\"txtLastName\" was not injected: check your FXML file 'ingresar-view.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'ingresar-view.fxml'.";
        assert txtUsername != null : "fx:id=\"txtUsername\" was not injected: check your FXML file 'ingresar-view.fxml'.";

    }

}

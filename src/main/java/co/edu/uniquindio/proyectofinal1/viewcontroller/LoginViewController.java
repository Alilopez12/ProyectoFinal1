package co.edu.uniquindio.proyectofinal1.viewcontroller;

import co.edu.uniquindio.proyectofinal1.model.AutenticacionProxy;
import co.edu.uniquindio.proyectofinal1.service.IAutenticacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginViewController {

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

    private IAutenticacion autenticacionProxy = new AutenticacionProxy();

    @FXML
    void OnEnter(ActionEvent event) throws IOException {
        String usuario = txtIngresarUsuario.getText();
        String contrasena = txtIngresarContrasena.getText();

        if (autenticacionProxy.autenticar(usuario, contrasena)) {
            System.out.println("Usuario autenticado exitosamente.");

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/proyectofinal1/view/main-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = (Stage) btnEnter.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Pantalla Principal");
            stage.show();

        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error de Autenticación");
            alert.setHeaderText("Usuario o Contraseña incorrectos");
            alert.setContentText("Por favor, ingrese las credenciales correctas.");
            alert.showAndWait();
        }
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
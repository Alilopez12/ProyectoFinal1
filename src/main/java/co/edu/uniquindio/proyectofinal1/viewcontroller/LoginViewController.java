package co.edu.uniquindio.proyectofinal1.viewcontroller;

import co.edu.uniquindio.proyectofinal1.MarketPlaceApplication;
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

            String rol = autenticacionProxy.obtenerRolUsuario(usuario);
            cargarInterfazPorRol(rol);

        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error de Autenticación");
            alert.setHeaderText("Usuario o Contraseña incorrectos");
            alert.setContentText("Por favor, ingrese las credenciales correctas.");
            alert.showAndWait();
        }
    }

    @FXML
    void OnSignin(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("ingresar-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Registro");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void onForgotPassword(ActionEvent event) {
        System.out.println("Olvido su contraseña");
    }


    @FXML
    void initialize() {
        assert btnEnter != null : "fx:id=\"btnEnter\" was not injected: check your FXML file 'login-view.fxml'.";
        assert btnSignIn != null : "fx:id=\"btnSignIn\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtForgotPassword != null : "fx:id=\"txtForgotPassword\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtIngresarContrasena != null : "fx:id=\"txtIngresarContrasena\" was not injected: check your FXML file 'login-view.fxml'.";
        assert txtIngresarUsuario != null : "fx:id=\"txtIngresarUsuario\" was not injected: check your FXML file 'login-view.fxml'.";
    }

    // Método para cargar la interfaz según el rol
    private void cargarInterfazPorRol(String rol) throws IOException {
        FXMLLoader fxmlLoader;
        Stage stage = (Stage) btnEnter.getScene().getWindow();

        switch (rol) {
            case "ADMIN":
                fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("estadisticas-view.fxml"));
                break;

            case "VENDEDOR":
                fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("vendedor1-view.fxml"));
                break;

            default:
                fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("login-view.fxml"));
                break;
        }

        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(scene);
        stage.setTitle("Pantalla Principal");
        stage.show();
    }

}
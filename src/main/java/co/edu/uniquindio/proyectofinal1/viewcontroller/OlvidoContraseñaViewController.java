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
import javafx.stage.Stage;

public class OlvidoContraseñaViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnEnviar;

    @FXML
    void OnBack(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Registro");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void OnEnviar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnBack != null : "fx:id=\"btnBack\" was not injected: check your FXML file 'olvidoContraseña-view.fxml'.";
        assert btnEnviar != null : "fx:id=\"btnEnviar\" was not injected: check your FXML file 'olvidoContraseña-view.fxml'.";

    }

}

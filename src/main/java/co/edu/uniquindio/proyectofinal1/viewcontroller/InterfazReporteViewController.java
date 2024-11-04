package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class InterfazReporteViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnExportar;

    @FXML
    void initialize() {
        assert btnExportar != null : "fx:id=\"btnExportar\" was not injected: check your FXML file 'interfazReporte-view.fxml'.";

    }

}

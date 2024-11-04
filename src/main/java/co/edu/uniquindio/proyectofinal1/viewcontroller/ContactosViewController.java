package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ContactosViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregar1;

    @FXML
    private Button btnAgregar2;

    @FXML
    private Button btnAgregar3;

    @FXML
    private Button btnProductos1;

    @FXML
    private Button btnProductos2;

    @FXML
    private Button btnProductos3;

    @FXML
    private Button btnVer;

    @FXML
    void initialize() {
        assert btnAgregar1 != null : "fx:id=\"btnAgregar1\" was not injected: check your FXML file 'contactos-view.fxml'.";
        assert btnAgregar2 != null : "fx:id=\"btnAgregar2\" was not injected: check your FXML file 'contactos-view.fxml'.";
        assert btnAgregar3 != null : "fx:id=\"btnAgregar3\" was not injected: check your FXML file 'contactos-view.fxml'.";
        assert btnProductos1 != null : "fx:id=\"btnProductos1\" was not injected: check your FXML file 'contactos-view.fxml'.";
        assert btnProductos2 != null : "fx:id=\"btnProductos2\" was not injected: check your FXML file 'contactos-view.fxml'.";
        assert btnProductos3 != null : "fx:id=\"btnProductos3\" was not injected: check your FXML file 'contactos-view.fxml'.";
        assert btnVer != null : "fx:id=\"btnVer\" was not injected: check your FXML file 'contactos-view.fxml'.";

    }

}

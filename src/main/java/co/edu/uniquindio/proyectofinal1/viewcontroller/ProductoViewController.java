package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ProductoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnAgregarProducto;

    @FXML
    private Button btnEliminarProducto;

    @FXML
    private Button btnLimpiarSeleccion;

    @FXML
    private TableView<?> tableProducto;

    @FXML
    private TableColumn<?, ?> tcCantidad;

    @FXML
    private TableColumn<?, ?> tcId;

    @FXML
    private TableColumn<?, ?> tcNombre;

    @FXML
    private TableColumn<?, ?> tcPrecio;

    @FXML
    private TextField txtCantDisponible;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPrecio;

    @FXML
    void onActualizarProducto(ActionEvent event) {

    }

    @FXML
    void onAgregarProducto(ActionEvent event) {

    }

    @FXML
    void onEliminarProducto(ActionEvent event) {

    }

    @FXML
    void onLimpiarSeleccion(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnActualizar != null : "fx:id=\"btnActualizar\" was not injected: check your FXML file 'producto-view.fxml'.";
        assert btnAgregarProducto != null : "fx:id=\"btnAgregarProducto\" was not injected: check your FXML file 'producto-view.fxml'.";
        assert btnEliminarProducto != null : "fx:id=\"btnEliminarProducto\" was not injected: check your FXML file 'producto-view.fxml'.";
        assert btnLimpiarSeleccion != null : "fx:id=\"btnLimpiarSeleccion\" was not injected: check your FXML file 'producto-view.fxml'.";
        assert tableProducto != null : "fx:id=\"tableProducto\" was not injected: check your FXML file 'producto-view.fxml'.";
        assert tcCantidad != null : "fx:id=\"tcCantidad\" was not injected: check your FXML file 'producto-view.fxml'.";
        assert tcId != null : "fx:id=\"tcId\" was not injected: check your FXML file 'producto-view.fxml'.";
        assert tcNombre != null : "fx:id=\"tcNombre\" was not injected: check your FXML file 'producto-view.fxml'.";
        assert tcPrecio != null : "fx:id=\"tcPrecio\" was not injected: check your FXML file 'producto-view.fxml'.";
        assert txtCantDisponible != null : "fx:id=\"txtCantDisponible\" was not injected: check your FXML file 'producto-view.fxml'.";
        assert txtId != null : "fx:id=\"txtId\" was not injected: check your FXML file 'producto-view.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'producto-view.fxml'.";
        assert txtPrecio != null : "fx:id=\"txtPrecio\" was not injected: check your FXML file 'producto-view.fxml'.";

    }

}

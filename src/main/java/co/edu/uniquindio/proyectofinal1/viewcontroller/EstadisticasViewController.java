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


public class EstadisticasViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGenerarVendedores;

    @FXML
    private TextField txtVendedores;

    @FXML
    private TextField txtProductos;

    @FXML
    private Button btnGenerarProductos;

    @FXML
    private Button btnExportarEstadisticas;


    @FXML
    void OnExportarEstadisticas(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("interfazReporte-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("reporte");
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    void onGenerarVendedores(ActionEvent event) {

    }

    @FXML
    void onGenerarProductos(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("totalProductos.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Registro");
        stage.setScene(scene);
        stage.show();

    }


    @FXML
    void initialize() {
        assert btnGenerarVendedores != null : "fx:id=\"btnGenerarVendedores\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert txtVendedores != null : "fx:id=\"txtVendedores\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert txtProductos != null : "fx:id=\"txtProductos\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert btnGenerarProductos != null : "fx:id=\"btnGenerarProductos\" was not injected: check your FXML file 'estadisticas-view.fxml'.";
        assert btnExportarEstadisticas != null : "fx:id=\"btnExportarEstadisticas\" was not injected: check your FXML file 'estadisticas-view.fxml'.";

    }
}


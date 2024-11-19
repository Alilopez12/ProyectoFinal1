package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyectofinal1.model.MeGustaObservable;
import co.edu.uniquindio.proyectofinal1.service.MeGustaObserver;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MuroViewController implements MeGustaObserver {
    private final MeGustaObservable observable = new MeGustaObservable();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnIngresarAlChat;

    @FXML
    private Button btnMeGusta;

    @FXML
    private Button btnVerMas;


    @FXML
    private Label megustalabel;

    @FXML
    void OnIngresarAlChat(ActionEvent event) {

    }

    @FXML
    void OnMeGusta(ActionEvent event) {
        observable.incrementarMeGusta(); //INCREMENTA LA CANTIDAD DE ME GUSTA
    }

    @FXML
    void OnVerMas(ActionEvent event) {

    }

    @FXML
    void initialize() {
        observable.agregarObserver(this); // Registra el controlador como observador
        megustalabel.setText("0");
    }

    @Override
    public void update(int CantidadMeGusta) {
        megustalabel.setText("Me gusta: " + CantidadMeGusta); // Actualiza el label
    }
}

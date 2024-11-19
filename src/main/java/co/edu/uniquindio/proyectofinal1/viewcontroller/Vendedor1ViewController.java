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
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Vendedor1ViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button OnProductosAlbertoDiazC;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnChatAlbertoDiazC;

    @FXML
    private Button btnChatAndreyOchoa132;

    @FXML
    private Button btnInfoSmartphone;

    @FXML
    private Button btnIngresarChat;

    @FXML
    private Button btnIngresarChat1;

    @FXML
    private Button btnMeGustaAudifonos;

    @FXML
    private Button btnMeGustaSmarphone;

    @FXML
    private Button btnProductosAndreyOchoa132;

    @FXML
    private Button btnVerAndreyOchoa132;

    @FXML
    private Button btnVerHacMath120;

    @FXML
    private Button btnVerMasComentariosAudifonos;

    @FXML
    private Button btnVerMasComentariosSmarphone;

    @FXML
    private Button btnVerPaulHappy;

    @FXML
    private Button btnVerProductosPaulinaRubio777;

    @FXML
    private Label labelMeGusta;

    @FXML
    private Label labelMeGusta1;

    @FXML
    private Label labelNumeroContactosPaulinaRubio777;

    @FXML
    void OnBuscar(ActionEvent event) {

    }

    @FXML
    void OnChatAlbertoDiazC(ActionEvent event) {

    }

    @FXML
    void OnChatAndreyOchoa132(ActionEvent event) {

    }

    @FXML
    void OnInfoSmartphone(ActionEvent event) {

    }

    @FXML
    public void OnInfoAudifonos(ActionEvent event) {

    }

    @FXML
    void OnIngresarChat(ActionEvent event) {

    }

    @FXML
    void OnLabelContactosPaulinaRubio777(MouseEvent event) {

    }

    @FXML
    void OnLabelMeGusta(MouseEvent event) {

    }

    @FXML
    void OnMeGustaAudifonos(ActionEvent event) {

    }

    @FXML
    void OnMeGustaSmartphone(ActionEvent event) {

    }

    @FXML
    void OnVerHacMath120(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("vendedor3-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Registro");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void OnVerMasComentariosAudifonos(ActionEvent event) {

    }

    @FXML
    void OnVerMasComentariosSmartphone(ActionEvent event) {

    }

    @FXML
    void OnVerPaulHappy(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("vendedor4-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Registro");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void OnVerProductosPaulinaRubio777(ActionEvent event) {

    }

    @FXML
    void OnVerVendedorAndreyOchoa132(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("vendedor2-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Registro");
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    void initialize() {
        assert OnProductosAlbertoDiazC != null : "fx:id=\"OnProductosAlbertoDiazC\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert btnBuscar != null : "fx:id=\"btnBuscar\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert btnChatAlbertoDiazC != null : "fx:id=\"btnChatAlbertoDiazC\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert btnChatAndreyOchoa132 != null : "fx:id=\"btnChatAndreyOchoa132\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert btnInfoSmartphone != null : "fx:id=\"btnInfoSmartphone\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert btnIngresarChat != null : "fx:id=\"btnIngresarChat\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert btnIngresarChat1 != null : "fx:id=\"btnIngresarChat1\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert btnMeGustaAudifonos != null : "fx:id=\"btnMeGustaAudifonos\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert btnMeGustaSmarphone != null : "fx:id=\"btnMeGustaSmarphone\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert btnProductosAndreyOchoa132 != null : "fx:id=\"btnProductosAndreyOchoa132\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert btnVerAndreyOchoa132 != null : "fx:id=\"btnVerAndreyOchoa132\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert btnVerHacMath120 != null : "fx:id=\"btnVerHacMath120\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert btnVerMasComentariosAudifonos != null : "fx:id=\"btnVerMasComentariosAudifonos\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert btnVerMasComentariosSmarphone != null : "fx:id=\"btnVerMasComentariosSmarphone\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert btnVerPaulHappy != null : "fx:id=\"btnVerPaulHappy\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert btnVerProductosPaulinaRubio777 != null : "fx:id=\"btnVerProductosPaulinaRubio777\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert labelMeGusta != null : "fx:id=\"labelMeGusta\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert labelMeGusta1 != null : "fx:id=\"labelMeGusta1\" was not injected: check your FXML file 'vendedor1-view.fxml'.";
        assert labelNumeroContactosPaulinaRubio777 != null : "fx:id=\"labelNumeroContactosPaulinaRubio777\" was not injected: check your FXML file 'vendedor1-view.fxml'.";

    }

}

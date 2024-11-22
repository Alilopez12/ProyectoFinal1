package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyectofinal1.MarketPlaceApplication;
import co.edu.uniquindio.proyectofinal1.model.MeGustaObservable;
import co.edu.uniquindio.proyectofinal1.service.MeGustaObserver;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Vendedor1ViewController implements MeGustaObserver {

    private final MeGustaObservable observableAudifonos = new MeGustaObservable(); // Observable para audífonos
    private final MeGustaObservable observableSmartphone = new MeGustaObservable(); // Observable para smartphones

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
    private Label labelMeGusta; // Label para audífonos

    @FXML
    private Label labelMeGusta1; // Label para smartphones

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
    void OnInfoSmartphone(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("smartphone-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Registro");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void OnInfoAudifonos(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("audifonos.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Registro");
        stage.setScene(scene);
        stage.show();

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
        observableAudifonos.incrementarMeGusta(); // Incrementa los "me gusta" de audífonos
    }

    @FXML
    void OnMeGustaSmartphone(ActionEvent event) {
        observableSmartphone.incrementarMeGusta(); // Incrementa los "me gusta" de smartphones
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
        // Registra los observables
        observableAudifonos.agregarObserver(new MeGustaObserver() {
            @Override
            public void update(int cantidadMeGusta) {
                labelMeGusta1.setText(String.valueOf(cantidadMeGusta));
            }
        });

        observableSmartphone.agregarObserver(new MeGustaObserver() {
            @Override
            public void update(int cantidadMeGusta) {
                labelMeGusta.setText(String.valueOf(cantidadMeGusta));
            }
        });

        // Inicializa los valores de los labels
        labelMeGusta1.setText("0");
        labelMeGusta.setText("0");
    }

    @Override
    public void update(int cantidadMeGusta) {

    }

    public void OnComentariosSmartphone(ActionEvent actionEvent) {
    }

    public void OnComentariosAudifonos(ActionEvent actionEvent) {

    }

    public void OnCrearPeroducto(ActionEvent actionEvent) {

    }
}

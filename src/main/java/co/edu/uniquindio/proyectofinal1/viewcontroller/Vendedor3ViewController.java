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

public class Vendedor3ViewController implements MeGustaObserver {
    private final MeGustaObservable observableOcarina = new MeGustaObservable();
    private final MeGustaObservable observableAmiibo = new MeGustaObservable();

    private boolean ocarinaLiked = false; // Controla si ya se votó en Ocarina
    private boolean amiiboLiked = false;  // Controla si ya se votó en Amiibo

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnChatPaulHappy;

    @FXML
    private Button btnChatYandereSim;

    @FXML
    private Button btnComentariosAmiibo;

    @FXML
    private Button btnComentariosOcarina;

    @FXML
    private Button btnInfoAmiibo;

    @FXML
    private Button btnInfoOcarina;

    @FXML
    private Button btnIngresarAlChat;

    @FXML
    private Button btnMeGustaAmiibo;

    @FXML
    private Button btnMeGustaOcarina;

    @FXML
    private Button btnVerAndreyOchoa132;

    @FXML
    private Button btnVerPaulHappy;

    @FXML
    private Button btnVerPaulinaRubio777;

    @FXML
    private Label labelMeGustaAmiibo;

    @FXML
    private Label labelMeGustaOcarina;

    @FXML
    private Label labelNumeroContactosHacMath120;

    @FXML
    void OnBuscar(ActionEvent event) {

    }

    @FXML
    void OnChatPaulHappy(ActionEvent event) {

    }

    @FXML
    void OnChatYandereSim(ActionEvent event) {

    }

    @FXML
    void OnComentariosAmiibo(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("comentario-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Registro");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OnComentariosOcarina(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("comentario-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Registro");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OnInfoAmiibo(ActionEvent event) {

    }

    @FXML
    void OnInfoOcarina(ActionEvent event) {

    }

    @FXML
    void OnIngresarChat(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("chatPaulinaHac.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Registro");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OnLabelNumeroContactosHacMath120(MouseEvent event) {

    }

    @FXML
    void OnMeGustaAmiibo(ActionEvent event) {
        if (!amiiboLiked) { // Verifica si ya se votó
            observableAmiibo.incrementarMeGusta();
            amiiboLiked = true; // Marca como votado
            btnMeGustaAmiibo.setDisable(true); // Deshabilita el botón
        }

    }

    @FXML
    void OnMeGustaOcarina(ActionEvent event) {
        if (!ocarinaLiked) { // Verifica si ya se votó
            observableOcarina.incrementarMeGusta();
            ocarinaLiked = true; // Marca como votado
            btnMeGustaOcarina.setDisable(true); // Deshabilita el botón
        }

    }

    @FXML
    void OnVerAndreyOchoa132(ActionEvent event) {

    }

    @FXML
    void OnVerPaulHappy(ActionEvent event) {

    }

    @FXML
    void OnVerPaulinaRubio777(ActionEvent event) {

    }

    @FXML
    void initialize() {
        observableOcarina.agregarObserver(cantidadMeGusta ->
                labelMeGustaOcarina.setText(String.valueOf(cantidadMeGusta))
        );

        observableAmiibo.agregarObserver(cantidadMeGusta ->
                labelMeGustaAmiibo.setText(String.valueOf(cantidadMeGusta))
        );

        // Inicializa los valores de los labels
        labelMeGustaOcarina.setText("0");
        labelMeGustaAmiibo.setText("0");
    }

    @Override
    public void update(int cantidadMeGusta) {
        // Actualización adicional si se necesita
    }

    public void OnCrearProducto(ActionEvent actionEvent) {
    }
}
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

public class Vendedor3ViewController {

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
    private Button btnProductosPaulHappy;

    @FXML
    private Button btnProductosYandereSim;

    @FXML
    private Button btnVerAndreyOchoa132;

    @FXML
    private Button btnVerMasComentariosAmiibo;

    @FXML
    private Button btnVerMasComentariosOcarina;

    @FXML
    private Button btnVerPaulHappy;

    @FXML
    private Button btnVerPaulinaRubio777;

    @FXML
    private Button btnVerProductosHacMath120;

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
    void OnMeGustaAmiibo(MouseEvent event) {

    }

    @FXML
    void OnMeGustaOcarina(MouseEvent event) {

    }

    @FXML
    void OnProductosPaulHappy(ActionEvent event) {

    }

    @FXML
    void OnProductosYandereSim(ActionEvent event) {

    }

    @FXML
    void OnVerAndreyOchoa132(ActionEvent event) {

    }

    @FXML
    void OnVerMasComentariosAmiibo(ActionEvent event) {

    }

    @FXML
    void OnVerMasComentariosOcarina(ActionEvent event) {

    }

    @FXML
    void OnVerPaulHappy(ActionEvent event) {

    }

    @FXML
    void OnVerPaulinaRubio777(ActionEvent event) {

    }

    @FXML
    void OnVerProductosHacMath120(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnBuscar != null : "fx:id=\"btnBuscar\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert btnChatPaulHappy != null : "fx:id=\"btnChatPaulHappy\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert btnChatYandereSim != null : "fx:id=\"btnChatYandereSim\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert btnInfoAmiibo != null : "fx:id=\"btnInfoAmiibo\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert btnInfoOcarina != null : "fx:id=\"btnInfoOcarina\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert btnIngresarAlChat != null : "fx:id=\"btnIngresarAlChat\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert btnMeGustaAmiibo != null : "fx:id=\"btnMeGustaAmiibo\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert btnMeGustaOcarina != null : "fx:id=\"btnMeGustaOcarina\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert btnProductosPaulHappy != null : "fx:id=\"btnProductosPaulHappy\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert btnProductosYandereSim != null : "fx:id=\"btnProductosYandereSim\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert btnVerAndreyOchoa132 != null : "fx:id=\"btnVerAndreyOchoa132\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert btnVerMasComentariosAmiibo != null : "fx:id=\"btnVerMasComentariosAmiibo\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert btnVerMasComentariosOcarina != null : "fx:id=\"btnVerMasComentariosOcarina\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert btnVerPaulHappy != null : "fx:id=\"btnVerPaulHappy\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert btnVerPaulinaRubio777 != null : "fx:id=\"btnVerPaulinaRubio777\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert btnVerProductosHacMath120 != null : "fx:id=\"btnVerProductosHacMath120\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert labelMeGustaAmiibo != null : "fx:id=\"labelMeGustaAmiibo\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert labelMeGustaOcarina != null : "fx:id=\"labelMeGustaOcarina\" was not injected: check your FXML file 'vendedor3-view.fxml'.";
        assert labelNumeroContactosHacMath120 != null : "fx:id=\"labelNumeroContactosHacMath120\" was not injected: check your FXML file 'vendedor3-view.fxml'.";

    }

}

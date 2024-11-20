package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class chatPaulinaPaulViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnEnviar;

    @FXML
    private ListView<String> chatView;

    @FXML
    private TextField txtCampoMensaje;

    private final String[] mensajesPredeterminadosPaulHappy = {
            "hello helloo ¿cómo te ha ido?",
            "Déjame pensar un momento.",
            "Quieres alguno de mis productos?",
            "Dame un momento, ya te respondo",
            "¿ah?",
            "Ya te detallo más el asunto, espera"
    };

    @FXML
    void OnEnviarMensaje(ActionEvent event) {

        String mensajeUsuario = txtCampoMensaje.getText().trim();

        if (!mensajeUsuario.isEmpty()) {

            chatView.getItems().add("Tú: " + mensajeUsuario);
            txtCampoMensaje.clear();

            generarRespuestaAutomaticaPaul();
        }
    }

    private void generarRespuestaAutomaticaPaul() {

        new Thread(() -> {
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            Random random = new Random();
            String respuesta = mensajesPredeterminadosPaulHappy[random.nextInt(mensajesPredeterminadosPaulHappy.length)];

            javafx.application.Platform.runLater(() -> {
                chatView.getItems().add("PaulHappy: " + respuesta);
            });
        }).start();
    }

    @FXML
    void initialize() {
        assert btnEnviar != null : "fx:id=\"btnEnviar\" was not injected: check your FXML file 'chatPaulinaPaul.fxml'.";
        assert chatView != null : "fx:id=\"chatView\" was not injected: check your FXML file 'chatPaulinaPaul.fxml'.";
        assert txtCampoMensaje != null : "fx:id=\"txtCampoMensaje\" was not injected: check your FXML file 'chatPaulinaPaul.fxml'.";

        chatView.setItems(FXCollections.observableArrayList());
    }
}
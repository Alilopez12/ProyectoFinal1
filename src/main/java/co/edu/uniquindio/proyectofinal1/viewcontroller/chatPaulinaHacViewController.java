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

public class chatPaulinaHacViewController {

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

    private final String[] mensajesPredeterminadosHacMath = {
            "Holaa Paulii, como estas??",
            "Sipi, quieres el cel?",
            "Déjame verificar algo",
            "Perame, ya te informo",
            "Pauliii que más",
            "Super, quieres algo más?"
    };

    @FXML
    void onEnviarMensaje(ActionEvent event) {

        String mensajeUsuario = txtCampoMensaje.getText().trim();

        if (!mensajeUsuario.isEmpty()) {

            chatView.getItems().add("Tú: " + mensajeUsuario);
            txtCampoMensaje.clear();

            generarRespuestaAutomatica();
        }
    }

    private void generarRespuestaAutomatica() {
        new Thread(() -> {
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            Random random = new Random();
            String respuesta = mensajesPredeterminadosHacMath[random.nextInt(mensajesPredeterminadosHacMath.length)];

            javafx.application.Platform.runLater(() -> {
                chatView.getItems().add("HacMath120: " + respuesta);
            });
        }).start();
    }

    @FXML
    void initialize() {
        assert btnEnviar != null : "fx:id=\"btnEnviar\" was not injected: check your FXML file 'chatPaulinaHac.fxml'.";
        assert chatView != null : "fx:id=\"chatView\" was not injected: check your FXML file 'chatPaulinaHac.fxml'.";
        assert txtCampoMensaje != null : "fx:id=\"txtCampoMensaje\" was not injected: check your FXML file 'chatPaulinaHac.fxml'.";

        chatView.setItems(FXCollections.observableArrayList());
    }
}
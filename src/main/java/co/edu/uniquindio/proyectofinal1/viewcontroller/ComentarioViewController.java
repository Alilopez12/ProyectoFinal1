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

public class ComentarioViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> IdComentarioView;

    @FXML
    private Button btnPublicar;

    @FXML
    private TextField txtCampoMensaje;

    private final String[] mensajesPredeterminadosUsuario = {
            "Holaa Paulii, como estas??",
            "Sipi, quieres el cel?",
            "Déjame verificar algo",
            "Perame, ya te informo",
            "Pauliii que más",
            "Super, quieres algo más?"
    };

    @FXML
    void OnPublicarComentario(ActionEvent event) {
        String mensajeUsuario = txtCampoMensaje.getText().trim();

        if (!mensajeUsuario.isEmpty()) {
            // Agregar mensaje del usuario
            IdComentarioView.getItems().add("Tú: " + mensajeUsuario);
            txtCampoMensaje.clear();

        }
    }



    @FXML
    void initialize() {
        assert IdComentarioView != null : "fx:id=\"IdComentarioView\" was not injected: check your FXML file 'comentario-view.fxml'.";
        assert btnPublicar != null : "fx:id=\"btnPublicar\" was not injected: check your FXML file 'comentario-view.fxml'.";
        assert txtCampoMensaje != null : "fx:id=\"txtCampoMensaje\" was not injected: check your FXML file 'comentario-view.fxml'.";

        // Inicializar la lista con mensajes predeterminados
        IdComentarioView.setItems(FXCollections.observableArrayList(
                "HacMath120: Que producto tan espectacular",
                "PaulHappy: Me encanta como luce",
                "AndreyOchoa132: Quisiera tener uno ya mismo"
        ));
    }
}

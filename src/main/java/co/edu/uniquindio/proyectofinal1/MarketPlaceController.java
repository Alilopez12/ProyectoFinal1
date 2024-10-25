package co.edu.uniquindio.proyectofinal1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MarketPlaceController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
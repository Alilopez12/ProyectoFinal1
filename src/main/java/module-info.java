module co.edu.uniquindio.proyectofinal1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.proyectofinal1 to javafx.fxml;
    exports co.edu.uniquindio.proyectofinal1;
}
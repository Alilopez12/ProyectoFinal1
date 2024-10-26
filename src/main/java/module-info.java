module co.edu.uniquindio.proyectofinal1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop; //linea añadida para solucionar problemas


    opens co.edu.uniquindio.proyectofinal1 to javafx.fxml;
    exports co.edu.uniquindio.proyectofinal1;
}
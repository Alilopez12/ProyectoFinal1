module co.edu.uniquindio.proyectofinal1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop; //linea añadida para solucionar problemas


    opens co.edu.uniquindio.proyectofinal1 to javafx.fxml;
    exports co.edu.uniquindio.proyectofinal1;

    opens co.edu.uniquindio.proyectofinal1.viewcontroller;
    exports co.edu.uniquindio.proyectofinal1.viewcontroller;
    exports co.edu.uniquindio.proyectofinal1.service;
    opens co.edu.uniquindio.proyectofinal1.service;
    exports co.edu.uniquindio.proyectofinal1.model;
    opens co.edu.uniquindio.proyectofinal1.model;
}
package co.edu.uniquindio.proyectofinal1.viewcontroller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyectofinal1.MarketPlaceApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;


public class InterfazReporteViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnExportar;

    @FXML
    void OnExportarReporte(ActionEvent event) {

        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Seleccione la carpeta para guardar el reporte <3");
        File directorioSeleccionado = directoryChooser.showDialog(null);

        if (directorioSeleccionado != null) {
            String ruta = directorioSeleccionado.getAbsolutePath();
            String titulo = "Reporte de Estadisticas Generales";
            String usuario = "Alicia la Admin";
            String contenido = "Contenido del reporte con estadísticas, etc.";
            String fechaExportacion = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
            String nombreArchivo = "Reporte_" + titulo.replace(" ", "_") + ".txt";
            File archivo = new File(ruta, nombreArchivo);

            try (FileWriter writer = new FileWriter(archivo)) {
                writer.write("<Título> " + titulo + "\n");
                writer.write("<fecha> Fecha: " + fechaExportacion + "\n");
                writer.write("<Usuario> Reporte realizado por: " + usuario + "\n\n");
                writer.write("Información del reporte:\n");
                writer.write(contenido + "\n");
                writer.write("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
                writer.write("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");

                System.out.println("Reporte exportado exitosamente en: " + archivo.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("Error al exportar el reporte: " + e.getMessage());
            }
        } else {
            System.out.println("No se seleccionó ningún directorio. Porfavor elija uno");
        }
    }


    @FXML
    private Button btnBack;

    @FXML
    void onBack(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(MarketPlaceApplication.class.getResource("estadisticas-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Registro");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void initialize() {
        assert btnExportar != null : "fx:id=\"btnExportar\" was not injected: check your FXML file 'interfazReporte-view.fxml'.";

    }

}

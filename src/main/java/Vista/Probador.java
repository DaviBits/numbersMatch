package Vista;

import Logica.Tablero;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Probador extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Tablero tablero = new Tablero(10, 4);
        PantallaDeJuego menu = new PantallaDeJuego(tablero);

        Scene scene= new Scene(menu, 1200, 600);
        //scene.getStylesheets().add(getClass().getResource("/estilos.CSS").toExternalForm());

        try{
            stage.setTitle("oda");
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}

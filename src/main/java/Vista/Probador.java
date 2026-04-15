package Vista;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Probador extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        MenuInicial menu = new MenuInicial();

        Scene scene= new Scene(menu, 1200, 600);
        scene.getStylesheets().add(getClass().getResource("/estilos.CSS").toExternalForm());

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

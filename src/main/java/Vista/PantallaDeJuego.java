package Vista;

import Logica.Tablero;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class PantallaDeJuego extends VBox {
    private PanelSuperior panelSuperior;
    private TableroUI tableroUI;
    private PanelInferior panelInferior;

    public PantallaDeJuego(Tablero tablero){
        panelInferior=new PanelInferior();
        panelSuperior=new PanelSuperior();
        tableroUI= new TableroUI(tablero);
        VBox.setVgrow(tableroUI, Priority.ALWAYS);
        this.getChildren().addAll(panelSuperior, tableroUI, panelInferior);
    }
}

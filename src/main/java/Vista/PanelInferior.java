package Vista;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class PanelInferior extends HBox{
    private Button botonPista;
    private Button botonDeshacer;
    private Button botonAgregarFila;

    public PanelInferior(){
        botonPista=new Button("💡");
        botonDeshacer=new Button("↩");
        botonAgregarFila=new Button("➕");

        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(botonPista, botonDeshacer, botonAgregarFila);
        this.setSpacing(10);
        this.setStyle("-fx-background-color: #2c3e50;");
    }
}

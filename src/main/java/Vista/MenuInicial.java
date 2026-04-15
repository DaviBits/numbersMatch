package Vista;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MenuInicial extends VBox {
    private Label titulo;
    private Label instrucciones;
    private Button iniciar;
    private Spinner<Integer> filas;
    private Spinner <Integer> columnas;
    private Label labelFil, labelCol;
    private HBox entradas;

    public MenuInicial(){

        titulo= new Label("NUMBER MATCH!!");
        instrucciones= new Label("Ingrese las dimensiones del tablero: ");
        labelFil=new Label("filas: ");
        filas= new Spinner<>(4, 20, 2);
        labelCol=new Label("columnas: ");
        columnas= new Spinner<>(10, 20, 10);
        iniciar= new Button("INICIAR!!");

        entradas= new HBox(labelFil, filas, labelCol, columnas);
        entradas.setAlignment(Pos.CENTER);
        entradas.setSpacing(20);
        this.getChildren().addAll(titulo, instrucciones, entradas, iniciar);
        this.setAlignment(Pos.CENTER);
        setButtonAction();
    }

    public int getFilas(){return filas.getValue();}
    public int getColumnas(){return columnas.getValue();}

    public void setButtonAction(){
        iniciar.setOnMouseClicked(e->{
            System.out.println("filas: "+getFilas());
            System.out.println("columnas: "+getColumnas());
        });
    }

}

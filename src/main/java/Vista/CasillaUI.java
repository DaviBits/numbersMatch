package Vista;

import Logica.Casilla;
import Logica.Nodo;
import javafx.scene.control.Button;

public class CasillaUI extends Button {
    private Nodo nodoLogico;

    public CasillaUI(Nodo nodoLogico){
        this.nodoLogico=nodoLogico;
        this.setPrefSize(60, 60);
        this.setMinSize(60, 60);
        this.setMaxSize(60, 60);
        actualizarUI();
    }

    public void actualizarUI(){
        Casilla dato= nodoLogico.getDato();
        if(dato.isEsVacia()){
            this.setText("");
            vaciarVista();
            this.setDisable(true);
        }else{
            this.setText(String.valueOf(dato.getValor()));
            if(dato.isSeleccionada()){
                seleccionarVista();
            }else{
                estilizar();
            }
        }
    }

    public void vaciarVista(){
        this.setStyle("-fx-background-color: #f0f0f0;" +
                " -fx-border-color: transparent;" +
                " -fx-background-radius: 5;");
    }

    public void seleccionarVista(){
        this.setStyle("-fx-background-color: #add8e6;" +
                " -fx-text-fill: #000000;" +
                " -fx-border-color: #0078d7;" +
                " -fx-border-radius: 5;" +
                " -fx-background-radius: 5;" +
                " -fx-font-size: 22px; " +
                "-fx-font-weight: bold;" +
                " -fx-cursor: hand;");
    }

    public void estilizar(){
        this.setStyle("-fx-background-color: #ffffff; " +
                "-fx-text-fill: #333333; " +
                "-fx-border-color: #cccccc; " +
                "-fx-border-radius: 5; " +
                "-fx-background-radius: 5; " +
                "-fx-font-size: 22px; " +
                "-fx-font-weight: bold; " +
                "-fx-cursor: hand;");
    }

    public Nodo getNodoLogico() {
        return nodoLogico;
    }
}

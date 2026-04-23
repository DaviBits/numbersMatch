package Vista;


import Logica.Tablero;
import Logica.Nodo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import java.util.ArrayList;

public class TableroUI extends GridPane {

    private Tablero tableroLogico;
    private ArrayList<CasillaUI> casillasUI;

    public TableroUI(Tablero tableroLogico) {
        this.tableroLogico = tableroLogico;
        this.casillasUI = new ArrayList<>();

        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20));
        this.setHgap(5);
        this.setVgap(5);

        this.setStyle("-fx-background-color: #2c3e50;");

        renderizarTablero();
    }


    public void renderizarTablero() {
        this.getChildren().clear();
        casillasUI.clear();

        Nodo filaActual = tableroLogico.getFilas().getInicio();
        int f = 0;

        while (filaActual != null) {
            Nodo colActual = filaActual;
            for (int c = 0; c < tableroLogico.getAncho(); c++) {
                if (colActual == null) break;

                CasillaUI casillaVisual = new CasillaUI(colActual);

                this.add(casillaVisual, c, f);
                casillasUI.add(casillaVisual);

                colActual = colActual.getRight();
            }

            filaActual = filaActual.getDown();
            f++;
        }
    }

    public void actualizar() {
        renderizarTablero();
    }

    public ArrayList<CasillaUI> getCasillasUI() {
        return casillasUI;
    }
}
package Vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class PanelSuperior extends HBox {
    private Label concordancias;

    public PanelSuperior () {
        concordancias = new Label("🏆: 0");

        concordancias.setStyle("-fx-text-fill: white; -fx-font-size: 24px; -fx-font-weight: bold;");

        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(15));
        this.setStyle("-fx-background-color: #2c3e50;");
        this.getChildren().addAll(concordancias);
    }

    public void setPuntos(int puntos) {
        concordancias.setText("🏆: " + puntos);
    }
}
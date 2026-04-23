package Logica;

public class ListaSimple {
    private Nodo inicio;

    public ListaSimple() {
        this.inicio = null;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public Nodo obtenerInicioFila(int fila) {
        Nodo temp = inicio;
        for (int i = 0; i < fila && temp != null; i++) {
            temp = temp.getDown();
        }
        return temp;
    }
}
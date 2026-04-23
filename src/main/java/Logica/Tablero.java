package Logica;

public class Tablero {
    private ListaSimple filas;
    private int ancho;
    private int alto;
    public Tablero(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.filas = new ListaSimple();
        generarTablero();
    }

    private void generarTablero() {
        Nodo[][] matrizAux = new Nodo[alto][ancho];
        //crear nodos con valores random
        for (int f = 0; f < alto; f++) {
            for (int c = 0; c < ancho; c++) {
                int numAleatorio = (int) (Math.random() * 9) + 1;
                matrizAux[f][c] = new Nodo(new Casilla(numAleatorio));
            }
        }

        //hacer conexiones
        for (int f = 0; f < alto; f++) {
            for (int c = 0; c < ancho; c++) {
                Nodo actual = matrizAux[f][c];
                //direcciones normales
                if (f > 0) actual.setUp(matrizAux[f - 1][c]); //arriba
                if (f < alto - 1) actual.setDown(matrizAux[f + 1][c]); // abajo
                if (c > 0) actual.setLeft(matrizAux[f][c - 1]); // izquierda
                if (c < ancho - 1) actual.setRight(matrizAux[f][c + 1]); //derecha
                //direcciones en diagonal
                if (f > 0 && c > 0) actual.setUpLeft(matrizAux[f - 1][c - 1]);
                if (f > 0 && c < ancho - 1) actual.setUpRight(matrizAux[f - 1][c + 1]);
                if (f < alto - 1 && c > 0) actual.setDownLeft(matrizAux[f + 1][c - 1]);
                if (f < alto - 1 && c < ancho - 1) actual.setDownRight(matrizAux[f + 1][c + 1]);
                //conexion en caso de que sean como serpiente
                if (c == ancho - 1 && f < alto - 1) {
                    Nodo siguienteFila = matrizAux[f + 1][0];
                    actual.setRight(siguienteFila);
                    siguienteFila.setLeft(actual);
                    if (ancho > 1) {
                        actual.setDownRight(matrizAux[f + 1][1]);
                        matrizAux[f + 1][1].setUpLeft(actual);
                    }
                }
            }
        }

        filas.setInicio(matrizAux[0][0]);
    }

    public void mostrarTablero() {
        Nodo filaActual = filas.getInicio();
        while (filaActual != null) {
            Nodo colActual = filaActual;

            for(int i = 0; i < ancho && colActual != null; i++) {
                System.out.print(colActual.getDato() + "\t");
                colActual = colActual.getRight();
            }
            System.out.println();
            filaActual = filaActual.getDown();
        }
    }

    public void agregarFila() {
        Nodo[] nuevaFila = new Nodo[ancho];

        for (int c = 0; c < ancho; c++) {
            int numAleatorio = (int) (Math.random() * 9) + 1;
            nuevaFila[c] = new Nodo(new Casilla(numAleatorio));
        }

        Nodo inicioUltimaFila = filas.obtenerInicioFila(this.alto - 1);

        Nodo tempAnterior = inicioUltimaFila;
        for (int c = 0; c < ancho; c++) {
            Nodo actual = nuevaFila[c];

            actual.setUp(tempAnterior);
            tempAnterior.setDown(actual);

            if (c > 0) {
                actual.setLeft(nuevaFila[c - 1]);
                nuevaFila[c - 1].setRight(actual);
            }

            if (tempAnterior.getLeft() != null) {
                actual.setUpLeft(tempAnterior.getLeft());
                tempAnterior.getLeft().setDownRight(actual);
            }

            if (tempAnterior.getRight() != null) {
                actual.setUpRight(tempAnterior.getRight());
                tempAnterior.getRight().setDownLeft(actual);
            }

            if (c < ancho - 1) {
                tempAnterior = tempAnterior.getRight();
            }
        }
        Nodo ultimoViejo = inicioUltimaFila;
        while(ultimoViejo.getRight() != null && ultimoViejo.getRight() != nuevaFila[0]) {
            ultimoViejo = ultimoViejo.getRight();
        }

        ultimoViejo.setRight(nuevaFila[0]);
        nuevaFila[0].setLeft(ultimoViejo);

        this.alto++;
    }

    public static void main(String []args){
        Tablero t = new Tablero(10, 4);
        System.out.println("tablero Inicial:");
        t.mostrarTablero();

        System.out.println("\n+++++++++++++++++++++.");
        t.agregarFila();
        t.mostrarTablero();

        System.out.println("\nA++++++++++++++++++");
        t.agregarFila();
        t.mostrarTablero();
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public ListaSimple getFilas() {
        return filas;
    }
}
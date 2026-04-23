package Logica;

public class Casilla implements Comparable<Casilla> {
    private int valor;
    private boolean esVacia;
    private boolean seleccionada;
    public Casilla(int valor) {
        this.valor = valor;
        this.esVacia = false;
        this.seleccionada = false;
    }

    public int getValor() { return valor; }
    public void setValor(int valor) { this.valor = valor; }
    public boolean isEsVacia() { return esVacia; }
    public void setEsVacia(boolean esVacia) { this.esVacia = esVacia; }
    public boolean isSeleccionada() {return seleccionada;}
    public void setSeleccionada(boolean seleccionada) {this.seleccionada = seleccionada;}

    public boolean esIgualA(Casilla otra) {
        return this.compareTo(otra) == 0;
    }

    public boolean sumaDiez(Casilla otra) {
        return (this.valor + otra.getValor()) == 10;
    }

    public boolean comparar(Casilla otra){
        return sumaDiez(otra)||esIgualA(otra);
    }

    @Override
    public int compareTo(Casilla otra) {
        // iguales = 0
        return Integer.compare(this.valor, otra.getValor());
    }

    public String toString(){return ""+valor;}
}
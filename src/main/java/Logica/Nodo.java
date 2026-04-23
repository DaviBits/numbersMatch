package Logica;

import java.util.ArrayList;


/**
 * Clase Nodo
 * Models a Nodo in an 8 way linked list
 * @author Cecilia M. Curlango Rosas
 * @version 01 2026
 */
public class Nodo {
    private Casilla dato; // INFO part
    private Nodo up, down,
            left, right,
            downLeft, downRight,
            upLeft, upRight;


    public Nodo(Casilla casilla) {
        this.dato = casilla;
        up = null;
        down = null;
        left = null;
        right = null;
        downLeft = null;
        downRight = null;
        upLeft = null;
        upRight = null;
    }


    /**
     * Updates all links
     * to neighboring Nodos so that
     * nothing points to it anymore.
     */
    public void delete() {
        if (up != null) up.setDown(null);
        if (down != null) down.setUp(null);
        if (left != null) left.setRight(null);
        if (right != null) right.setLeft(null);
        if (upLeft != null) upLeft.setDownRight(null);
        if (upRight != null) upRight.setDownLeft(null);
        if (downLeft != null) downLeft.setUpRight(null);
        if (downRight != null) downRight.setUpLeft(null);
        up = down = left = right = upLeft = upRight = downLeft = downRight = null;
    }
    /**
     * Returns whether input Nodo is next to
     * Nodo.
     * @return true if Nodos are next to each other
     */
    public boolean isNeighbor(Nodo input) {
        if (input == null) return false;

        return input == up || input == down ||
                input == left || input == right ||
                input == upLeft || input == upRight ||
                input == downLeft || input == downRight;
    }
    /**
     * Returns whether input Nodo contains same value or
     * adds up to 10.
     * @return true if Nodos contain the same value or add up to 10
     */
    public boolean isMatchValue(Nodo input) {
        if (input == null || input.getDato() == null) return false;

        Casilla c1 = this.dato;
        Casilla c2 = input.getDato();

        // Usamos la lógica de la clase Casilla
        return c1.esIgualA(c2) || c1.sumaDiez(c2);
    }


    public Nodo getDown() {
        return down;
    }


    public void setDown(Nodo down) {
        this.down = down;
    }


    public Nodo getLeft() {
        return left;
    }


    public void setLeft(Nodo left) {
        this.left = left;
    }


    public Nodo getRight() {
        return right;
    }


    public void setRight(Nodo right) {
        this.right = right;
    }


    public Nodo getDownLeft() {
        return downLeft;
    }


    public void setDownLeft(Nodo downLeft) {
        this.downLeft = downLeft;
    }


    public Nodo getDownRight() {
        return downRight;
    }


    public void setDownRight(Nodo downRight) {
        this.downRight = downRight;
    }


    public Nodo getUpLeft() {
        return upLeft;
    }


    public void setUpLeft(Nodo upLeft) {
        this.upLeft = upLeft;
    }


    public Nodo getUpRight() {
        return upRight;
    }


    public void setUpRight(Nodo upRight) {
        this.upRight = upRight;
    }


    public Nodo getUp() {
        return up;
    }


    public void setUp(Nodo up) {
        this.up = up;
    }


    public Casilla getDato() {
        return dato;
    }
    public void setDato(Casilla dato) {
        this.dato = dato;
    }


    @Override
    public String toString() {
        return "|"+dato+"|";
    }


    /**
     * Returns an ArrayList containing all non-empty neighboring Nodos
     * @return ArrayList<Nodo> with neighboring non-empty Nodos
     */


    public ArrayList<Nodo> getNeighbors() {
        ArrayList<Nodo> neighbors = new ArrayList<>();

        if (up != null) neighbors.add(up);
        if (down != null) neighbors.add(down);
        if (left != null) neighbors.add(left);
        if (right != null) neighbors.add(right);
        if (upLeft != null) neighbors.add(upLeft);
        if (upRight != null) neighbors.add(upRight);
        if (downLeft != null) neighbors.add(downLeft);
        if (downRight != null) neighbors.add(downRight);

        return neighbors;
    }
}

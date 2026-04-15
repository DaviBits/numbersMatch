package Logica;

import java.util.ArrayList;


/**
 * Clase Nodo
 * Models a Nodo in an 8 way linked list
 * @author Cecilia M. Curlango Rosas
 * @version 01 2026
 */
public class Nodo {
    private int number; // INFO part
    private Nodo up, down,
            left, right,
            downLeft, downRight,
            upLeft, upRight;


    public Nodo(int number) {
        this.number = number;
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

    }
    /**
     * Returns whether input Nodo is next to
     * Nodo.
     * @return true if Nodos are next to each other
     */
    public boolean isNeighbor(Nodo input) {
        return true; //PLACEHOLDER
    }
    /**
     * Returns whether input Nodo contains same value or
     * adds up to 10.
     * @return true if Nodos contain the same value or add up to 10
     */
    public boolean isMatchValue(Nodo input) {
        return true; //PLACEHOLDER
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


    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return number + "";
    }


    /**
     * Returns an ArrayList containing all non-empty neighboring Nodos
     * @return ArrayList<Nodo> with neighboring non-empty Nodos
     */


    public ArrayList<Nodo> getNeighbors() {
        return  null;//PLACEHOLDER
    }
}

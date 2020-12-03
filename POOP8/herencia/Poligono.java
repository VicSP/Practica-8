/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * Clase base Poligono
 * @author Victor
 */
public class Poligono {
    /**
     * Constructor vacio Poligono
     */
    public Poligono() {
    }
    /**
     * Método de sobre escritura area 
     * @return Es de tipo flotante
     */
    public float area(){
        return 0f;
    }
    /**
     * Método de sobre escritura perimetro 
     * @return Es de tipo flotante
     */
    public float perimetro(){
        return 0;
    }
    /**
     * Método de sobre escritura toString
     * @return Es de tipo entero
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 * Clase base abstracta Poligono
 * @author Victor
 */
public abstract class Poligono {
    public abstract float area();
    public abstract float perimetro();
    /**
     * Método de sobre escritura toString 
     * @return Es de tipo cadena
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}

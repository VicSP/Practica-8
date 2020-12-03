/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * Subclase que extiende de InstrumentoViento
 * @author Victor
 */
public class Flauta extends InstrumentoViento {
    /**
     * Constructor vacio Flauta
     */
    public Flauta() {
    }
    /**
     * Método que especifica el tipo de instrumento
     * @return Es de tipo cadena
     */
    
    public String tipoIntrumento(){
        return "Flauta";
    }
    /**
     * Método de sobre escritura toString
     * @return Es de tipo cadena
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
}

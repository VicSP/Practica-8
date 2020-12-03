/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * Subclase que extiende de Object e implementa la interfaz InstrumentoMusical
 * @author Victor
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {
    /**
     * Constructor vacio InstrumentoViento
     */
    public InstrumentoViento() {
    }
    
    /**
     * Método de sobre escritura tocar
     */
    @Override 
    public void tocar(){
        System.out.println("Estoy tocando un instrumento de viento");
    }
    /**
     * Método de sobre escritura afinar
     */
    @Override
    public void afinar(){
        System.out.println("Estoy afinando un instrumento de viento");
    }
    /**
     * Método de sobre escritura tipoInstrumento
     * @return Es de tipo cadena
     */
    @Override
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }
    /**
     * Método de sobre escritura toString
     * @return Es de tipo cadena
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
}

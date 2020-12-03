/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * Interface InstrumentoMusical
 * @author Victor
 */
public interface InstrumentoMusical {
    //Por defecto todos los métodos son public y abstract
    /**
     * Método público y abstracto tocar 
     */
    void tocar();
    /**
     * Método público y abstracto afinar
     */
    void afinar();
    /**
     * Método público y abstracto tipoInstrumento
     * @return Es de tipo cadena
     */
    String tipoInstrumento();
}

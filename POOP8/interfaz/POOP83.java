/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * Clase principal del paquete interfaz
 * @author Victor
 */
public class POOP83 {
    public static void main(String[] args) {
        System.out.println("4************************");
        //no se puede instanciar esto
        //InstrumentoMusical instrumento= new InstrumentoMusical(); 
        InstrumentoMusical instrumento;
        
        instrumento= new Flauta();
        instrumento.tocar();
        instrumento.afinar();
        System.out.println(instrumento.tipoInstrumento());
        System.out.println(instrumento);
    }
}

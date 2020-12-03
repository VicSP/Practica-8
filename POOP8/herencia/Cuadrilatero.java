/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * Subclase principal del paquete herencia
 * @author Victor
 */
public class Cuadrilatero extends Poligono{
    private int alpha, beta;
    private float a, b, base, altura;
    
    /**
     * Constructor vacio Cuadrilatero 
     */
    public Cuadrilatero() {
    }
    /**
     * Constructor Cuadrilatero que recibe 6 parámetros 
     * @param alpha Es de tipo entero
     * @param beta Es de tipo entero
     * @param a Es de tipo flotante
     * @param b Es de tipo flotante
     * @param base Es de tipo flotante
     * @param altura Es de tipo flotante
     */
    public Cuadrilatero(int alpha, int beta, float a, float b, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.a = a; 
        this.b = b;
        this.base = base;
        this.altura = altura;
    }
    /**
     * Método que obtiene el valor del parámetro alpha
     * @return Es de tipo entero
     */

    public int getAlpha() {
        return alpha; 
    }
    /**
     * Método que establece el valor del parámetro alpha
     * @param alpha Es de tipo entero
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    /**
     * Método que obtiene el valor del parámetro beta
     * @return Es de tipo entero
     */
    public int getBeta() {
        return beta;
    }
    /**
     * Método que establece el valor del parámetro beta
     * @param beta Es de tipo entero
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * Método que obtiene el valor del parámetro a
     * @return Es de tipo flotante
     */
    public float getA() {
        return a;
    }
    /**
     * Método que establece el valor del parámetro a
     * @param a Es de tipo flotante
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * Método que obtiene el valor del parámetro b
     * @return Es de tipo flotante
     */
    public float getB() {
        return b;
    }
    /**
     * Método que establece el valor del parámetro b
     * @param b Es de tipo flotante
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * Método que obtiene el valor del parámetro base
     * @return Es de tipo flotante
     */
    public float getBase() {
        return base;
    }
    /**
     * Método que establece el valor del parámetro base
     * @param base Es de tipo flotante
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * Método que obtiene el valor del parámetro altura
     * @return Es de tipo flotante
     */
    public float getAltura() {
        return altura;
    }
    /**
     * Método que establece el valor del parámetro altura
     * @param altura Es de tipo flotante
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Método de sobre escritura toString
     * @return Es de tipo cadena
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    /**
     * Método que calcula el valor del area del cuadrilatero
     * @return Es de tipo florante
     */
    @Override
    public float area(){
        return base*altura;
    }
    /**
     * Método que calcula el valor del perimetro del cuadrilatero
     * @return Es de tipo flotante
     */
    @Override //indica al compilador que es una sobre escritura 
    public float perimetro(){
        return (2*a)+(2*b);
    }
}

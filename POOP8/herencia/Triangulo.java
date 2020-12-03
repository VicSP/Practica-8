/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * Subclase Triangulo que extiende de Poligono
 * @author Victor
 */
public class Triangulo extends Poligono {
    private float a, b, c, base, altura;
    private int alpha, beta, gamma;
    /**
     * Constructor vacio Triangulo
     */
    public Triangulo() {
    }
    /**
     * Constructor Triangulo que recibe 8 parámetros 
     * @param a Es de tipo flotante
     * @param b Es de tipo flotante
     * @param c Es de tipo flotante
     * @param base Es de tipo entero
     * @param altura Es de tipo entero
     * @param alpha Es de tipo entero
     * @param beta Es de tipo entero
     * @param gamma Es de tipo entero
     */
    public Triangulo(float a, float b, float c, float base, float altura, int alpha, int beta, int gamma) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
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
     * @return  Es de tipo flotante
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
     * Método que obtiene el valor del parámetro c
     * @return Es de tipo flotante
     */
    public float getC() {
        return c;
    }
    /**
     * Método que establece el valor del parámetro c
     * @param c Es de tipo flotante
     */
    public void setC(float c) {
        this.c = c;
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
     * Método que obtiene el valor del parámetro gamma
     * @return Es de tipo entero
     */
    public int getGamma() {
        return gamma;
    }
    /**
     * Método que establece el valor del parámetro gamma
     * @param gamma Es de tipo entero 
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }
    /**
     * Método de sobre escritura toString
     * @return Es de tipo cadena
     */
    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + ", alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + '}';
    }
}

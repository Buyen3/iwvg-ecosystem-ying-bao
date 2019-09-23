package es.upm.miw.iwvg.ecosystem.practica;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el denominador
 * <p>
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el denominador
 * <p>
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de la primera por denominador de la segunda) es igual al
 * producto de medios (denominador de la primera por el numerador de la segunda)
 * <p>
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto sucede cuando el numerador y el denominador son primos entre
 * sí
 * <p>
 * Reducir varias fracciones a común denominador consiste en convertirlas en otras equivalentes que tengan el mismo denominador
 * <p>
 * Comparar fracciones
 * <p>
 * Suma fracciones: En primer lugar se reducen los denominadores a común denominador, y se suman o se restan los numeradores de las
 * fracciones equivalentes obtenidas
 * <p>
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que tiene: Por numerador el producto de los numeradores. Por
 * denominador el producto de los denominadores.
 * <p>
 * La división de dos fracciones es otra fracción que tiene: Por numerador el producto de los extremos. Por denominador el producto de los
 * medios. Invertir fraccion
 *
 * @author jbernal
 */
public class Fraction {

    private int numerator;

    private int denominator;

    private  boolean isPropia;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.isPropia = numerator < denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public boolean isPropia() { return isPropia; }

    public boolean isImpropia() { return  !isPropia; }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public boolean isEquivalent(int numerator, int denominator){
        return this.numerator*denominator == this.denominator*numerator;
    }
    public Fraction add(Fraction fraction){
        int lcm = get_lcm(fraction.getDenominator(),this.getDenominator());
        return new Fraction(this.getNumerator()*lcm/this.getDenominator()+fraction.getNumerator()*lcm/fraction.getDenominator(),lcm);
    }
    public Fraction sub(Fraction fraction){
        int lcm = get_lcm(fraction.getDenominator(),this.getDenominator());
        return new Fraction(this.getNumerator()*lcm/this.getDenominator()-fraction.getNumerator()*lcm/fraction.getDenominator(),lcm);
    }
    public Fraction mul(Fraction fraction){
        return new Fraction(this.getNumerator()*fraction.getNumerator(),this.getDenominator()*fraction.getDenominator());
    }
    public Fraction div(Fraction fraction){
        return  new Fraction(this.getNumerator()*fraction.getDenominator(),this.getDenominator()*fraction.getNumerator());
    }
    public int get_gcd(int a,int b){
        int max,min;
        max = (a > b ) ? a : b;
        min = (a < b ) ? a : b;
        if ( max % min != 0 ) {
            return get_gcd(min,max%min);
        }else{
            return min;
        }
    }
    public int get_lcm(int a,int b){
        return a * b / get_gcd(a,b);
    }

}
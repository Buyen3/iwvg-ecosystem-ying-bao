package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(2, 3);
    }

    @Test
    void testFractionIntInt(){
        assertEquals(2, fraction.getNumerator());
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    void testFraction(){
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testDecimal(){
        assertEquals(0.6666, fraction.decimal(), 10e-5);
    }

    @Test
    void testGetNumerator(){
        assertEquals(2, fraction.getNumerator());
    }

    @Test
    void testGetDenominator(){
        assertEquals(3, fraction.getDenominator());
    }
    @Test
    void  testIsPropia(){
        assertEquals(true,fraction.isPropia());
        fraction = new Fraction();
        assertEquals(false,fraction.isPropia());
    }

    @Test
    void  testIsImpropia(){
        assertEquals(false,fraction.isImpropia());
        fraction = new Fraction();
        assertEquals(true,fraction.isImpropia());
    }

    @Test
    void testIsEquivalent(){
        assertEquals(true,fraction.isEquivalent(4,6));
        assertEquals(false,fraction.isEquivalent(5,6));
    }
    @Test
    void  testAdd(){
        Fraction f = fraction.add(new Fraction(1,3));
        assertEquals(3,f.getNumerator());
        assertEquals(3,f.getDenominator());
    }

    @Test
    void  testSub(){
        Fraction f = fraction.sub(new Fraction(1,3));
        assertEquals(1,f.getNumerator());
        assertEquals(3,f.getDenominator());
    }

    @Test
    void  testMul(){
        Fraction f = fraction.mul(new Fraction(2,3));
        assertEquals(4,f.getNumerator());
        assertEquals(9,f.getDenominator());
    }

    @Test
    void  testDiv(){
        Fraction f = fraction.div(new Fraction(1,3));
        assertEquals(6,f.getNumerator());
        assertEquals(3,f.getDenominator());
    }
}
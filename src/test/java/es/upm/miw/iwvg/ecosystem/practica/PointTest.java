package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    private Point point;

    @BeforeEach
    void before() {
        point = new Point(1, 2,1);
    }

    @Test
    void testPointIntInt() {
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
        assertEquals(1, point.getZ());
    }

    @Test
    void testPointInt() {
        point = new Point(2);
        assertEquals(2, point.getX());
        assertEquals(2, point.getY());
        assertEquals(2, point.getZ());
    }

    @Test
    void testPoint() {
        point = new Point();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
        assertEquals(0, point.getY());
    }

    @Test
    void testModule() {
        assertEquals(2.4495, point.module(), 10e-5);
    }

    @Test
    void testPhaseXY() {
        assertEquals(1.10714872, point.phaseXY(), 10e-5);
    }
    @Test
    void testPhaseXZ() {
        assertEquals(0.78539816, point.phaseXZ(), 10e-5);
    }
    @Test
    void testPhaseYZ() {
        assertEquals(0.46364761, point.phaseYZ(), 10e-5);
    }

    @Test
    void testTranslateOrigin() {
        this.point.translateOrigin(new Point(1, 1,1));
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
        assertEquals(2, point.getY());
    }

}
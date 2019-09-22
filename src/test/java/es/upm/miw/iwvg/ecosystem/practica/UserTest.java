package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(24, "Ying", "Bao");
    }

    @Test
    void testFullName() {
        assertEquals("Ying Bao", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("Y.", user.initials());
    }

    @Test
    void testGetNumber(){
        assertEquals(24,user.getNumber());
    }

    @Test
    void testGetName(){
        assertEquals("Ying",user.getName());
    }

    @Test
    void testGetFamilyName(){
        assertEquals("Bao",user.getFamilyName());
    }

    @Test
    void testNameUpperCase() { assertEquals("YING", user.nameUpperCase());}
}
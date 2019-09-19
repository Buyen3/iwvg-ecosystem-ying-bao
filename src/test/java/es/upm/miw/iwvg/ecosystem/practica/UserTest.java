package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(24, "ying", "bao");
    }

    @Test
    void testFullName() {
        assertEquals("ying bao", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("y.", user.initials());
    }

    @Test
    void testGetNumber(){
        assertEquals(24,user.getNumber());
    }

    @Test
    void testGetName(){
        assertEquals("ying",user.getName());
    }

    @Test
    void testGetFamilyName(){
        assertEquals("bao",user.getFamilyName());
    }
}
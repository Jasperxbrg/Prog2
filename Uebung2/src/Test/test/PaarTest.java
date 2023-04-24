package Test.test;

import Main.*;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

class PaarTest {

    @Test
    public void SetEandGetETest(){
        Paar<Integer, String> p = new Paar<Integer, String>(1, "1");
        p.setE(2);
        assertEquals(2, p.getE());
    }

    @Test
    public void SetZandGetZTest(){
        Paar<Integer, String> p = new Paar<Integer, String>(1, "1");
        p.setZ("2");
        assertEquals("2", p.getZ());
    }
    @Test
    public void SetBothTest(){
        Paar<Integer, String> p = new Paar<Integer, String>(1, "1");
        p.setE(2);
        p.setZ("2");
        assertEquals(2, p.getE());
        assertEquals("2", p.getZ());
    }
    @Test
    public void EqualsTest(){
        Paar<Integer, String> p1 = new Paar<Integer, String>(1, "1");
        Paar<Integer, String> p2 = new Paar<Integer, String>(1, "1");
        assertEquals(true, p1.equals(p2));
    }

    @Test
    public void ToStringTest(){
        Paar<Integer, String> p = new Paar<Integer, String>(1, "1");
        assertEquals("(1,1)", p.toString());
    }

}
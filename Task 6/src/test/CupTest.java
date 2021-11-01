package test;

import com.company.Cup;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CupTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fillCup1(){
        Cup cup = new Cup(false);
        cup.fillCup();
        assertTrue(cup.getCupFilled());
    }

    @Test
    public void fillCup2(){
        Cup cup = new Cup(true);
        cup.fillCup();
        assertTrue(cup.getCupFilled());
    }

    @Test
    public void drink1(){
        Cup cup = new Cup(true);
        cup.drink();
        assertFalse(cup.getCupFilled());
    }

    @Test
    public void drink2(){
        Cup cup = new Cup(false);
        cup.drink();
        assertFalse(cup.getCupFilled());
    }

}
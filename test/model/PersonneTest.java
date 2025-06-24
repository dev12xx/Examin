package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class PersonneTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testCalculerRest_AgeBelowRetirement() {
        System.out.println("calculerRest - Age below retirement");
        int age = 30;
        Personne instance = new Personne();
        String expResult = "Il vous reste 35 ans avant la retraite.";
        String result = instance.calculerRest(age);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculerRest method, of class Personne.
     */
    @Test
    public void testCalculerRest() {
        System.out.println("calculerRest");
        int age = 0;
        Personne instance = new Personne();
        String expResult = "";
        String result = instance.calculerRest(age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
 
}
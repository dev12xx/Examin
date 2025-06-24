package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonneTest {
    
    @Test
    public void testCalculerRest_AgeBelowRetirement() {
        System.out.println("calculerRest - Age below retirement");
        int age = 30;
        Personne instance = new Personne();
        String expResult = "Il vous reste 35 ans avant la retraite.";
        String result = instance.calculerRest(age);
        assertEquals(expResult, result);
    }
    
 
}
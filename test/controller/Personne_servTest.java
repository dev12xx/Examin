
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Personne_servTest {
    
    public Personne_servTest() {
    }
    
 
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        Personne_serv instance = new Personne_serv();
        instance.doPost(request, response);
       
        fail("The test case is a prototype.");
    }
    
}

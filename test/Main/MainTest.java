/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class MainTest {
    
    public MainTest() {
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testSuma() {
        Main p = new Main();
        assertEquals(2+3, p.suma(2,3));
    }
    
}

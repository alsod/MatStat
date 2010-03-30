/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package matstat;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alsod
 */
public class MatSetTest {

    public MatSetTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of komplSatsen method, of class MatSet.
     */
    @Test
    public void testKomplSatsen() {
        System.out.println("komplSatsen");
        double pA = 0.9;
        Prob instance = new Prob();
        double expResult = 0.1;
        double result = instance.komplSatsen(pA);
        assertEquals(expResult, result, 0.0000001);

    }

    /**
     * Test of addSatsen method, of class MatSet.
     */
    @Test
    public void testAddSatsen() {
        System.out.println("addSatsen");
        double pA = 0.2;
        double pB = 0.1;
        Prob instance = new Prob();
        double expResult = 0.3;
        double result = instance.addSatsen(pA, pB);
        assertEquals(expResult, result, 0.0000001);

    }

    /**
     * Test of addSatsen method, of class MatSet.
     */
    @Test
    public void testAddSatsen_3args() {
        System.out.println("addSatsen");
        double pA = 0.3;
        double pB = 0.2;
        double pApB = 0.1;
        Prob instance = new Prob();
        double expResult = 0.4;
        double result = instance.addSatsen(pA, pB, pApB);
        assertEquals(expResult, result, 0.0000001);

    }

}
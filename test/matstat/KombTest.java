/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package matstat;

import java.math.BigInteger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alsod
 */
public class KombTest {

    public KombTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of permA method, of class Komb.
     */
    @Test
    public void testPermA() {
        System.out.println("permA");
        BigInteger n = new BigInteger("3");
        Komb instance = new Komb();
        BigInteger expResult = new BigInteger("6");
        BigInteger result = instance.permA(n);
        assertEquals(expResult, result);

    }

    /**
     * Test of permB method, of class Komb.
     */
    @Test
    public void testPermB() {
        System.out.println("permB");
        BigInteger n = new BigInteger("5");
        BigInteger gruppA = new BigInteger("2");
        BigInteger gruppB = new BigInteger("3");
        Komb instance = new Komb();
        BigInteger expResult = new BigInteger("10");
        BigInteger result = instance.permB(n, gruppA, gruppB);
        assertEquals(expResult, result);

    }

    /**
     * Test of kombA method, of class Komb.
     */
    @Test
    public void testKombA() {
        System.out.println("kombA");
        BigInteger n = new BigInteger("8");
        BigInteger k = new BigInteger("5");
        Komb instance = new Komb();
        BigInteger expResult = new BigInteger("56");
        BigInteger result = instance.kombA(n, k);
        assertEquals(expResult, result);

    }

    /**
     * Test of kombB method, of class Komb.
     */
    @Test
    public void testKombB() {
        System.out.println("kombB");
        BigInteger n = new BigInteger("4");
        BigInteger k = new BigInteger("2");
        Komb instance = new Komb();
        BigInteger expResult = new BigInteger("10");
        BigInteger result = instance.kombB(n, k);
        assertEquals(expResult, result);

    }

    /**
     * Test of varA method, of class Komb.
     */
    @Test
    public void testVarA() {
        System.out.println("varA");
        BigInteger n = new BigInteger("3");
        BigInteger k = new BigInteger("2");
        Komb instance = new Komb();
        BigInteger expResult = new BigInteger("6");
        BigInteger result = instance.varA(n, k);
        assertEquals(expResult, result);

    }

    /**
     * Test of varB method, of class Komb.
     */
    @Test
    public void testVarB() {
        System.out.println("varB");
        BigInteger n = new BigInteger("3");
        BigInteger k = new BigInteger("2");
        Komb instance = new Komb();
        BigInteger expResult = new BigInteger("9");
        BigInteger result = instance.varB(n, k);
        assertEquals(expResult, result);

    }

    /**
     * Test of fakultet method, of class Komb.
     */
    @Test
    public void testFakultet() {
        System.out.println("fakultet");
        BigInteger n = new BigInteger("60");
        Komb instance = new Komb();
        BigInteger expResult = new BigInteger("8320987112741390144276341183223364380754172606361245952449277696409600000000000000");
        BigInteger result = instance.fakultet(n);
        assertEquals(expResult, result);

    }

    /**
     * Test of over method, of class Komb.
     */
    @Test
    public void testOver() {
        System.out.println("over");
        BigInteger n = new BigInteger("30");
        BigInteger k = new BigInteger("20");
        Komb instance = new Komb();
        BigInteger expResult = new BigInteger("30045015");
        BigInteger result = instance.over(n, k);
        assertEquals(expResult, result);

    }

}
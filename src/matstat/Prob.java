/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matstat;

import java.util.ArrayList;

/**
 *
 * @author alsod
 */
public class Prob {

    public Prob() {
    }

   

    /**
     * Komplementsatsen
     * @param pA sannolikhet för A
     * @return A*
     */
    public double komplSatsen(double pA) {
        double result = 1 - pA;
        return result;
    }

    /**
     * Additionssatsen för två oförenliga händelser A och B
     * @param pA sannolikhet för A
     * @param pB sannolikhet för B
     * @return p(A union B)
     */
    public double addSatsen(double pA, double pB) {
        double result = pA + pB;
        return result;
    }

    /**
     * Additionssatsen för två godtyckliga händelser A och B
     * @param pA sannolikhet för A
     * @param pB sannolikhet för B
     * @param pApB sannolikhet för A snitt B
     * @return p(A union B)
     */
    public double addSatsen(double pA, double pB, double pApB) {
        double result = pA + pB - pApB;
        return result;
    }

    /**
     * Den klassiska sannolikhetsdefinitionen
     * @param g gynnsamma fall
     * @param m möjliga fall
     * @return kvoten (gynnsamma fall)/(möjliga fall)
     */
    public double probKlassisk(int g, int m) {
        double result = g / m;
        return result;
    }

    
}

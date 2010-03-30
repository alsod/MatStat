/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matstat;

import java.math.BigInteger;

/**
 *
 * @author alsod
 */
public class Komb {

    /**
     * permutationer utan upprepning. alla element är olika, dvs antal sätt dragning utan
     * återläggning av k element ur n med hänsyn till ordning kan ske (n-fakultet)
     *
     * ex.
     *     7 elever kan ställas upp i rad på:
     *     P8 = 7! = 1·2·3·4·5·6·7 = 5040 olika sätt.
     *
     * @param n Totalt antal element
     * @return Antal sätt dragning kan ske (n-fakultet)
     */
    public BigInteger permA(BigInteger n) {
        return fakultet(n);
    }

    /**
     * Permutationer med upprepning. Alla n element är inte olika.
     *
     * ex.
     *     Ex.   Elementen A, A, A, B och B permuteras.
    Antalet permutationer är: 5!/2!3!
     *         AAABB AABAB ABAAB BAAAB AABBA ABABA ABBAA ABBAA BABAA BBAAA
     *
     * @param n totalt antal element
     * @param gruppA antal element i grupp a
     * @param gruppB antal element i grupp b
     * @return Antal sätt dragning kan ske (n!/gruppA!*gruppB!)
     */
    public BigInteger permB(BigInteger n, BigInteger gruppA, BigInteger gruppB) {
        BigInteger nFak = fakultet(n);
        BigInteger gruppAFak = fakultet(gruppA);
        BigInteger gruppBFak = fakultet(gruppB);

        BigInteger result = nFak.divide(gruppAFak.multiply(gruppBFak));
        return result;
    }

    /**
     * Kombinationer utan upprepning. Varje element får förekomma endast en gång, Antal delmängder,
     * dvs antal sätt dragning utan återläggning och utan hänsyn till ordning kan ske (n över k)
     *
     * ex.
     *     Antal kombinationer med 5 element till en mängd med 8 element: (8 över 5) = 56
     *
     * @param n Totalt antal element
     * @param k Antal element som ska dras
     * @return Antal sätt dragning kan ske på (n över k)
     */
    public BigInteger kombA(BigInteger n, BigInteger k) {
        return over(n, k);
    }

    /**
     * Kombinationer med upprepning. Ett element får förekomma flera gånger i kombinationen.
     *
     * ex.
     *     Två av de fyra elementen a, b, c, och d kombineras.
     *     Antalet kombinationer är: (4+2-1 över 2) = 10
     *     Kombinationerna är: aa ab ac ad bb bc bd cc cd dd
     *
     * @param n Totalt antal element
     * @param k Antal element i kombination
     * @return Antal sätt dragning kan ske på (n+k-1 över k)
     */
    public BigInteger kombB(BigInteger n, BigInteger k) {
        return over(n.add(k.add(BigInteger.ONE.negate())), k);
    }

    /**
     * Antalet permutationer av p olika objekt valda bland n givna, Variation utan upprepning, ett element får endast användas en gång
     *
     * ex.
     *     Två valda av de tre elementen 1,2 och 3 permuteras.
     *     Antalet variationer är: (3! över (3-2)!) = 6
     *     Variationerna är: 12  13  21  23  31  32
     *
     * @param n Totalt antal element
     * @param k Antal element som väljs
     * @return Antal sätt dragning kan ske (n! över (n-k)!)
     */
    public BigInteger varA(BigInteger n, BigInteger k) {
        BigInteger nFak = fakultet(n);
        BigInteger nminuskFak = fakultet(n.add(k.negate()));
        BigInteger result = over(nFak, nminuskFak);
        return result;
    }

    /**
     * Variation med upprepning. Samma element får användas flera gånger.
     *
     * ex.
     *     Två av de tre bokstäverna A, B och C varieras.
     *     Antalet variationer är: 3^2 = 9
     *     Variationerna är: AA AB AC BA BB BC CA CB CC
     *
     * @param n Totalt antal element
     * @param k Antal element som väljs
     * @return Antal sätt dragning kan ske (n^k)
     */
    public BigInteger varB(BigInteger n, BigInteger k) {
        BigInteger result = n.pow(k.intValue());
        return result;
    }

    public BigInteger fakultet(BigInteger n) {
        BigInteger a = BigInteger.ONE;
        for (int i=1; i<=n.intValue(); i++) {
            a = a.multiply(BigInteger.valueOf(i));
            System.out.println(i + "! = " + n);
        }

        return a;
    }

    public BigInteger over(BigInteger n, BigInteger k) {
        BigInteger nFakultet = fakultet(n);
        BigInteger kFakultet = fakultet(k);
        BigInteger nminuskFakultet = fakultet(n.add(k.negate()));
        BigInteger result = nFakultet.divide(kFakultet.multiply(nminuskFakultet));
        return result;
    }
}

package com.developpez.rpouiller.testsjunit4;

import org.junit.Test;

public class TestThrowable {

    /** 
     * test de division ArrayIndexOutOfBoundsException (un seul element)
     * expected Cette annotation permet de verifier qu'un Throwable a bien ete
     * declenche. L'annotation reçoit la classe du Throwable attendu en 
     * paramètre. 
     */
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void divisionAvecUnNombre() {
        Operations.diviser(1);
    }

    /** 
     * test de division ArithmeticException (division par zero)
     * expected Cette annotation permet de verifier qu'un Throwable a bien ete
     * declenche. L'annotation reçoit la classe du Throwable attendu en 
     * paramètre. 
     */
    @Test(expected=ArithmeticException.class)
    public void divisionAvecDeuxNombresDontUnZero() {
        Operations.diviser(10, 0);
    }

    /** 
     * test de division ArithmeticException 
     * expected Cette annotation permet de verifier qu'un Throwable a bien ete
     * declenche. L'annotation reçoit la classe du Throwable attendu en 
     * paramètre. 
     */
    @Test(expected=ArithmeticException.class)
    public void divisionAvecDeuxNombres() {
        Operations.diviser(10, 5);
    }
}

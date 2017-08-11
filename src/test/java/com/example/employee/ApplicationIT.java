package com.example.employee;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by juan on 10/08/17.
 */
public class ApplicationIT extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ApplicationIT(String testName) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( ApplicationTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue( true );
    }
}

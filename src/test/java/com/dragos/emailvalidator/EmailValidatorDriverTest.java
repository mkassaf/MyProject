package com.dragos.emailvalidator;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class EmailValidatorDriverTest  extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EmailValidatorDriverTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EmailValidatorDriverTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}

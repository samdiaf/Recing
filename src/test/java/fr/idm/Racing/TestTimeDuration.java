package fr.idm.Racing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestTimeDuration extends TestCase {
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestTimeDuration( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestTimeDuration.class );
    }

    
    public void testApp()
    {
    	try {
			TimeDuration td = new TimeDuration(10);
			assertTrue(td.getSeconds()==10);
			assertTrue(td.getHours()==0);
			assertTrue(td.getMinuts()==0);
		} catch (BadBadValueException e) {
			fail();
			e.printStackTrace();
		}    
    }
	

}

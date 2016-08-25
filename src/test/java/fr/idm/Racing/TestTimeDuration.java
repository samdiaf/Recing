package fr.idm.Racing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTimeDuration{
	
    @Test
    public void testTimeDuration()
    {
    	try {
			TimeDuration td = new TimeDuration(10);
			assertTrue(td.getSeconds()==10);
			assertTrue(td.getHours()==0);
			assertTrue(td.getMinutes()==0);
		} catch (BadValueException e) {
			e.printStackTrace();
		}    
    }
	

}

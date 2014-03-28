package org.upv.ufasu;

import org.upv.ufasu.weather.TemperatureConversor;


import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class TemperatureConversorTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TemperatureConversorTest( String testName )
    {
        super( testName );
    }

    //(°F - 32) /1.8 = °C
    static String C = "10";
	static String F = "50";
    public void testConversor() throws Exception {
    	String CTemp = TemperatureConversor.getCelsius(F);
    	assertEquals( C, CTemp );
    	
    }
}

package org.upv.ufasu;

import java.io.InputStream;

import org.upv.ufasu.weather.Weather;
import org.upv.ufasu.weather.YahooParser;

import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class YahooParserTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public YahooParserTest( String testName )
    {
        super( testName );
    }

    public void testParser() throws Exception {
    	InputStream valenciaData =
    	getClass().getClassLoader().getResourceAsStream("valencia-weather.xml");
    	Weather weather = new YahooParser().parse( valenciaData );
    	assertEquals( "Valencia", weather.getCity() );
    	assertEquals( "SP", weather.getCountry() );
    	assertEquals( "70", weather.getTemp() );
    	assertEquals( "Fair", weather.getCondition() );
    	assertEquals( "70", weather.getChill() );
    	assertEquals( "21", weather.getHumidity() );
    }
}

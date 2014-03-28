package org.upv.ufasu.weather;



public class TemperatureConversor {

    public TemperatureConversor() {}

    ////(°F - 32) /1.8 = °C
    public static String getCelsius(String F) {
    	if(F!=null) {
    		int Fint = Integer.parseInt(F);
    		double total = ((double)Fint-(double)32)/(double)1.8;    		
    		int Cint = (int) Math.round(total);    		
    		return String.valueOf(Cint);
    	}
    	return null;
    }
    
}

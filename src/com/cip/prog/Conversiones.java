package com.cip.prog;

public class Conversiones {

	public static double CentígradosToFahrenheit (double GradosC) {
		
		double Result =  ((GradosC * 9)/5) + 32;
		return Result;
	}
	
	public static double FahrenheitToCentígrados (double GradosF) {
		
		double Result = ((GradosF- 32) * 5)/9;
		return Result;
	}
}

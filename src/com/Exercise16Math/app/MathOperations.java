package com.Exercise16Math.app;

import java.lang.Math;

public class MathOperations {

	public static void main(String[] args)
	{
		double number = 3.5;
		double number2 = 5.5;
		// 
		System.out.println("e value:"+Math.E);
		System.out.println("pi value:"+Math.PI);
		System.out.println("Absolute value of: "+Math.abs(-2.15));
		System.out.println("te cube root of 27:"+Math.cbrt(27));
		System.out.println("The round of 3.76"+Math.round(3.76));
		System.out.println("The round of 3.76"+Math.ceil(3.76));
		System.out.println("The round of 3.76"+Math.floor(3.76));
		System.out.println("decrement of 5 "+Math.decrementExact(5));
		System.out.println("increment of 5 "+Math.incrementExact(5));
		System.out.println("power of value of 3 euler is: "+Math.exp(3));
		System.out.println(String.format("which is bigger? .2f or .4f : .3f", number, number2, Math.max(number, number2)));
		System.out.println(String.format("which is smaller? .2f or .4f : .3f", number, number2, Math.min(number, number2)));
		System.out.println("Sin of 0 degrees is: "+Math.sin(0));
		System.out.println("Sin of PI/2 degrees is: "+Math.sin(Math.PI/2));
		System.out.println("cos of 0 degrees is: "+Math.cos(0));
		System.out.println("cos of PI/2 degrees is: "+Math.cos(Math.PI/2));

	
	}

	
	

}

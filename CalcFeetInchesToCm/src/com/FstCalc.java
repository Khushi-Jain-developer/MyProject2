package com;

//create a method called calcFeetAndInchesToCm
		//It needs to have two parameters
		//Feet is the first parameter , and Inches is the second parameter
		//
		//You should validate that the first parameter feet is >=0
		//You should validate that the first parameter inches is >=0 and <=12
		//return -1 from the method if either of above is not true.
		//
		//If the parameters are valid then calculate how many centimeters
		//comprise the feet and inches passed to this method and return that value
		//
		//Create a second method  of the same name , but only with one parameter
		//inches is the only parameter
		//validate that its >=0
		//return -1 if it is not true
		//but if its valid,then calculate how many feet are in the inches
		//and then here is the tricky part
		//call the overloaded method passing the correct feet and inches
		//calculated so that it can calculate correctly.
		//hints : use double for your number as a datatype  is probably a good idea
		// 1 inch = 2.54 cm and 1 foot = 12 inches
		//calling another overloaded method just requires you to use the right number of parameters.


public class FstCalc {

	public static void main(String[] args) {
		
		calcFeetAndInchesToCm(12, 0);
		calcFeetAndInchesToCm(7,5);
		calcFeetAndInchesToCm(-10, 1);
		calcFeetAndInchesToCm(0, 10);
		calcFeetAndInchesToCm(6, -10);
		double cm = calcFeetAndInchesToCm(12, 0);
if(cm < 0.0)
		{
			System.out.println("Invalid feet or invalid inches");
		}
		calcFeetAndInchesToCm(6, 13);
		
		//call an overload method by which fst method automatically call
		calcFeetAndInchesToCm(100);
		calcFeetAndInchesToCm(156);
		calcFeetAndInchesToCm(157);
		calcFeetAndInchesToCm(-10);
}
	//create a first method
	public static double calcFeetAndInchesToCm(double feet, double inches){
		if((feet < 0) || (inches < 0) || (inches > 12))
		{
			System.out.println("invald parameters");
			return -1;
		}
		
		double cm = (feet * 12) * 2.54 ;
		cm += inches * 2.54 ;
		System.out.println(feet + " feet ," +inches+ " inches = " +cm+ " centimeters");
		return cm;
	}
	
	//create a second method with same signature but with different parameter
	public static double calcFeetAndInchesToCm(double inches)
	{
		if(inches < 0){
			System.out.println("invalid parametre passed in second method");
			return -1;
		}
		double feet = (int) inches / 12;
		double remainingValueFeet = (int) inches % 12;
		System.out.println(inches+ " inches is equal to " + feet + " feet and remaing value of feet is " + remainingValueFeet);
	 return calcFeetAndInchesToCm(feet, remainingValueFeet);
	}
}

package java_Conversions;

import java.util.Scanner;

public class Conversions {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter the Exp number\n");
		System.out.println(" 1: conversion of Kms to Mi\n 2: Conversion of Mi to Kms\n 3: Conversion of Cm to In\n 4: Conversion of In to Cm\n 5: Conversion of Kg to lb\n 6: Conversion of lb to kg\n 7: Conversion of Litres to cups\n"); //Giving the options to User to select one 
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		
		if(num==1)
		{
			System.out.println("Enter the km value to convert it into Mi\n");
			double value=input.nextDouble();
			double final_value=value*0.62;
			System.out.println( final_value + " miles");
			
		}else if(num==2){
			System.out.println("Enter your Mi to convert it into Kms \n");
			double value=input.nextDouble();
			double finalValue=value*1.61;
			System.out.println(finalValue + " Kms");
		}else if(num==3) {
			
			System.out.println("Enter your Cm to convert it into In \n");
			double value=input.nextDouble();
			double finalvalue=value*0.39;
			System.out.println( finalvalue+ " In");
			
		}else if(num==4) {
			System.out.println("Enter your In to convert it into Cm");
			double value=input.nextDouble();
			double finalValue=value*2.54;
			System.out.println(finalValue + " Cm");
		}else if(num==5) {
			System.out.println("Enter your kg to convert it into lb");
			double value=input.nextDouble();
			double finalValue=value*2.2;
			System.out.println(finalValue + " lb");
		}else if(num==6) {
			System.out.println("Enter your lb to convert it into kg");
			double value=input.nextDouble();
			double finalValue=value*0.45;
			System.out.println(finalValue + " kg");
		}else if(num==7) {
			System.out.println("Enter your litres to convert it into cups");
			double value=input.nextDouble();
			double finalValue=value*4.17;
			System.out.println(finalValue + " cups");
		}
		System.out.println("End of conversion\n");
	}

}


import java.util.Scanner;

public class SmithDariusCSHW01 {
	/*
	 *  Name: [Darius Smith]
	 *  Class: CS1150 (M/W )
	 *  Due:  [1/30]
	 *  Description: HW01 
	 *  Calcualte and print Army Body Fat percentage and BMI       
	 */

		public static void main(String[] args) {
			  // Read user inputs
			/* height in inches
		neck in inches
		waist in inches
		weight in pounds
		*/
					
			  Scanner heightIn = new Scanner(System.in); //Creates Scanner for Height
			    System.out.println("Enter height in inches:");   
			    Double userHeight = heightIn.nextDouble();
			  
			  Scanner neckIn = new Scanner(System.in); //Creates Scanner for Height
			    System.out.println("Enter neck in inches:");   
			    Double userNeck = neckIn.nextDouble();
			  
			  Scanner waistIn = new Scanner(System.in); //Creates Scanner for Height
			    System.out.println("Enter waist in inches:");   
			    Double userWaist = waistIn.nextDouble();
			  
			  Scanner weightLbs = new Scanner(System.in); //Creates Scanner for Height
			    System.out.println("Enter weight in lbs:");   
			    Double userWeight = weightLbs.nextDouble();
			  
			  //Print user inputs
		System.out.println("You are " + userHeight + " inches tall.");
		
		System.out.println("Your neck is " + userNeck + " inches around.");
		
		System.out.println("Your waist is " + userWaist + " inches around.");
		
		System.out.println("You weigh " + userWeight + " Lbs.");
		
			   System.out.println("-------------------------------------------------------");
			  //Calculate and print Army body fat 
			   double armyBfRaw;
			   
			   armyBfRaw = (86.01 * java.lang.Math.log10(userWaist - userNeck)) - (70.041 * java.lang.Math.log10(userHeight)) + 36.76;
			   
			   long armyBf;
			   
			   armyBf = Math.round(armyBfRaw);
			   
			   System.out.println("Army Body fat percentage is " + armyBf + "%");
			   
			   System.out.println("Maximum Body Fat to Join Army");
			   System.out.println("17-20: 30%");
			   System.out.println("21-27: 32%");
			   System.out.println("28-39: 34%");
			   System.out.println("40 and over: 36%");
			   
			   System.out.println("-------------------------------------------------------");
			  //calculate and print BMI
			   double userBMIraw;
			   userBMIraw = 0;
			   
			   userBMIraw = (userWeight / (userHeight * userHeight)) * 703;
			   
			   long userBMI;
			   
			   userBMI = Math.round(userBMIraw);
			   
			   System.out.println("Your BMI is " + userBMI);
			   System.out.println("Below 18.5                          Underweight\r\n"
			   		+ "18.5 - below 25                  Healthy Weight\r\n"
			   		+ "25.0 - below 30                  Overweight\r\n"
			   		+ "Over 30                                Obese\r\n");
			   
			
		}//main

	}//Class GE01


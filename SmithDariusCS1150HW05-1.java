import java.util.Scanner;


public class SmithDariusCS1150HW05 {
	/*
	 *  Name: [Darius Smith]
	 *  Class: CS1150 (M/W)
	 *  Due:  [03/10]
	 *  Description: Homework 05 
	 *  The program will calculate BMI Cholesterol and Blood Pressure
	 */
	

		public static void main(String[] args) {
			
			// Declare Variables -----------------------------------------------------------------------
			
			String Starlines = "****************************";
			String bL = "\n";
			
			int userHealthOption = 0;
			
			Boolean healthCheckOn = true;
			Scanner userHealthCheckInput = new Scanner(System.in);
			System.out.println(Starlines + bL + "Welcome to the Health Checker");
			
			
			// Begin Health Check Loop -----------------------------------------------------------------------
			
			while (healthCheckOn == true)
			{
					Boolean validHealthInput = false;
					
				// Start user health option prompt -----------------------------------------------------------------------
					
					System.out.println(Starlines + bL + 
						"Option      Health Check" + bL + Starlines + bL +
						"  1         BMI" + bL + "  2         Blood Pressure" + bL
						+ "  3         Cholesterol" + bL + "  4         Exit" + bL);
					
				do {
				
					// Propt user health option -----------------------------------------------------------------------
					
					System.out.println("Which health check? Select option 1, 2, 3, or 4: ");
					userHealthOption = userHealthCheckInput.nextInt();
					
					// Check if user health option is a valid input -----------------------------------------------------------------------
					
					if ((userHealthOption == 1) || (userHealthOption == 2) || (userHealthOption == 3) || (userHealthOption == 4))
					{
					validHealthInput = true;
					}
						else
							System.out.println(userHealthOption + " is not a valid entry - try again.");
						
					}while (validHealthInput == false);
							
				// Return the correct user option -----------------------------------------------------------------------
				
				if (userHealthOption == 1)
				checkBMI();
				
					else if (userHealthOption == 2)
						checkCholsterol();
					
						else if (userHealthOption == 3)
							checkBloodPressure();
						
							else if (userHealthOption == 4)
							{
								System.out.println("Have a healthy day, Goodbye!");
								healthCheckOn = false;
				}
			}
			
		}
		
		static void checkBMI() {
			
			// Print Shortcuts -----------------------------------------------------------------------
			
			String Starlines = "****************************";
			String bL = "\n";
			
			// Declare Variables -----------------------------------------------------------------------
			
			double lowBMI = 18.5;
			double highBMI = 25;
			double userHeight = 0;
			
			// Creates Scanner for Height -----------------------------------------------------------------------
			
		    Scanner heightFt = new Scanner(System.in); 
		    System.out.println("Enter height in feet:");   
		    Double userHeightFt = heightFt.nextDouble();
		    
		    //Creates Scanner for Height in -----------------------------------------------------------------------
		    
			Scanner heightIn = new Scanner(System.in); 
		    System.out.println("Enter height inches:");   
		    Double userHeightIn = heightIn.nextDouble();
			
		    //Creates Scanner for Weight -----------------------------------------------------------------------
		    
		    Scanner weightLbs = new Scanner(System.in); 
		    System.out.println("Enter weight in lbs:");   
		    Double userWeight = weightLbs.nextDouble();
			
		    // Calculate user BMI -----------------------------------------------------------------------
		    
		    userHeight = (userHeightIn + (userHeightFt * 12));
			  double userBMIraw;
			   userBMIraw = 0;
			   
			   userBMIraw = (userWeight / (userHeight * userHeight)) * 703;
			   
			   long userBMI;
			   
			   userBMI = Math.round(userBMIraw);
			   
			   System.out.println("Your BMI is " + userBMI);
			   System.out.println(Starlines);
			   
			   // Print user BMI Range -----------------------------------------------------------------------
			   
			if (userBMIraw <= lowBMI) 
			{
				System.out.println("BMI Result =     Low");
			}
				else if ((lowBMI < userBMIraw) && (userBMIraw < highBMI))
				{
					System.out.println("BMI Result =     Normal");
				}
					else
					{
						System.out.println("BMI Result =     High");
					}
			System.out.println(Starlines);
		}

		
		static void checkCholsterol() {
			
			// Print Shortcuts -----------------------------------------------------------------------
			
			String Starlines = "****************************";
			String bL = "\n";
			
			// Declare Variables -----------------------------------------------------------------------
			
			int highChol = 239;
			int lowChol = 200;
			int userCholesterol = 0;
			
			// Collect user Cholesterol -----------------------------------------------------------------------
			
			Scanner cholesterolIn = new Scanner(System.in);
			System.out.println("Enter Cholesterol");
			userCholesterol = cholesterolIn.nextInt();
			
			// Print user Cholesterol Range -----------------------------------------------------------------------
			
			   System.out.println(Starlines);
				if (userCholesterol <= lowChol) 
				{
					System.out.println("Cholesterol Result =     Good");
				}
					else if ((lowChol < userCholesterol) && (userCholesterol < highChol))
					{
						System.out.println("Cholesterol Result =     Borderline");
					}
						else
						{
							System.out.println("Cholesterol Result =     High");
						}
				System.out.println(Starlines);
			}
			
		
		
		static void checkBloodPressure() {
			
			
			// Print Shortcuts -----------------------------------------------------------------------
			
			String Starlines = "****************************";
			String bL = "\n";
			
			//Declare Blood Pressure Ranges -----------------------------------------------------------------------
			
			int topBPLow = 120;
			int topBPMid = 130;
			int topBPHigh = 140;
			int bottomBPLow = 80;
			int bottomBPHigh = 90;
			
			
			// Declare user Blood Pressure -----------------------------------------------------------------------
			
			int userTopBP = 0;
			int userBottomBP = 0;
			
			// Collect user top and bottom blood pressure -----------------------------------------------------------------------
			
			Scanner userInputBP = new Scanner(System.in);
			System.out.println("Enter top blood pressure number (systolic): ");
			userTopBP = userInputBP.nextInt();
			System.out.println("Enter bottom blood pressure number (diastolic): ");
			userBottomBP = userInputBP.nextInt();
			
			
			// Calculate blood pressure range -----------------------------------------------------------------------
			
			System.out.println(Starlines);
			if ((userTopBP <= topBPLow) && (userBottomBP <= bottomBPLow))
			{
				System.out.println("Blood Pressure Result =     Normal");
			}
				else if (((userTopBP > topBPLow) && (userTopBP < topBPMid)) && (userBottomBP <= bottomBPLow))
				{
					System.out.println("Blood Pressure Result =     Elevated");
				}
					else if (((userTopBP >= topBPMid) && (userTopBP < topBPHigh)) && ((userBottomBP >= bottomBPLow) && (userBottomBP < bottomBPHigh)))
					{
						System.out.println("Blood Pressure Result =     Stage 1 high blood pressure");
					}
						else
						{
							System.out.println("Blood Pressure Result =     Stage 2 high blood pressure");
						}
		}
		
		
		
		
		
	}//Class GE01



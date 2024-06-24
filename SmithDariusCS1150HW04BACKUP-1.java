import java.util.Scanner;
import java.util.Random;

public class SmithDariusCS1150HW04BACKUP {
	/*
	 *  Name: [Darius Smith]
	 *  Class: CS1150 (M/W )
	 *  Due:  [03/06]
	 *  Description: HW 04 
	 *  The program will print bike rental tickets
	 */

		public static void main(String[] args) {
			
			double oneHrPassPrice = 1.50;
			double twoHrPassPrice = 2.50;
			double sixHrPassPrice = 4.00;
			
			
			
			//bikes
			double startingBikeNum = 9;
			double bikeNum = 9;
			double bikesRequested;
			bikesRequested = 0;
			double totalBikesRented = 0;
			double totalMoneyMade = 0;
			
			//scanner shortcuts
			String Starlines = "****************************";
			String bL = "\n";
			
			
			Random r = new Random();
		
			int stationOn = 0;
					
			while (stationOn == 0)
			{	
				// Number of bikes avaliable----------------------------------------------------------
				
				System.out.println(Starlines + bL + "Welcome to UCCS Bike Share" + bL + (Math.round(bikeNum - bikesRequested))
	+ " bikes are avaliable" + bL + Starlines);
				
				// Rental Options----------------------------------------------------------
				System.out.println("Rental Options        Fee" + bL + Starlines + bL + "1) 1-Hour Pass        $" + oneHrPassPrice + bL
						 + "2) 2-Hour Pass        $" + twoHrPassPrice + bL + "3) 6-Hour Pass        $" + sixHrPassPrice + bL
						 + "4) Return" + bL + Starlines);
				
				
				
				// User Rental Option----------------------------------------------------------
				int userRentalOption;
				int validOption = 0;
				int printReceipt = 0;
				
				
				// User Bike Number----------------------------------------------------------
				int userBikeQuantity = 0;
				int validNumber = 0;
				
				do{
				Scanner bikeRentalOption = new Scanner(System.in);
				System.out.println("Select rental option 1, 2, 3, or 4:");
				userRentalOption = bikeRentalOption.nextInt();
				
				// Validation----------------------------------------------------------
				
				
				// Skip the bike quantity if bike is returned----------------------------------------------------------

				
						if (userRentalOption == 4)
							 if(bikeNum <= (startingBikeNum - 1))
				{
					System.out.println("Bike was successfully returned.");
					validNumber = validNumber + 1;
					validOption = validOption + 1;
										bikeNum += 1;
				}
							 else 
								 System.out.println("Bike rental is full");
				if (((userRentalOption == 1) || (userRentalOption == 2) || (userRentalOption == 3) || (userRentalOption == 999)) || ((userRentalOption == 4) && (bikeNum <= (startingBikeNum - 1)))) // Validation----------------------------------------------------------
				{
					validOption = validOption + 1;
				}
				
				
				else System.out.println("Invalid entry");
				
				}while (validOption == 0);
				
		
				
				
				
					//System Shutdown----------------------------------------------------------
				if (userRentalOption == 999)
				{
					validNumber = validNumber + 1;
					validOption = validOption + 1;
					stationOn = stationOn + 1;
					System.out.println("UCCS Bike Station at Main Hall was successfully shut down");
				}
				
				
				while (validNumber == 0) {
						Scanner bikeQuantity = new Scanner(System.in);
						System.out.println("How many bikes do you want to rent? The limit is 4:");
						userBikeQuantity = bikeQuantity.nextInt();
				
						if (bikeNum - userBikeQuantity <= 0)
							System.out.println("There are only " + (Math.round(bikeNum)) + " bikes avaliable.");
				
						if ((bikeNum - userBikeQuantity >= 0) && ((userBikeQuantity == 1) || (userBikeQuantity == 2) || (userBikeQuantity == 3) || (userBikeQuantity == 4))) 
						{
							validNumber = validNumber + 1;
							bikeNum = bikeNum - userBikeQuantity;
							totalBikesRented = (totalBikesRented + userBikeQuantity);
						}
				
						else System.out.println("Invalid entry");
				
						
						
					}
				
				
				// Receipt----------------------------------------------------------
				
				
				// Switch for Rental Option----------------------------------------------------------
				String rentalOptionStr = "a";
				double rentalOptionPrice = 0;
				double bikeRentalCodes;
				
				
				switch(userRentalOption) {
				case 1: rentalOptionStr = "1 Hour";
				break;
				case 2: rentalOptionStr = "2 Hours";
				break;
				case 3: rentalOptionStr = "6 Hours";
				break;
				}
				
				
				// Switch for Rental Price----------------------------------------------------------
				switch(userRentalOption) {
				case 1: rentalOptionPrice = 1.50;
				break;
				case 2: rentalOptionPrice = 2.50;
				break;
				case 3: rentalOptionPrice = 4.00;
				break;
				}
				
				
				
				// Receipt part A----------------------------------------------------------
				
				
				
				
				if ((userRentalOption == 4) || (userRentalOption == 999)) // Skip receipt if bike is returned
				{
				System.out.println("No Receipt");
				printReceipt += 1;		
				}
				
				if (printReceipt == 0)
					{
				System.out.println(Starlines + bL + "********* Receipt **********" + bL + Starlines);
				
				System.out.println(rentalOptionStr + " For " + Math.round(userBikeQuantity) + " Bikes");
				
				int printCodeNumber = 1;
				while (printCodeNumber != 1 + userBikeQuantity) {
					
				System.out.println("Unlock code for bike # " + printCodeNumber + ":    " + (r.nextInt(100000) - 1));
				printCodeNumber += 1;
				}
				System.out.println("Rental cost: $" + (rentalOptionPrice * userBikeQuantity));
					
				}
				totalBikesRented = totalBikesRented + userBikeQuantity;
				totalMoneyMade = totalMoneyMade + (rentalOptionPrice * userBikeQuantity);
			}
			
			// System shut down
			if (stationOn != 0);
			System.out.println("Total Bikes Rented: " + totalBikesRented/2);
			System.out.println("Total Sales: $" + totalMoneyMade);
			System.out.println("Shutdown");
					
		}//main

	}//Class HW04



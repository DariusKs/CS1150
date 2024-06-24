

import java.util.Scanner;
import java.util.Random;

public class SmithDariusCS1150HW03 {
	/*
	 *  Name: [Darius Smith]
	 *  Class: CS1150 (M/W)
	 *  Due:  [02/20]
	 *  Description: HW 03
	 *  This program will make randomly generated tickets for Disney World       
	 */


		public static void main(String[] args) {
				
			char animal_kingdom_input = 'A';
			String animal_kingdom_full = "AK";
			int guest_day_min = 0;
			int guest_day_max = 10;
			Scanner guest_visit_input = new Scanner(System.in);
			
			System.out.println("Prompt to enter theme park:");
			String str = guest_visit_input.nextLine();
			str = str.trim();
			char guest_theme_park = str.charAt(0);
			char guest_days_staying = str.charAt(2);
			//char guest_theme_park = input.nextLine().charAt(0);
			//char guest_days_staying = input.nextLine().charAt(2);
			String sample_alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			Random r = new Random();
		    //for (int i = 0; i < 4; i++) {
		        // char four_letters = (sample_alphabet.charAt(r.nextInt(sample_alphabet.length())));
		    //}
			//char random_letter = (sample_alphabet.charAt(r.nextInt(sample_alphabet.length())));
			Random rn = new Random();
			//int random_number = (rn.nextInt(10) + 1);
			//for(int i=0; i < guest_theme_park.length(); i++)
			//	System.out.println("Char is " + i + guest_theme_park.charAt(i));
			System.out.println("Enter theme park character (A,E,H,M) then a space then the number of days (1-10):");
			System.out.printf("(A: Animal Kingdom  E: Epcot  H: Hollywood Studios  M: Magic Kingdom) %c\n", (char) guest_theme_park);
			
			//(sample_alphabet.charAt(r.nextInt(sample_alphabet.length()))
			
			//int guest_days_staying_int = 0;
			int guest_days_staying_int = guest_days_staying - '0';
		
			if ((guest_theme_park == 'A' ^ guest_theme_park == 'E' ^ guest_theme_park == 'H' ^ guest_theme_park == 'M'))
				System.out.println("valid check");
				if (guest_theme_park == 'A')
					{
					
					System.out.println("Animal Kingdom");
					System.out.println((r.nextInt(100) + 10) + "-" + (r.nextInt(10000) + 10) + "-AK");
					
					}
				if (guest_theme_park == 'E')
				{
					System.out.println("Epcot");
				
				System.out.println((r.nextInt(100000) + 10) + "--" + (sample_alphabet.charAt(r.nextInt(sample_alphabet.length()))) 
						+ (sample_alphabet.charAt(r.nextInt(sample_alphabet.length()))) + "--E");
				
				}
				if (guest_theme_park == 'H')
				{
					System.out.println("Hollywood Studios");
				
				System.out.println((sample_alphabet.charAt(r.nextInt(sample_alphabet.length()))) + 
						(sample_alphabet.charAt(r.nextInt(sample_alphabet.length()))) + 
						(sample_alphabet.charAt(r.nextInt(sample_alphabet.length()))) + 
						" " + (r.nextInt(100) + 10) + " HS");
				
				}
				if (guest_theme_park == 'M')
				{
					System.out.println("Magic Kingdom");
				System.out.println((r.nextInt(10) + 1) + " " + (sample_alphabet.charAt(r.nextInt(sample_alphabet.length()))) + 
						(sample_alphabet.charAt(r.nextInt(sample_alphabet.length()))) + 
						(sample_alphabet.charAt(r.nextInt(sample_alphabet.length()))) + " MK");
				
				}
				else {
				System.out.println("Invalid input for theme park - run program again");
				}
		//	if (guest_day_min <= guest_days_staying && guest_days_staying_int <= guest_day_max)
			//	System.out.println("Valid check");
			//	else {
			//	System.out.println("Invalid input for theme park - run program again");
				if (str.length() > 4)
					System.out.println("Invalid input for theme park - run program again");
				else { 
					System.out.println("valid check");
					System.out.printf("You will stay for %c days.", (char) guest_days_staying );
					
					
				}
		}//main



	}



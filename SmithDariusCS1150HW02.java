
import java.util.Scanner;

public class SmithDariusCS1150HW02 {
	/*
	 *  Name: [Darius Smith]
	 *  Class: CS1150 (M/W)
	 *  Due:  [2/14]
	 *  Description: HW02
	 *  This program will calculate cost of tacos      
	 *  This program will also display the input values and costs.
	 */

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		//EACH TACO TYPE
		
		double veg_taco_price = 3.49;
		double chicken_taco_price = 3.99;
		double carnitas_taco_price = 4.19;
		double beef_taco_price = 4.59;
		double shrimp_taco_price = 5.19;
		double tax_rate = .065;
		double discount = .08;
		
		//CALCULATION VARIABLES
		double order_price = 0;
		double order_discount = 0;
		double order_tax = 0;
		double order_final_price = 0;
		
		double final_order_price = 0;
		double final_order_discount = 0;
		double final_order_tax = 0;
		double final_order_final_price = 0;
		
		//MIN MAX TACO FILLING NUMBER
		
		int min_filling = 1;
		int max_filling = 5;
		
		//MIN AN MAX TACO COUNT
		
		int min_taco = 1;
		int max_tacos = 12;
		
		//FIRST PROMPT
		
		System.out.println("Hungry for some Tacos?" + '\n' + "Option filling Prices" + '\n' + "-------------------------------" + '\n' + 
				"1 Veggie $3.49" + '\n' + "2 Chickn$3.99" + '\n' + "3 Carnitas $4.19" + '\n' + "4 Beef $4.59" + '\n' + "5 Shrimp $5.19");
		
		//USER IMPUT FILLING
		
		Scanner filling_in = new Scanner(System.in);
		double taco_filling = 0;
	    int valid_check_filling = 1;
	    do {
	    	System.out.println("Select a filling (1, 2, 3, 4, or 5):");
	    	int user_taco_filling = filling_in.nextInt();
	        if (min_filling <= user_taco_filling && user_taco_filling <= max_filling) {
	            valid_check_filling = 2;
	            taco_filling = taco_filling + user_taco_filling;  //RETURNS VALUE
	        } else
	            System.out.println("Invalid input, please select a valid filling.");
	    } while (valid_check_filling == 1);

		//USER IMPUT NUMBER OF TACOS
	  
		Scanner taco_number_in = new Scanner(System.in); //SCANNER FOR NUMBER OF TACOS
		double number_of_tacos = 0;
		int valid_check_taco_num = 1;
		do {
			 System.out.println("How many tacos would you like (from 1 to 12:)");   
			 int user_taco_num = taco_number_in.nextInt();
			 if (min_taco <= user_taco_num && user_taco_num <= max_tacos) {
		            valid_check_taco_num = 2;
		            number_of_tacos = number_of_tacos + user_taco_num;  //RETURNS VALUE
		        } else
		            System.out.println("Invalid input, please select a valid quantity");
		    } while (valid_check_taco_num == 1);
		
		//RETURN USER INPUTS
		
		double taco_filling_price = 0;
			if (taco_filling == 1)
			{
				taco_filling_price = veg_taco_price;
			}
			else if (taco_filling == 2) {
				taco_filling_price = chicken_taco_price;
			}
			else if (taco_filling == 3) {
				taco_filling_price = carnitas_taco_price;
			}
			else if (taco_filling == 4) {
				taco_filling_price = beef_taco_price;
			}
			else
			{
				taco_filling_price = shrimp_taco_price;
			}
			
		String taco_filling_name;
		if (taco_filling == 1)
		{
			taco_filling_name = "Veggie taco";
		}
		else if (taco_filling == 2) {
			taco_filling_name = "Chicken taco";
		}
		else if (taco_filling == 3) {
			taco_filling_name = "Carnitas taco";
		}
		else if (taco_filling == 4) {
			taco_filling_name = "Beef taco";
		}
		else
		{
			taco_filling_name = "Shrimp taco";
		}
			

				//CALCULATIONS
		
		//DISCOUNT
		
		if (number_of_tacos >= 5) {
		
			order_discount = discount * (taco_filling_price * number_of_tacos);
		}
			else 
				order_discount = 0;
		
		final_order_discount = Math.round((order_discount) * 100.0) / 100.0;
		
		//TAX
		
		order_tax = (tax_rate * (taco_filling_price * number_of_tacos));
		final_order_tax = Math.round(tax_rate * (taco_filling_price * number_of_tacos) * 100.0) / 100.0;
		
		//ORDER PRICE
		
		order_price = Math.round((taco_filling_price * number_of_tacos) * 100.0) / 100.0;
		final_order_final_price = Math.round((order_price + order_discount - order_tax) * 100.0) / 100.0;
		
		//ROUNDING
		
		long rounded_taco_number = Math.round(number_of_tacos);
		
		//PRINT RECIPT
		
		System.out.println("-------------------------------");
		
		if (number_of_tacos > 1)
		{
			System.out.println(rounded_taco_number + " " + taco_filling_name + "s $" + order_price);
		}
		else
			System.out.println(rounded_taco_number + " " + taco_filling_name + " $" + order_price);
		System.out.println("Discount: -$" + final_order_discount);
		System.out.println("Taxes: $" + final_order_tax);
		
		System.out.println("-------------------------------");
		
		
		System.out.println("Total Cost: $"+ final_order_final_price);	
		 
		}
		
	}



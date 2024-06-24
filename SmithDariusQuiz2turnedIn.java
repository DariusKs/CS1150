
public class SmithDariusQuiz2 {
	/*
	 *  Name: [YOUR NAME]
	 *  Class: CS1150 (M/W or T/TH)
	 *  Due:  [FILL IN]
	 *  Description: Guided Exploration 01 
	 *  This program will print a couple paragraphs about my passions and interests.       
	 *  The program will calculate my age doubled. Optional
	 */

	

		public static void main(String[] args) {

			
			
			
			
			
			// PART 1
			
			int[] numbers1 = {8, 1, 7, 19, 2};
			int[] numbers2 = {6, 3, 12, 4};
			
			
			
			
			
			//PART 2
			final int NUM_TURTLES = 6;
			TurtleQ turtle1 = new TurtleQ("Hawksbill", 45, "Rose");
			TurtleQ turtle2 = new TurtleQ("Loggerhead", 62, "Pancake");
			TurtleQ turtle3 = new TurtleQ("Greenturtle", 39, "Olive");
			TurtleQ turtle4 = new TurtleQ("Hawksbill", 33, "Miss Piggy");
			TurtleQ turtle5 = new TurtleQ("Loggerhead", 14, "B StreiSAND");
			TurtleQ turtle6 = new TurtleQ("Loggerhead", 75, "Poptart");
			// Create an array that holds turtles and places the turtles into the array
			TurtleQ[] turtles = new TurtleQ[NUM_TURTLES];
			turtles[0] = turtle1;
			turtles[1] = turtle2;
			turtles[2] = turtle3;
			turtles[3] = turtle4;
			turtles[4] = turtle5;
			turtles[5] = turtle6;
			
			
			findLargest(numbers1, numbers2);
			System.out.println("Largest Value = " + findLargest(numbers1, numbers2));

				int numTurtleQ = findNumTurtles(turtles, "Loggerhead");
					System.out.println("Number of Loggerhead turtles = " + numTurtleQ);
				
			double ageAverage = computeAverageAge(turtles);
			System.out.println("Average age of all turtles = " + ageAverage);
			
			//System.out.println(displayOlderThanAverage(turtles, ageAverage);
			}
		


		// Find and return the largest of all values in two arrays
		public static int findLargest (int[] array1, int[] array2) {
			int arrayOneLength = array1.length;
			int arrayTwoLength = array2.length;
			int lowNum1 = 0;
			int lowNum2 = 0;
			
			for (int i = arrayOneLength - 1; i >= 0; i--) {
				if (array1[i] > lowNum1) {
					lowNum1 = array1[i];	
				}
			}
			for (int i = arrayTwoLength - 1; i >= 0; i--) {
				if (array2[i] > lowNum2) {
					lowNum2 = array2[i];
				}
			}
			
			if (lowNum1 > lowNum2) {
			return lowNum1;
			}
			else {
				return lowNum2;
			}

		}
		// Find and return the number of turtles of a specified type
		public static int findNumTurtles (TurtleQ[] turtles, String type) {
			int i = 0;
			int numOfTurtles = 0;
			for (i = turtles.length - 1; i >= 0; i--) {
				if (turtles[i].getType() == type) {
					numOfTurtles ++;}
				
			}
			
		return numOfTurtles; // added so code will compile, remove and replace with code
		}
		// Find and return the average age of all turtles
		public static double computeAverageAge (TurtleQ[] turtles) {
			int i = 0;
			double totalAge = 0;
			double averageAge = 0;
			for (i = turtles.length - 1; i >= 0; i--) {
				totalAge = totalAge + turtles[i].getAge();
			}
			averageAge = totalAge / turtles.length;
			return averageAge;
			
		}
			

		// Display name, age, type of all turtles that are older than incoming average age
		public static void displayOlderThanAverage(TurtleQ[] turtles, double averageAge) {
	//		for (int i = turtles.length - 1; i >= 0; i--) {
	//			if (turtles[i].getAge > averageAge) {
	//				System.out.println("Name :" + turtles[i].getAge + " Age : " + turtles[i].getAge + "Type : " + turtles[i].getType);
		}
		

		
		
	}


class TurtleQ {
private String type;
private int age;
private String name;
public TurtleQ (String type, int age, String name) {
this.name = name;
this.age = age;
this.type = type;
}
public String getType() {
return type;
}
public int getAge() {
return age;
}
public String getName() {
return name;
}
} // TurtleQ

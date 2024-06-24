import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SmithDariusHW08 {

    /*
     *  Name: [Darius Smith]
     *  Class: CS1150 (M/W )
     *  Due:  [04/24]
     *  Description: HW08 
     */

    public static void main(String[] args) throws IOException {
    	
    	//Main variables
    	double raceTime = 0;
        double raceTimeHours = 0;
        final double raceTotalDistance = 500;

        //Array of six cars
        RaceCar[] raceCars = new RaceCar[6];
        
        //Array with racecars with createRaceCars Method
        createRaceCars(raceCars);
        
        
     // Display the details of each race car before the race starts
        System.out.println("Race cars before the race begins: \n");
        displayAllRaceCars(raceCars);
        System.out.println("\n The race is in progress...");
        
        
        //RACE LOOP
        //Create a loop until race cars hit 500 miles
        do { 
        	//DO Variables
        raceTimeHours = raceTime / 60;	
        double milesToAdd = 0;	  
        			// Repeats  every hour
                   if (raceTime % 4 == 0 && raceTime != 0) {
                	   //Print race time every hour
                       System.out.println("Racing Time ... " + raceTimeHours);
                       
                       for (int i = raceCars.length - 1; i >= 0; i--) {   
                    	   
                    	   //If odometer is less than the race add distance every hour
                    	   if (raceCars[i].getOdometer().getMiles() < raceTotalDistance) {
                       milesToAdd = raceCars[i].getAverageSpeed();
                       raceCars[i].getOdometer().updateMiles(milesToAdd);} 
                    	   
                    	   //If odometer is above or equal to race distance print name and set to finished
                       		if (raceCars[i].getOdometer().getMiles() >= raceTotalDistance) {
                       			
                       			//Print finished name only once per car
                       			if (raceCars[i].isFinished() != true) {
                       		System.out.println("Finished: " + raceCars[i].getDriver() + 
                     				" with " + raceCars[i].getOdometer().getMiles() + " miles");	
                       		raceCars[i].setFinished(true);
                       			}
                       			else {
                       				raceCars[i].setFinished(true);
                       			}// end else
                       		} //end Race Finished? loop
                       }//end race calculations loop
                   }//end repeating every hour
                   else {
                	   System.out.println("Racing Time ... " + raceTimeHours);
                   }//repeats every 15 minutes
                   raceTime = raceTime + 15;
               }//end do
        	while (isRaceFinished(raceCars) == false);// end of race
        	//END RACE LOOP
        
        
        
        // Display the race car details at race completion
        System.out.println("\nRace car details at race completion:");
        
        displayAllRaceCars(raceCars);
        
        //writeRaceCarDetailsToFile(raceCars);
        writeRaceCarDetailsToFile(raceCars);
        
    }//Main end

    // Method to create 6 race cars and place them into an array
    public static void createRaceCars(RaceCar[] raceCars) {
        raceCars[0] = new RaceCar("Donkey", 8, 80);
        raceCars[1] = new RaceCar("Shrek", 11, 115);
        raceCars[2] = new RaceCar("Dragon", 17, 70);
        raceCars[3] = new RaceCar("Fiona", 18, 100);
        raceCars[4] = new RaceCar("Farquaad", 45, 84);
        raceCars[5] = new RaceCar("Pinocchio", 42, 68);
    }

    // Method to display the details of a single race car
    public static void displayRaceCar(RaceCar raceCar) {
        System.out.println("Driver: " + raceCar.getDriver());
        System.out.println("Miles raced: " + raceCar.getOdometer().getMiles());
    }

    // Method to display the details of all race cars in an array
    public static void displayAllRaceCars(RaceCar[] raceCars) {
        for (RaceCar car : raceCars) {
            System.out.println("Race car #" + car.getNumber() + ":");
            System.out.println("  Driver: " + car.getDriver());
            System.out.println("  Average speed: " + car.getAverageSpeed() + " mph");
            System.out.println("  Miles raced: " + car.getOdometer().getMiles());
        }
    }

    // Method to determine if all race cars have finished the race
    public static boolean isRaceFinished(RaceCar[] raceCars) {
        for (RaceCar car : raceCars) {
            if (car.isFinished() == false) {
                return false;
            }
        }
        return true;
    }

    // Method to print the details of all race cars to a file
    public static void writeRaceCarDetailsToFile(RaceCar[] raceCars) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(new File("race_car_details.txt")));
        for (RaceCar car : raceCars) {
           pw.println("Race car #" + car.getNumber() + ":");
            pw.println("  Driver: " + car.getDriver());
            pw.println("  Average speed: " + car.getAverageSpeed() + " mph");
        }
}
}//main class

//Odometer class
class Odometer {
    // Data fields
    private double miles;

    // Constructor
    public Odometer() {
        miles = 0;
    }

    // Getter for miles
    public double getMiles() {
        return miles;
    }

    // Update the odometer miles by the number of miles the race car has traveled
    public void updateMiles(double milesTraveled) {
        miles += milesTraveled;
    }
}

//RaceCar class
class RaceCar {
    // Data fields
    private String driver;
    private int number;
    private double averageSpeed;
    private boolean finished;
    private Odometer odometer;

    // Constructors
    public RaceCar(String driver, int number, double averageSpeed) {
        this.driver = driver;
        this.number = number;
        this.averageSpeed = averageSpeed;
        finished = false;
        odometer = new Odometer();
    }

    // Getters
    public String getDriver() {
        return driver;
    }
// car number getter
    public int getNumber() {
        return number;
    }
//avg speed mph getter
    public double getAverageSpeed() {
        return averageSpeed;
    }
//finished getter
    public boolean isFinished() {
        return finished;
    }
//Odometer getter
    public Odometer getOdometer() {
     return odometer;
 }

 // Setter for finished
 public void setFinished(boolean finished) {
     this.finished = finished;
 }
}

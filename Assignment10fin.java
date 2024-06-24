public class Assignment10 {
	/*
	 *  Name: [Darius Smith]
	 *  Class: CS1150 (M/W)
	 *  Due:  [04/12]
	 *  Description: HW 07
	 *  THis program will sort and perform manipulations to turtle objects in an array.       
	 */
	    public static void main(String[] args) {
	        // Create the Turtle objects
	    	int i = 0;
	    	
	        Turtle t1 = new Turtle("Hawksbill", 42, "Rose", i++);
	        Turtle t2 = new Turtle("Leatherback", 30, "Donna", i++);
	        Turtle t3 = new Turtle("Loggerhead", 62, "Pancake", i++);
	        Turtle t4 = new Turtle("Greenturtle", 39, "Olive", i++);
	        Turtle t5 = new Turtle("Loggerhead", 75, "Poptart", i++);
	        Turtle t6 = new Turtle("Hawksbill", 33, "Miss Piggy", i++) ;
	        Turtle t7 = new Turtle("Leatherback", 14, "B StresiSAND", i++);
	        
	        TurtleHospital h = new TurtleHospital("TurtleHospitalMain", 9);
	       
	        h.addTurtle(t1);
	        h.addTurtle(t2);
	        h.addTurtle(t3);
	        h.addTurtle(t4);
	        h.addTurtle(t5);
	        h.addTurtle(t6);
	        h.addTurtle(t7);
	        
	        System.out.println("Part 1");
	        h.displayTurtles();
	        Turtle oldturtle = h.findOldestTurtle();
	        System.out.println("Oldest Turtle in the Hospital:");
	        h.displayTurtle(oldturtle);
	        
	        System.out.println("Part 2");
	        
	        Turtle t8 = new Turtle("Greenturtle", 150, "Crush", i++);
	        Turtle t9 = new Turtle("Leatherback", 18, "Myrtle", i++);
	        Turtle t10 = new Turtle("Hawksbill", 44, "Coco", i++);
	        
	        h.addTurtle(t8);
	        h.addTurtle(t9);
	        h.addTurtle(t10);
	        
	        h.displayTurtles();
	        System.out.println("Oldest Turtle in " + h.getHospitalName());
	        h.displayTurtle(oldturtle);
	        
	    }


}    

class Turtle {
	
	//private methods
	    private String type;
	    private int age;
	    private String name;
	    private int number;
	//Public  
	public Turtle(String type, int age, String name, int number) {
	        this.type = type;
	        this.age = age;
	        this.name = name;
	        this.number = number;
	    }

	//Getters for type age name
	    public String getType() {
	        return type;
	    }
	 
	    public int getAge() {
	        return age;
	    }

	    public String getName() {
	        return name;  
	    }
	    public int getNumber() {
	    	return number;
	    }
	//No setters
	        
	    }
	
class TurtleHospital {
	

	//Private data fields hName turtles and numturtlesinhospital
		
	    private String hospitalName;
	    private Turtle[] turtles;
	    private int numTurtlesInHospital;

	//Public Methods
	    //constructor
	    public TurtleHospital(String hospitalName, int maxNumTurtles) {
	        this.hospitalName = hospitalName;
	        turtles = new Turtle[maxNumTurtles];
	        numTurtlesInHospital = 0;
	    }
	    // Setter for
	    
	 /*   public Turtle turtleToAdd(String getType, int getAge, String getName) {
	    turtles[numTurtlesInHospital] = new Turtle(getType, getAge, getName);
	    return turtles[numTurtlesInHospital++];
	    }
	    */
	    
	   
	    //Getter for hospital name
	    public String getHospitalName() {
	        return hospitalName;
	    }
	    
	    // Other Methods
	    public void displayTurtles() {
	        for (int i = 0; i < numTurtlesInHospital; i++) {
	            System.out.println("Turtle " + (1 + turtles[i].getNumber()) + ": Type: " + turtles[i].getType() + ", Age: " + turtles[i].getAge() + ", Name: " + turtles[i].getName());
	            
	        }
	    }
	    
	    public void displayTurtle(Turtle turtleToDisplay) {
	    int i = 0;
	    i = turtleToDisplay.getNumber();
	            System.out.println("Turtle " + (1 + i) + ": Type: " + turtles[i].getType() + ", Age: " + turtles[i].getAge() + ", Name: " + turtles[i].getName());
	            
	        
	    }
	    
	    public Turtle findOldestTurtle() {
	        Turtle oldestTurtle = turtles[0];
	        for (int i = 1; i < numTurtlesInHospital; i++) {
	            if (turtles[i].getAge() > oldestTurtle.getAge()) {
	                oldestTurtle = turtles[i];
	            }
	        }
	        return oldestTurtle;
	        
	    }
	     public boolean addTurtle(Turtle turtleToAdd) {
	    	boolean turtleAdded = false;
	        if (numTurtlesInHospital < turtles.length) {
	            turtles[numTurtlesInHospital] = turtleToAdd;
	            numTurtlesInHospital++;
	            System.out.println("Turtle " + turtleToAdd.getName() + "added successfully to the hospital.");
	            turtleAdded = true;
	            return turtleAdded;
	        } else {
	            System.out.println("Turtle hospital is full, cannot add any more turtles.");
	            return turtleAdded;
	        }
	    
	    }
	}





	/*
	 *  Name: [Darius Smith]
	 *  Class: CS1150 (M/W)
	 *  Due:  [05/01]
	 *  Description: HW09 
	 *  This assignment is an opportunity to work with objects using inheritance and polymorphism.  Write
	 *   a program that creates one superclass (parent), several subclasses (child), and use
	 *    polymorphism.  Write code to create the following class hierarchy in your program. 
	 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SmithDariusHW09 {

    public static void main(String[] args) {
        Animal[] animals = null;
        int numAnimals = 0;
        
        try (Scanner scanner = new Scanner(new File("Animals.txt"))) {
            numAnimals = scanner.nextInt();
            animals = new Animal[numAnimals];
            scanner.nextLine();
            
            for (int i = 0; i < numAnimals; i++) {
                String type = scanner.next();
                String name = scanner.next();
                String food = scanner.next();
                int weight = scanner.nextInt();
                int sleep = scanner.nextInt();
                String location = scanner.nextLine().trim();
                
                switch (type) {
                    case "Bear":
                        animals[i] = new Bear(name, food, weight, sleep, location);
                        break;
                    case "Elephant":
                        animals[i] = new Elephant(name, food, weight, sleep, location);
                        break;
                    case "Monkey":
                        animals[i] = new Monkey(name, food, weight, sleep, location);
                        break;
                    case "Sloth":
                        animals[i] = new Sloth(name, food, weight, sleep, location);
                        break;
                    default:
                        System.out.println("Unknown animal type: " + type);
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Animals.txt file not found");
            return;
        }
        
        for (int i = 0; i < numAnimals; i++) {
        	{
        		String GetName = animals[i].getName();
        		int GetWeight = animals[i].getWeight();
        		int GetSleep = animals[i].getSleep();
        		String GetLocation = animals[i].getLocation();

        		System.out.println(); 
        		System.out.println("Animal[" + i + "] is a " + animals[i].getClass().getSimpleName());
        		System.out.println(animals[i].getClass().getSimpleName() + ": Name: " + GetName +
        				" - Weighs: " + GetWeight + " lbs - Sleeps: " + GetSleep + " hours - Location: " + GetLocation);
        		
        		animals[i].eat();
        		animals[i].sleep();
        		animals[i].swim();
        }
    }

}

}
 class Animal {
    private String name;
    private String food;
    private int weight;
    private int sleep;
    private String location;

    public Animal(String name, String food, int weight, int sleep, String location) {
        this.name = name;
        this.food = food;
        this.weight = weight;
        this.sleep = sleep;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public int getWeight() {
        return weight;
    }

    public int getSleep() {
        return sleep;
    }

    public String getLocation() {
        return location;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping - do not disturb");
    }

    public void swim() {
        System.out.println("Animal is swimming");
    }
}

  class Bear extends Animal {
	    private String type = "Bear";

	    public Bear(String name, String food, int weight, int sleep, String location) {
	        super(name, food, weight, sleep, location);
	    }
	    @Override
		public void eat() { 
	    	System.out.println(this.getClass().getSimpleName()+ " is eating " + this.getFood());
	 }
	    @Override
		public void sleep() { 
	    	System.out.println(this.getClass().getSimpleName()+ " is sleeping " + this.getSleep() + " hours");
	 }
	    @Override
		public void swim() { 
	    	System.out.println(this.getClass().getSimpleName()+ " is swimming");
	 }
	    public String getType() {
	        return type;
	    }
	}

 class Elephant extends Animal {
    private String type = "Elephant";

    public Elephant(String name, String food, int weight, int sleep, String location) {
        super(name, food, weight, sleep, location);
    }
    @Override
	public void sleep() { 
    	System.out.println(this.getClass().getSimpleName()+ " is sleeping " + this.getSleep() + " hours");
 }
    public String getType() {
        return type;
    }
}

 class Monkey extends Animal {
    private String type = "Monkey";

    public Monkey(String name, String food, int weight, int sleep, String location) {
        super(name, food, weight, sleep, location);
    }
    @Override
	public void eat() { 
    	System.out.println(this.getClass().getSimpleName()+ " is eating " + this.getFood());
 }
    @Override
	public void swim() { 
    	System.out.println(this.getClass().getSimpleName()+ " is swimming");
 }
    public String getType() {
        return type;
    }
}

 class Sloth extends Animal {
    private String type = "Sloth";

    public Sloth(String name, String food, int weight, int sleep, String location) {
        super(name, food, weight, sleep, location);
    }

    public String getType() {
        return type;
    }
}
 
import java.util.Scanner;

public class VirtualPetShelterApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet pet1 = new VirtualPet("Ralfie", "Monkey", 88, 40, 75);
		VirtualPet pet2 = new VirtualPet("Scoobi", "Opossum");
		VirtualPet pet3 = new VirtualPet("Daniel Radcliff", "Sloth", 44, 90, 80);
		
		System.out.println("Welcome to the Franklin County Animal Shelter.");
		System.out.println("This is the status of your pets:");
		System.out.println("Name	|Hunger	|Thirst	|Boredom");
		System.out.println("--------|-------|-------|-------");
		System.out.println("Joey	|83     |34     |23");
		
		//Make a method to not screw up the spacing.
		

	}
}

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	int hunger;
	int thirst;
	int fun;
	
	Map<String,String> pets = new HashMap<>();
	
	public Collection displayPets() {
		return pets.values();
	}
	
	public String findPet(String name) {
		return pets.get(name);
	}
	
	public void intakePet() {
		pets.put(pet.name, pet);
	}
	
	
	
	
}

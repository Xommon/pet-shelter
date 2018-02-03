import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {
	int hunger;
	int thirst;
	int fun;
	
	Map<String,VirtualPet> pets = new HashMap<>();
	
	public Collection displayPets() {
		return pets.values();
	}
	
	public VirtualPet findPet(String name) {
		return pets.get(name);
	}
	
	public void addPet(VirtualPet pet) {
		pets.put(pet.name, pet);
	}
	
	public void removePet(VirtualPet pet) {
		pets.remove(pet.name, pet);
	}
	
	public void feedAllPets() {
		for(Entry<String, VirtualPet> pet: pets.entrySet()) {
			pet.getValue().feed();
		}
	}
	
	public void waterAllPets() {
		for(Entry<String, VirtualPet> pet: pets.entrySet()) {
			pet.getValue().water();
		}
	}
	
	public void playWith(String name) {
		pets.get(name).play();
	}
	
	public void tickAll() {
		for(Entry<String, VirtualPet> pet: pets.entrySet()) {
			pet.getValue().tick();
		}
	}
	
	
	
	
	
//	public void tick() {
//		
//	}
	
	
	
	
}

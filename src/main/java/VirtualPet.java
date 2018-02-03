
public class VirtualPet {
	String name;
	String description;
	int hunger;
	int thirst;
	int fun;

	// Constructor NEED TWO BRUH
	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
		hunger = 75;
		thirst = 80;
		fun = 50;
		
	}
	
	public VirtualPet(String name, String description, int hunger, int thirst, int fun) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.fun = fun;
	}

	//Methods
	public String name() {
		return name;
	}
	
	public int hunger() {
		return hunger;
	}

	public int thirst() {
		return thirst;
	}
	
	public int fun() {
		return fun;
	}
	
	public void feed() {
		hunger += 30;
		thirst -= 8;
	}
	
	public void water() {
		hunger -= 4;
		thirst += 30;
		fun -= 4;
	}
	
	public void play() {
		hunger -= 10;
		thirst -= 5;
		fun += 30;
	}
	
	public void tick() {
		hunger -= 7;
		thirst -= 5;
		fun -= 6;
	}
}

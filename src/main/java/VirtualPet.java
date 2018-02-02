
public class VirtualPet {
	String name;
	String description;
	int hunger = 100;
	int thirst = 100;
	int fun = 100;

	// Constructor
	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

//	public VirtualPet(int hunger, int thirst, int fun) {
//		this.hunger = hunger;
//		this.thirst = thirst;
//		this.fun = fun;
//	}

	//Methods
	public String name() {
		return name;
	}

}

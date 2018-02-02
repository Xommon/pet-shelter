import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	private VirtualPetShelter underTest;
	private VirtualPet pet;
	private static final String petName = "";
	private static final String petDescription = "";
	
	
	@Before
	public void setup() {
		// With the @Before, the arrange part of the test automatically goes into every test
		underTest = new VirtualPetShelter();
		pet = new VirtualPet(petName, petDescription;)
	}
	
	@Test
	public void shouldAddPet() {
		VirtualPet underTest = new VirtualPet();
				
		VirtualPetShelter petShelter = new VirtualPetShelter();
		
		assertEquals(petShelter);
	}
}

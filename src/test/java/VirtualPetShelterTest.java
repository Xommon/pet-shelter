import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	private VirtualPetShelter underTest;
	private VirtualPet pet;
	private static final String petName = "NAME";
	private static final String petDescription = "DESCRIPTION";
	
	@Test
	public void shouldAddPet() {
		VirtualPet underTest = new VirtualPet();
				
		VirtualPetShelter petShelter = new VirtualPetShelter();
		
		assertEquals(petShelter);
	}
}

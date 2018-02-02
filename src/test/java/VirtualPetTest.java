import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VirtualPetTest {
	
	@Test
	public void shouldExistPet() {
		VirtualPet underTest = new VirtualPet("", "");
		
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldExistPetValues() {
		VirtualPet underTest = new VirtualPet(0, 0,0);
		
		assertNotNull(underTest);
	}
	

	
//	@Test
//	public void shouldDisplayPets() {
//		VirtualPet underTest = new VirtualPet();
//		
//		
//		
//		assertEquals(new Collection<>(), underTest);
//	}
	
	
	
}

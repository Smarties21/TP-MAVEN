import static org.junit.Assert.*;

import org.junit.Test;

public class MavenTest {

	@Test
	public void testDivision1() {
		
		Calculatrice test = new Calculatrice();
		int result = test.Division(10, 2);
		assertEquals(5,result);		
		
	}
	


}

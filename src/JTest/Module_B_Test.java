package JTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Module_B_Test {

	@Test
	public void test(){
		
		Module_B module_b = new Module_B();
		
		assertEquals("This should return 2", 2, module_b.return_two());
	}
	
}

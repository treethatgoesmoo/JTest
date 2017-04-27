package JTest;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

public class nextTest {
	  @Test
	  public void f() {
		  assertEquals("This should return 1", 1, 1);
	  }
	  @Test
	  public void f2() {
		  assertEquals("This should return 2", 2, 2);
	  }
	  @Test
	  public void f3() {
		  assertEquals("This should return 1", 3, 4);
	  }
}

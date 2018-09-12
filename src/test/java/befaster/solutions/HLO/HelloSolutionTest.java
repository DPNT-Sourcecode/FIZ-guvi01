package befaster.solutions.HLO;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloSolutionTest {
	
	HelloSolution sut = new HelloSolution();

	@Test
	public void test() {
		assertEquals("Hello, John!",sut.hello("John"));
	}

}

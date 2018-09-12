package befaster.solutions.FIZ;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzSolutionTest {

	FizzBuzzSolution sut = new FizzBuzzSolution();
	@Test
	public void fizzTest() {
		assertEquals("fizz", sut.fizzBuzz(3));
			
	}
	
	public void buzzTest() {
		assertEquals("buzz", sut.fizzBuzz(5));
		
	}
	
	public void fizzBuzzTest() {
		assertEquals("fizz buzz", sut.fizzBuzz(15));
		
	}
	
	public void noneTest() {
		assertEquals("23", sut.fizzBuzz(23));
		
	}
	
	

}

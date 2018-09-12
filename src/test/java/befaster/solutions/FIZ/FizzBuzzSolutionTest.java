package befaster.solutions.FIZ;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzSolutionTest {

	FizzBuzzSolution sut = new FizzBuzzSolution();
	@Test
	public void fizzTestFor3Factor() {
		assertEquals("fizz", sut.fizzBuzz(12));
			
	}
	
	@Test
	public void fizzTestfor3Present() {
		assertEquals("fizz", sut.fizzBuzz(23));
			
	}
	
	@Test
	public void buzzTestFor5Factor() {
		assertEquals("buzz", sut.fizzBuzz(20));
		
	}
	
	@Test
	public void buzzTestFor5Present() {
		assertEquals("buzz", sut.fizzBuzz(52));
		
	}
	
	@Test
	public void fizzBuzzTest() {
		assertEquals("fizz buzz", sut.fizzBuzz(35));
		
	}
	
	@Test
	public void fizzBuzzTest1() {
		assertEquals("fizz buzz", sut.fizzBuzz(546));
		
	}
	
	@Test
	public void noneTest() {
		assertEquals("22", sut.fizzBuzz(22));
		
	}
	
	  

}

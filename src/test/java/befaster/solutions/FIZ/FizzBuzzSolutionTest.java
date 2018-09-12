package befaster.solutions.FIZ;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzSolutionTest {

	FizzBuzzSolution sut = new FizzBuzzSolution();
	@Test
	public void fizzTestFor3Factor() {
		assertEquals("fizz deluxe", sut.fizzBuzz(12));
			
	}
	
	@Test
	public void fizzTestfor3Present() {
		assertEquals("fizz fake deluxe", sut.fizzBuzz(23));
			
	}
	
	@Test
	public void buzzTestFor5Factor() {
		assertEquals("buzz deluxe", sut.fizzBuzz(20));
		
	}
	
	@Test
	public void buzzTestFor5Present() {
		assertEquals("buzz deluxe", sut.fizzBuzz(52));
		
	}
	
	@Test
	public void fizzBuzzTest() {
		assertEquals("fizz buzz fake deluxe", sut.fizzBuzz(35));
		
	}
	
	@Test
	public void fizzBuzzTest1() {
		assertEquals("fizz buzz deluxe", sut.fizzBuzz(546));
		
	}
	
	@Test
	public void noneTest() {
		assertEquals("16", sut.fizzBuzz(16));
		
	}
	
	@Test
	public void fizzBuzzFakeDelux() {
		assertEquals("fizz buzz fake deluxe", sut.fizzBuzz(555));
		
	}
	
	
	
	@Test
	public void delux() {
		assertEquals("fake deluxe", sut.fizzBuzz(47));
		
	}

}

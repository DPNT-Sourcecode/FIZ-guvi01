package befaster.solutions.FIZ;

public class FizzBuzzSolution {

	public String fizzBuzz(Integer number) {

		if(isFizzBuzz(number)  && areAllDigitsIdentical(number))
			return "fizz buzz deluxe";
		else if (isFizzBuzz(number))
			return "fizz buzz";
		else if (number % 3 == 0 || isDigitPresent(number, 3))
			return "fizz";
		else if (number % 5 == 0 || isDigitPresent(number, 5))
			return "buzz";
		else if (number >10 || areAllDigitsIdentical(number))
			return "deluxe";
		else
			return number.toString();

	}
	
	private boolean isFizzBuzz(Integer number) {
		if (number % 15 == 0 
				|| (isDigitPresent(number, 3) && isDigitPresent(number, 5))
				|| (number % 3 == 0 && isDigitPresent(number, 5)) 
				|| (number % 5 == 0 && isDigitPresent(number, 3)))
			return true;
		else
			return false;
		
	}

	private boolean isDigitPresent(Integer x, Integer digit) {
		while (x > 0) {
			if (x % 10 == digit)
				break;
			x = x / 10;
		}

		return x > 0;
	}
	
	private boolean areAllDigitsIdentical(Integer x) {
		return true;
		}

}

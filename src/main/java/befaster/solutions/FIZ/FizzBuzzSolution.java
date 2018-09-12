package befaster.solutions.FIZ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FizzBuzzSolution {

	public String fizzBuzz(Integer number) {
		
		
		if(isFizzBuzz(number)  && number %2 !=0)
			return "fizz buzz fake deluxe";
		else if(isFizzBuzz(number) )
			return "fizz buzz deluxe";
		
		else if ((number % 3 == 0 || isDigitPresent(number, 3))
				&& (number >10  && number %2 !=0))
			return "fizz fake deluxe";
		else if ((number % 3 == 0 || isDigitPresent(number, 3))
				&& (number >10 ))
			return "fizz deluxe";
		else if ((number % 5 == 0 || isDigitPresent(number, 3))
				&& (number >10  && number %2 !=0))
			return "buzz fake deluxe";
		else if ((number % 5 == 0 || isDigitPresent(number, 3))
				&& (number >10 ))
			return "buzz deluxe";
		else if ( number %2 !=0 )
			return "fake deluxe";
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
		Pattern p = Pattern.compile("^(\\d)\\1*$");
		Matcher m = p.matcher(x.toString());
		
		return m.matches();
		}

}

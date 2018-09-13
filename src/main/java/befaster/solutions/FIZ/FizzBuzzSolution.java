package befaster.solutions.FIZ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FizzBuzzSolution {

	public String fizzBuzz(Integer number) {

		if (isFizzBuzz(number) && isDelux(number) && number % 2 != 0)
			return "fizz buzz fake deluxe";
		else if (isFizzBuzz(number) && isDelux(number))
			return "fizz buzz deluxe";
		else if (isFizzBuzz(number))
			return "fizz buzz";
		else if (number % 3 == 0 &&isDigitPresent(number, 3) && number %2 !=0)
			return "fizz fake deluxe";
		else if (number % 3 == 0 &&isDigitPresent(number, 3))
			return "fizz deluxe";
		else if ((number % 3 == 0 || isDigitPresent(number, 3)))
			return "fizz";
		else if (number % 5 == 0 && isDigitPresent(number, 5) && number %2 !=0)
			return "buzz fake deluxe";
		 else if (number % 5 == 0 && isDigitPresent(number, 5))
			return "buzz deluxe";

		else if ((number % 5 == 0 || isDigitPresent(number, 5)))
			return "buzz";

		else
			return number.toString();

	}

	private boolean isFizzBuzz(Integer number) {
		if ((number % 3 == 0 || isDigitPresent(number, 3)) && (number % 5 == 0 || isDigitPresent(number, 5)))
			return true;
		else
			return false;

	}

	private boolean isDelux(Integer number) {
		if (isFizz(number) || isBuzz(number))
			return true;
		else
			return false;

	}

	private boolean isBuzz(Integer number) {
		return number % 5 == 0 && isDigitPresent(number, 5);
	}

	private boolean isFizz(Integer number) {
		return number % 3 == 0 && isDigitPresent(number, 3);
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

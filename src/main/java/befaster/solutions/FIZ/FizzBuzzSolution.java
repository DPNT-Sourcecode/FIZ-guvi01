package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	
    	if(number%15 == 0 || (isDigitPresent(number,3) && isDigitPresent(number,5) ))
    		return "fizz buzz";
    	else if(number%3 == 0 || isDigitPresent(number,3))
    		return "fizz";
    	else if(number%5 == 0 || isDigitPresent(number,5))
    		return "buzz";
    	else
    		return number.toString();

    }
    
    private boolean isDigitPresent(Integer x, Integer digit) {
    	while(x>0) {
    		if(x % 10 == digit)
    			break;
    		x=x/10;
    	}
    	
    	return x >0;
    }
    
    
}

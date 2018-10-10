package userInteractionMidTest;

/** a basic mathematical class to return divisibility checks
 * @author Rob
 *
 */
public class NumberDivisibleChecker {

	/**
	 * @param numberToCheck - the number we want to test against
	 * @return  a boolean indication - positive if not divisible
	 */
	public boolean numberIsNotDivisibleby2(int numberToCheck) {
		return (numberToCheck  % 2 != 0);
	}
	
	/**
	 * @param numberToCheck - the number we want to test against
	 * @return a boolean indication - positive if not divisible
	 */
	public boolean numberIsNotDivisibleby3(int numberToCheck) {
		return (numberToCheck  % 3 != 0);
	}
	
	/** Method to Check to verify a number is not divisible by 3
	 * @param numberToCheck - the number we want to test against
	 * @return a boolean indication - positive if not divisible
	 */
	public boolean numberIsNotDivisibleby5(int numberToCheck) {
		return (numberToCheck  % 5 != 0);
	}
	
	/** Method to Check to verify a number is not divisible by 2 or 3 or 5.
	 * @param numberToCheck - the number we want to test against
	 * @return a boolean indication - positive if not divisible
	 */
	public boolean numberIsNotDivisibleby2or3or5(int numberToCheck) {
		return ((numberToCheck  % 2 != 0) || (numberToCheck % 3 == 0) || (numberToCheck % 5 == 0));
	}
}

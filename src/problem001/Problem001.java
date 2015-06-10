package problem001;

/**
 * Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * Answer: 233168
 * @author Danny Luu
 *
 */
public class Problem001 {

	int firstMultiple;
	int secondMultiple;

	// Default Constructor
	public Problem001() {
		firstMultiple = 3;
		secondMultiple = 5;
	}
	
	// Two Parameter Constructor
	public Problem001(int firstMultiple, int secondMultiple) {
		this.firstMultiple = firstMultiple;
		this.secondMultiple = secondMultiple;
	}
	
	public int sumOfMultiplesBelow(int value) {
		int sum = 0;
		int count = 1;
		
		while (count < value) {
			if (count % firstMultiple == 0 || count % secondMultiple == 0) {
				sum += count;
			}
			++count;
		}
		return sum;
	}
}

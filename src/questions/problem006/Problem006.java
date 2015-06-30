package questions.problem006;

/**
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * Answer: 25164150
 * @author Owner
 *
 */
public class Problem006 {

	/**
	 * Square of a number
	 * @param a
	 * @return
	 */
	private double square(double x) {
		return Math.pow(x, 2);
	}
	
	/**
	 * Sum of squares for the first x numbers.
	 * ex. if x=10,
	 * 1^2 + 2^2 + ... + 10^2 = 385
	 * @param x
	 * @return The sum of all the squares from 1 to x.
	 */
	public double sumOfSquares(double x) {
		double sum = 0;
		for (int i = 1; i <= x; i++) {
			sum += square(i);
		}
		return sum;
	}
	
	/**
	 * The square of the sum from 1 - x
	 * ex. if x = 10
	 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
	 * @param x
	 * @return
	 */
	public double squareOfSum(double x) {
		// Summation Function
		double sum = x * (x + 1) / 2;
		return square(sum);
	}
	
	/**
	 * Find the difference between the sum of the squares of the c natural numbers and the square of the sum
	 * @param x
	 * @return
	 */
	public long differenceBetweenSSO_SOS(double x) {
		Double value = squareOfSum(x) - sumOfSquares(x);
		return value.longValue();
	}
	
	
}

package questions.problem003;

/**
 * Largest prime factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * Answer: 6857
 * @author hisoka
 *
 */
public class Problem003 {
	/**
	 * Tests if a number is prime by iterating through each number and checking the modulus.
	 * @param x
	 * @return true if prime
	 */
	public boolean isPrime(long x) {
		for (int i = 2; i < x; i++) {
			if (x%i == 0)
				return false;
		}
		return true;
	}

	/**
	 * Tests if a number is prime in a more efficient manner.
	 * @param x
	 * @return
	 */
	public boolean isPrime2(long x) {
		// Check if n is a multiple of 2
		if (x%2 == 0) {
			return false;
		}
		
		// If not check the odd numbers
		for (int i = 3; i*i <= x; i+=2) {
			if (x%i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns the largest prime factor for any given number.
	 * @param x
	 * @return
	 */
	public long largestPrimeFactor(long x) {
		long temp = (long) Math.sqrt(x);
		for (long i = temp; i >= 2; i--) {
			if (isPrime2(i) && (x % i == 0)) {
				return i;
			}
		}
		// Invalid result
		return -1;
	}
}

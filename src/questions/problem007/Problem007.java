package questions.problem007;
import questions.problem003.Problem003;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 * Answer: 104743

 * @author Danny Luu
 *
 */
public class Problem007 {
	
	private Problem003 problem003 = new Problem003();
	
	/**
	 * Fuction returning the X'th prime number in the series.
	 * 2, 3, 5 are the first three prime numbers.
	 * @param x
	 * @return the x'th prime number
	 */
	public int primeOf(int x) {
		int count = x;
		int temp = 1;
		int value = 0;
		
		while (count != 1) {
			temp++;
			if (problem003.isPrime2(temp)) {
				count--;
			}
		}
		return temp;
	}
}

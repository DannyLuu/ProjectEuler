package questions.problem004;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * Answer: 906609
 * @author hisoka
 *
 */
public class Problem004 {
	// Uninitialized Variable
	StringBuilder builder;
	
	/**
	 * This function will test of the string is a palindrome or not.
	 * @param s
	 * @return
	 */
	public boolean isPalendrome(String s) {
		int length = s.length();
		String head;
		String tail;
		
		// String is of even length
		if (length % 2 == 0) {
			builder = new StringBuilder(s.substring(length/2, length));
			head = s.substring(0, length/2);
			tail = builder.reverse().toString();
			if (head.equalsIgnoreCase(tail)) {
				return true;
			}
		}
		
		// String is of odd length
		builder = new StringBuilder(s.substring(length/2 + 1, length));
		head = s.substring(0, length/2);
		tail = builder.reverse().toString();
		if (head.equalsIgnoreCase(tail)) {
			return true;
		}
		
		return false;
	}
	
	public int largestPalindromFromProductOfXNums(int x) {
		int largestValue = (int) Math.pow(10, x) - 1;
		Integer current = 0;
		Integer largestPalindrome = 0;
		for (int i = 1; i < largestValue; i++) {
			for (int j = 1; j < largestValue; j++) {
				current = i * j;
				if (isPalendrome(current.toString()) && largestPalindrome < current) {
					largestPalindrome = current;
				}
			}
		}
		return largestPalindrome;
	}
}

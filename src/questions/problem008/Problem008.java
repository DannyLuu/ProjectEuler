package questions.problem008;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 * 
 * 73167176531330624919225119674426574742355349194934
 * 96983520312774506326239578318016984801869478851843
 * 85861560789112949495459501737958331952853208805511
 * 12540698747158523863050715693290963295227443043557
 * 66896648950445244523161731856403098711121722383113
 * 62229893423380308135336276614282806444486645238749
 * 30358907296290491560440772390713810515859307960866
 * 70172427121883998797908792274921901699720888093776
 * 65727333001053367881220235421809751254540594752243
 * 52584907711670556013604839586446706324415722155397
 * 53697817977846174064955149290862569321978468622482
 * 83972241375657056057490261407972968652414535100474
 * 82166370484403199890008895243450658541227588666881
 * 16427171479924442928230863465674813919123162824586
 * 17866458359124566529476545682848912883142607690042
 * 24219022671055626321111109370544217506941658960408
 * 07198403850962455444362981230987879927244284909188
 * 84580156166097919133875499200524063689912560717606
 * 05886116467109405077541002256983155200055935729725
 * 71636269561882670428252483600823257530420752963450
 * 
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 * Answer: 23514624000
 * @author Owner
 *
 */
public class Problem008 {
	private File file;
	private List<String> allLines = new ArrayList<String>();
	
	/**
	 * Default Constructor
	 */
	public Problem008() {
		file = new File("src/questions/problem008/map_of_numbers.txt");
	}
	
	/**
	 * Single argument constructor for other files
	 * @param file
	 */
	public Problem008(String file) {
		this.file = new File(file);
	}

	/**
	 * Reads all of the lines in the file and returns the full string
	 * @return
	 * @throws IOException
	 */
	 public String readAllLines() throws IOException {
		StringBuilder word = new StringBuilder();
		allLines =  Files.readAllLines(file.toPath());
		String fullString;
		for (String s : allLines) {
			word.append(s);
		}
		fullString = word.toString();
		return fullString;
	 }
	 
	 /**
	  * The main function of this problem. It will 
	  * @param length
	  * @param input
	  * @return
	  */
	 public BigInteger maxNumberOfLength(int length, String input) {
		 BigInteger maxValue = new BigInteger("0");
		 int inputLength = input.length();
		 BigInteger value;
		 for (int i = 0; length + i <= inputLength; i++) {
			 value = new BigInteger("1");
			 for (int j = 0; j < length; j++) {
				 BigInteger bigInteger = new BigInteger(input.substring(i+j,i+j+1));
				 if (bigInteger.equals(BigInteger.ZERO)) {
					 break;
				 }
				 value = value.multiply(bigInteger);
			 }
			 if (maxValue.compareTo(value) == -1) {
				 maxValue = value;
			 }
		 }
		 
		 return maxValue;
	 }
	 
	 /**
	  * Used to run problem008
	  * @param length
	  * @return
	  * @throws IOException
	  */
	 public String greatestProduct(int length) {
		 try {
			 return maxNumberOfLength(length, readAllLines()).toString();
		 } catch (IOException e) {
			 System.out.println(e);
			 System.out.println("I/O Exception!");
			 return null;
		 }
	 }
}

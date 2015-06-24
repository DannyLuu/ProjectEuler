import java.util.Scanner;

import questions.problem001.Problem001;
import questions.problem002.Problem002;
import questions.problem003.Problem003;
import questions.problem004.Problem004;

/**
 * 
 * @author Danny Luu
 *
 */
public class ProjectEulerApplication {

	public static void main(String[] args) {
		
		// Number of completed questions
		int numOfQuestions = 4;
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String problem = null;

		do {
			System.out.println("What problem would you like to see?");
			System.out.println("Options: 1 - " + numOfQuestions);
			System.out.println("Q - quit");
			problem = in.nextLine();
			
			System.out.println("\nYou entered: " + problem);
			switch (problem) {
			case "1":
				Problem001 problem001 = new Problem001();
				System.out.println(problem001.sumOfMultiplesBelow(1000));
				System.out.println();
				break;

			case "2":
				Problem002 problem002 = new Problem002();
				System.out.println(problem002.sumOfEvenFibNumbersUnderMaxValue());
				System.out.println();
				break;
			
			case "3":
				Problem003 problem003 = new Problem003();
				System.out.println(problem003.largestPrimeFactor(600851475143L));
				System.out.println();
				break;
			
			case "4":
				Problem004 problem004 = new Problem004();
				System.out.println(problem004.largestPalindromFromProductOfXNums(3));
				System.out.println();
				break;
			case "q":
				System.out.println("Quiting...");
				break;
			case "Q":
				System.out.println("Quiting...");
				break;
			default:
				System.out.println("ERROR: " + problem + " is not a valid entry!\n");
				break;
			}
		} while  (!problem.equalsIgnoreCase("q"));
		
		// Closing I/O stream
		in.close();
		
	}

}

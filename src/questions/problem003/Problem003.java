package questions.problem003;

/**
 * Largest prime factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * @author hisoka
 *
 */
public class Problem003 {
//	SortedSet<Integer> pFactors = new TreeSet<Integer>();
//    
//    int largestPrimeFactor(long x)  {
//        for(int i = 2; i < Math.sqrt(x); i++)    {
//            if (x % i == 0 && checkPrime(i) == true)    {
//                pFactors.add(i);
//                largestPrimeFactor(x/i);
//            }
//        }
//        return pFactors.last();
//    }
//     
//     
//    boolean checkPrime(double x)    {
//        if (x < 2)
//            return false;
//         
//        for(int i = 2; i < x; i++)   {           
//            if (x % i == 0)
//                return false;
//        }
//         
//        return true;
//    }
//     
//    void printPrimeFactors()    {
//        Iterator<Integer> it = pFactors.iterator();
//         while(it.hasNext())    {
//             System.out.println(it.next());
//         }
//         
//    }
// 
//    public static void main(String[] args) {
//        problem003 p = new problem003();        
//         
//        // Testing the prime checking function using the values from 0 - 1000
//        int counter = 0;
//        System.out.println("Testing the checkPrime function for values under 1000");
//        for (int i = 0; i < 1000; i++)   {
//            if (p.checkPrime(i) == true)    {
//                counter++;
//                System.out.print(i + ", ");
//                 
//                if (counter % 10 == 0)
//                    System.out.println();
//            }               
//        }
//         
//        long test = 600851475143L;
//        // Testing out the largest prime factor function
//        System.out.println("\n\nTesting - Largest Prime Factor function with the number 600851475143");
//        System.out.println(p.largestPrimeFactor(test));
//         
//        // Testing the SortedSet iterator
//        System.out.println("\nTesting the SortedSet iterator");
//        p.printPrimeFactors();
//        System.out.println("\nTailSet from 0");
//        System.out.println(p.pFactors.tailSet(0));
//         
//    }
}

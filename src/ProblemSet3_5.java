/**
 * INSTRUCTIONS.
 * 
 * The following exercises are, perhaps, more mathematically inclined than previous
 * problem sets. While they might be challenging, they are certainly doable.
 * 
 * You can (and should!) solve each of them using only the operators, conditional control
 * structures, and iterative control structures we've covered. You are not permitted to use
 * recursive code in your solutions.
 * 
 * Please be mindful of the expected outputs, as your code will be tested against that
 * directly. If you're unsure, please ask for clarification.
 * 
 * This problem set is worth 25 points and is due no later than 11:59pm on October 28, 2018.
 */

public class ProblemSet3_5 {
	
	public static void main(String[] args) {
		ProblemSet3_5 ps = new ProblemSet3_5();

		ps.primes(1, 1000);
	}
	
	/**
	 * How many prime numbers are there between @start and @end, where @start and @end
	 * are positive integers in the range [1, @Integer.MAX_VALUE]?
	 * 
	 * Print your solution in the following formats: "There is X prime number."
	 *                                               "There are X prime numbers."
	 * 
	 * @param start
	 * @param end
	 */
	
	public void primes(int start, int end) {
		boolean isPrime = true;
		int k;
		int count = 0;
		if (start == 1 || start == 0) {
			isPrime = false;
		}
		for(int i = 2;i <= start /2; i++)
		{
	           k= start % i;
	           if(k == 0) {
	        	   isPrime = false;
	        	   break;
	           }
	           else {
	        	   count += 1;
	           }
		}
		if((isPrime) && (count == 1)) {
			System.out.println("There is 1 prime number.");
		}
		else if ((isPrime) && (count > 1)) {
		   System.out.println("There are " + count + " prime numbers.");
        	}
        }

	
	
	/**
	 * What are the next @count leap years?
	 * 
	 * Print your solution in the following formats: "The next leap year is X."
	 *                                               "The next 2 leap years are X and Y."
	 *                                               "THe next N leap years are A, ..., X, Y, and Z."
	 * 
	 * @param count
	 */
	
	public void leapYears(int count) {
		
	}
	
	/**
	 * Is @number a palindromic number?
	 * 
	 * Print your solution in the following formats: "X is a palindromic number."
	 *                                               "X is not a palindromic number."
	 *                                               
	 * @param number
	 */
	
	public void palindromicNumbers(int number) {
		
	}
	
	/**
	 * What is the @nth Fibonacci number, where @n is a positive integer?
	 * 
	 * Print your solution in the following formats: "The 21st Fibonacci number is X."
	 *                                               "The 22nd Fibonacci number is X."
	 *                                               "The 23rd Fibonacci number is X."
	 *                                               "The 24th Fibonacci number is X."
	 *                                               
	 * @param n
	 */
	
	public void fibonacci(int n) {
		
	}
	
	/**
	 * What is the sum of all multiples of @x and @y less than @limit, where @x, @y, and
	 * @limit are positive integers?
	 * 
	 * Print your solution in the following format: "The sum of all multiples of X and Y less than LIMIT is Z."
	 * 
	 * @param limit
	 */
	
	public void multiples(int x, int y, int limit) {
		
	}
}

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
		ps.leapYears(3);
		ps.palindromicNumbers(123456);
		ps.fibonacci(21);
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
		int count = 0;
		for(int i = start;i <= end; i++)
		{
			boolean isPrime = true;
			int k;
			if (i==1 || i == 0) {
				isPrime = false;
			}
			for(int j = 2;j <= i/2; j++)
			{
		           k= i % j;
		           if(k == 0) {
		        	   isPrime = false;
		        	   break;
		           }
			}
			if(isPrime) {
				count++;
			}

		}
		if(count == 1) {
			System.out.println("There is 1 prime number.");
		}
		else if (count != 1) {
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
		if (count <= 0) {
			System.out.println("I don't know how to compute the next " + count + "leap years");
		}
		else if (count == 1) {
			System.out.println("The next leap year is 2020.");
		}
		else if (count == 2) {
			System.out.println("The next two leap years are 2020 and 2024.");
		}
		int year = 2016;
		int nom = 0;
		while(nom < count) {
			year += 4;
			if ((year % 100 == 0) && (year % 400 != 0)) {
				year +=4;
			nom++;
		}
		if (nom == count) {
			System.out.print("and" + year + " .");
		}
		else {
			System.out.print(year + ", ");
		}
		}
		System.out.println("");
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
		int nNum = number;
		int revNum = 0;
		while (nNum != 0) {
			revNum = revNum * 10;
			revNum = revNum + nNum % 10;
			nNum = nNum/10;
		}
		System.out.print(revNum);
		if (revNum == nNum) {
			System.out.println(nNum + " is a palindromic number.");
		}
		else {
			System.out.println(nNum + " is not a palindromic number.");
			} 
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
		long before = 1;
		long curVal = 1;
		long next;
		int count = n-2;
		
		while (count > 0) {
			next = before + curVal;
			before = curVal;
			curVal = next;
			count--;
		}
		String ending;
		switch ((n / 10 ==1) ? n : n % 10) {
		case 1:
			ending = "st";
			break;
		
		case 2:
			ending = "nd";
			break;
		
		case 3:
			ending = "rd";
			break;
			
		default:
			ending = "th";
		}
		System.out.println("The " + n + ending + " Fibonacci number is " + curVal + ".");
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
		int sum = 0;
		for (int i = 0;i < limit; i++) {
			sum += (i % x == 0 || i % y == 0) ? i : 0;
		}
		System.out.println("The sum of all multiples of " + x + "and" + y + " is less than "+ limit + "is " + sum + ".");
	}
}

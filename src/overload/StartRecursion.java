package overload;
/**
<h1>Class</h1>
* <p>
* This is the Start Recursion class that contains a recursive function using an if statement. Recursive means it calls upon itself.
* </p>
*/
public class StartRecursion {

	public static void main(String[] args) {
		int n = 5;
		recurse(n);
		System.out.println("");
		n = 0;
		recurseUp(n);
		System.out.println("");
		int startValue = 0;
		int stopValue = 50;
		recurseEvens(startValue, stopValue);

	}
	/**
	 * Display a decrease of n by one every time the method is called upon by itself (recursed)
	 * @param n
	 */
	private static void recurse(int n) {
		System.out.println("recurse value is " + n + " on this recursion pass");
		n--;
		if (n>=0) {
			recurse(n);
		}
		
	}
	/**
	 * Display an increase of n by one every time the method is recursed
	 * @param n
	 */
	private static void recurseUp(int n) {
		System.out.println("recurseUp value is " + n + " on this recursion pass");
		n++;
		if (n<=10) {
			recurseUp(n);
		}
		
	}
	/**
	 * Display even numbers from startValue inclusive
	 * to stopValue exclusive
	 * @param startValue
	 * @param stopValue
	 */
	private static void recurseEvens(int startValue, int stopValue) {
		System.out.println("recurseEvens value is " + startValue);
		startValue +=2;
		if (startValue<=stopValue) {
			recurseEvens(startValue, stopValue);
		}
	}

}

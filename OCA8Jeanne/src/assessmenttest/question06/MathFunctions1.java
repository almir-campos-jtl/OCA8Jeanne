package assessmenttest.question06;

public class MathFunctions1
{
	// Bonus - Part 1
	static int a = 15;
	public static void main( String[] args )
	{
		int b = 10;
		MathFunctions1.addToInt( a, b );
		System.out.println(a); // What's the result?
	}

	private static void addToInt( int x, int amountToAdd )
	{
		x = x + amountToAdd; //the reference to x is not the reference to a
		// Bonus - Part 2
		a = a + x;
	}
}


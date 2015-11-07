package assessmenttest.question06;

public class MathFunctions
{
	public static void main( String[] args )
	{
		int a = 15;
		int b = 10;
		MathFunctions.addToInt( a, b );
		System.out.println(a);
	}

	private static void addToInt( int x, int amountToAdd )
	{
		x = x + amountToAdd; //the reference to x is not the reference to a
	}

}

// B
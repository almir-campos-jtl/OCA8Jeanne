package assessmenttest.question17;

import java.util.function.Predicate;

public class Question17
{
	public static void main( String[] args )
	{
		System.out.println(test( i -> i == 5 ) );						// Option A
		//System.out.println(test( i -> {i == 5;} ) );					// Option B //Doesn't compile
		System.out.println(test( (i) -> i == 5 ) );						// Option C
		//System.out.println(test( (int i) -> i == 5 ) );				// Option D	//Doesn't compile
		//System.out.println(test( (int i) -> { return i == 5; } ) );		// Option E	//Doesn't compile
		System.out.println(test( (i) -> { return i == 5; } ) );			// Option F
	}
	
	private static boolean test(Predicate<Integer> p )
	{
		return p.test(5);
	}
}

// A, C, F
package assessmenttest.question07;

import java.util.ArrayList;
import java.util.List;

public class Question07
{

	public static void main( String[] args )
	{
		int[] array = { 6, 9, 8 };
		List<Integer> list = new ArrayList();
		list.add( array[0] );
		list.add( array[2] );
		list.set( 1, array[ 1 ] ); //Be careful here
		list.remove( 0 );
		System.out.println( list );
		// Bonus
		addElement( list, array );
		System.out.println( list );
	}
	
	// Bonus
	// public void addElement( List<Integer> list, int[] array ) // Causes an error at line 18
	
	// Bonus
	public static void addElement( List<Integer> list, int[] array )
	{
		list.add( array[0] );
		// Compare the result with the Question 06
	}

}

// B
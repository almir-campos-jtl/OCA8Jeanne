package assessmenttest.question04;

public class FeedingSchedule
{

	public static void main( String[] args )
	{
		boolean keepgoing = true;
		int count = 0;
		int x = 3;
		while ( count++ < 3 )
		{
			int y = ( 1 + 2 * count ) % 3;	// Pay attention to the 'count' variable here - what is its value.
			switch( y )
			{
				default: 					// Pay attention here - where is the break?
				case 0: x -= 1; break;
				case 1: x += 5;
			}
		}
		System.out.println( x );
	}

}

// C

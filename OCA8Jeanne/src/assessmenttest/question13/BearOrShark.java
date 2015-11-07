package assessmenttest.question13;

// The only trick about this question has is that it looks more complicated than it actually is.

public class BearOrShark
{
	public static void main( String[] args )
	{
		int luck = 10;
		if ( ( luck > 10 ? luck++ : --luck) < 10 )
		{
			System.out.println("Bear");
		}
		if ( luck < 10 ) System.out.print("Shark");
	}
}

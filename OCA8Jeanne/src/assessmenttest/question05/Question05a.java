package assessmenttest.question05;

public class Question05a
{

	public static void main( String[] args )
	{
		System.out.println("a");
		try
		{
			System.out.println("b");
			throw new RuntimeException();
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("c");
		}
		finally
		{
			System.out.println("d");
		}
		System.out.println("e");
	}

}

// abd + RuntimeException
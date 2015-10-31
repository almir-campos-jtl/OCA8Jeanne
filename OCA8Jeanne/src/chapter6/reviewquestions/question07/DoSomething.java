package chapter6.reviewquestions.question07;

public class DoSomething
{

	public static void main( String[] args )
	{
		new DoSomething().go();
	}
	
	public void go()
	{
		System.out.print("A");
		try
		{
			stop();
		}
		catch (ArithmeticException e)
		{
			System.out.print("B"); // Won't print this because this exception isn't thrown
		}
		finally
		{
			try { Thread.sleep( 500 ); } catch (Exception ex ){  }; // Trick for 'organizing' the output
			System.out.println("C"); // Will be printed
		}
		System.out.print("D"); // Won't print this because the NullPointException isn't handled
	}

	public void stop()
	{
		System.out.print("E");
		Object x = null;
		x.toString();
		System.out.print("F"); // Wont' be printed because the NullPointException isn't handled
	}
	
	// Take a look at the other 'DoSomething' in this package

}

// C
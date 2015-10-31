package chapter6.reviewquestions.question07;

public class DoSomething4
{

	public static void main( String[] args )
	{
		new DoSomething4().go();
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
			System.out.println("C");
		}
		System.out.print("D"); // Won't be printed this because the NullPointException isn't handled
	}

	public void stop()
	{
		System.out.print("E");
		Object x = null;
		try
		{
			x.toString();
		}
		finally
		{
			System.out.println("G"); // Will be printed
		}
		System.out.print("F"); // Won't be printed because the exception isn't handled
	}

}

// C
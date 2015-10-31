package chapter6.reviewquestions.question07;

public class DoSomething2
{

	public static void main( String[] args )
	{
		new DoSomething2().go();
	}
	
	public void go() throws NullPointerException // The throws clause doesn't prevent the exception to be thrown because it's not handled
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
			System.out.print("C");
		}
		System.out.print("D"); // Will print this because the NullPointException is handled
	}

	public void stop()
	{
		System.out.print("E");
		Object x = null;
		x.toString();
		System.out.print("F");
	}

}

// C
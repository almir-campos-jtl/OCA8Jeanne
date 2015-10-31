package chapter6.reviewquestions.question07;

public class DoSomething1
{

	public static void main( String[] args )
	{
		new DoSomething1().go();
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
		catch ( NullPointerException npe ) // Handling the NullPointerException - this makes the "D" be printed
		{
			System.out.print( "G");
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
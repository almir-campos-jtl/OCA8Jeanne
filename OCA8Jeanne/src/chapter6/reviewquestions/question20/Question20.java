package chapter6.reviewquestions.question20;

public class Question20
{

	// @SuppressWarnings("finally") - This will suppress the warning from the 'finally' block
	public static void main( String[] args )
	{
		System.out.print("a");
		try
		{
			System.out.print("b");
			throw new IllegalArgumentException();
		}
		catch (IllegalArgumentException e)
		{
			System.out.print("c");
			throw new RuntimeException("1");
		}
		catch (RuntimeException e) //This block will not be executed because the previous catch block was executed (only one catch is executed per try block)
		{
			System.out.print("d");
			throw new RuntimeException("2");
		}
		finally
		{
			System.out.println("e");
			// This is a trick for making the console separate the 'println'
			// from the exception
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e2)
			{
				e2.printStackTrace();
			}
			throw new RuntimeException("3");
		}

	}

}

// A, E
package chapter6.reviewquestions.question19;

import java.io.*;

public class Question19
{

	public static void main( String[] args )
	{
		try
		{
			System.out.println( "work real hard");
			// 1
			//throw new IOException();
			// 2
			//File file = new File("");
			//FileReader fr = new FileReader( file );
		}
//		catch (Exception e)						// A - Doesn't compile - broader exception
//		catch (IOException ioe)					// B - Doesn't compile - it will compile if 1 or 2 is uncommented
//		catch( IllegalArgumentException iae )	// C - Compiles
//		catch( RuntimeException iae )			// D - Doesn't compile - there is another RuntimeExeption below - Important: this line compiles, the next RTE doesn't compile
		catch( StackOverflowError soe )			// E - Compiles
		{
			// TODO: handle exception
		}
		catch ( RuntimeException rte)
		{
			// TODO: handle exception
		}
	}

}

// C, E
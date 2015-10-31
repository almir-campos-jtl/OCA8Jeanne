package chapter6.reviewquestions.question14;

import java.io.IOException;

public class Quesiton14
{
	public void ohNo() throws IOException
//		, Exception	//1
	{
		System.out.println("it's ok");			// A - Compiles
//		throw new Exception();					// B - Doesn't compile - it's not related to the declared exception. It will compile if '//1' is uncommented
//		throw new IllegalArgumentException();	// C - Compiles - Unchecked exceptions aren't required to be declared
//		throw new java.io.IOException();		// D - Compiles - Checked exception that is declared on the method signature
												//     Important: if the option C is uncommented the option D won't compile - Unreachable code.
												//                Take a look a the the method ohYes() below to see how to overcome this problem
		throw new RuntimeException();			// E - Doesn't compile - broader exception
												//     Important: if C or E are uncommented this option doesn't compile - unreachable code
	}
	
	//More bonuses
	public void ohYes() throws IOException
	{
		try
		{
			throw new java.io.IOException();
		}
		catch ( java.io.IOException e )
		{
			//
		}
		throw new RuntimeException();
	}
}

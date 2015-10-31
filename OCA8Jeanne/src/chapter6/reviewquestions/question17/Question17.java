package chapter6.reviewquestions.question17;

public class Question17
{

}

class HasSoreThroatException extends Exception{}

class TiredException extends RuntimeException{}

interface Roar
{
	void roar() throws HasSoreThroatException;
}
class Lion implements Roar
{
	public void roar() {};									// A - Compiles - Can have less exceptions then the signature
//	public void roar() throws Exception {};					// B - Doesn't compile 	
//	public void roar() throws HasSoreThroatException {};	// C - Compiles - matches the signature
//	public void roar() throws IllegalArgumentException {};	// D - Compiles	- Runtime Exception
//	public void roar() throws TiredException {};			// E - Compiles	- Runtime Exception
}
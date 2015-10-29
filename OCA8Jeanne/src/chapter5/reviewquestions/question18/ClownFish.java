package chapter5.reviewquestions.question18;

public class ClownFish implements Aquatic{
	public String getNumberOfGills() //Compiles - overloading
	{
		return "4";
	}
	public String getNumberOfGills( int input ) //Doesn't compile - Neither overloding (same signature), nor overriding (incompatible return type)
	{
		return "6";
	}
	
	public static void main( String[] args )
	{
		System.out.println( new ClownFish().getNumberOfGills(-1));
	}

}

interface Aquatic{
	public default int getNumberOfGills( int input)
	{
		return 2;
	}
}

// E
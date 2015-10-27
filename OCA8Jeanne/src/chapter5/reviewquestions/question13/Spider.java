package chapter5.reviewquestions.question13;

public class Spider extends Arthropod{

	public void printName( int input )
	{
		System.out.println("Spider");
	}
	public static void main(String[] args) {
		Spider spider = new Spider();
		spider.printName( 4 ); // From Spider
		spider.printName( 9.0 ); //From Arthropod //Here is the trap: the printName method is overloaded (not overridden)
	}
}

class Arthropod{
	public void printName( double input )
	{
		System.out.println( "Arthopod");
	}
}
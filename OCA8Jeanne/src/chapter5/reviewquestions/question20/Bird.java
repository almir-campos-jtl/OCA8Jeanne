package chapter5.reviewquestions.question20;

public abstract class Bird {
	private void fly() // This method is visible only on Bird (can be hidden, not overridden)
	{
		System.out.println("Bird is flying");
	}
	public static void main( String[] args )
	{
		Bird bird = new Pelican();
		bird.fly();
		//Bonus
		Pelican pelican = new Pelican();
		pelican.fly();
		//
		Bird pelican1 = (Pelican) bird;
		pelican1.fly();
	}
}

class Pelican extends Bird
{
	protected void fly()
	{
		System.out.println("Pelican is flying");
	}
}

// A
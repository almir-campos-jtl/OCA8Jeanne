package chapter5.reviewquestions.question16;

abstract class Reptile{
	public void layEggs() { System.out.println("Reptile laying eggs"); } //1)
	//public final void layEggs() { System.out.println("Reptile laying eggs"); } // 2)
	public static void main( String[] args ) //Bonus: you can't run this method because the class isn't public.
	{
		Reptile reptile = new Lizard();
		reptile.layEggs();
	}
}

public class Lizard extends Reptile {
	public void layEggs(){ System.out.println("Lizard laying eggs"); } // Compiles with 1) but doesn't compile with 2)
}

// Take a look at Lizard1 and Reptile1

// E
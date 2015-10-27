package chapter5.reviewquestions.question16;

public abstract class Reptile1{
	public void layEggs() { System.out.println("Reptile laying eggs"); } //1)
	//public final void layEggs() { System.out.println("Reptile laying eggs"); } // 2)
	public static void main( String[] args ) //Bonus: you can't run this method because the class isn't public.
	{
		//Reptile1 reptile = new Reptile1(); //Bonus: Reptile1 cannot be instantiated because it's abstract.
		Reptile1 reptile = new Lizard1();
		reptile.layEggs();
	}
}

// E
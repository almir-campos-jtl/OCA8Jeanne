package assessmenttest.question03;

public class Cougar1 extends Puma1
{

	public static void main( String[] args )
	{
		//Puma1 puma1 = new Puma1(); // Doesn't compile - Puma cannot be instantiated
		Puma1 puma1 = new Cougar1();
		System.out.println(puma1.getTailLength());
		Cougar1 cougar1 = new Cougar1();
		System.out.println( cougar1.getTailLength());
		System.out.println(cougar1.getTailLength(1000)); //The getTailLength(int length) is an overload!
	}
	
	public int getTailLength( int length ) { return 2; }
}

abstract class Puma1 implements HasTail1{
	public int getTailLength() { return 4; } //Compiles
	//protected int getTailLength() { return 4; }	//Doesn't compile - protected' is more restrictive than the implicit 'public' access modifier on the interface.
}

interface HasTail1{
	int getTailLength();
}

// Output: 4, 4, 2
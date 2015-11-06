package assessmenttest.question03;

public class Cougar extends Puma
{

	public static void main( String[] args )
	{
		Puma puma = new Puma(); //Doesn't compile - Puma is an abstract type
		System.out.println(puma.getTailLength());
	}
	
	public int getTailLength( int length ) { return 2; }
}

abstract class Puma implements HasTail{
	//public int getTailLength() { return 4; } //Compiles
	protected int getTailLength() { return 4; }	//Doesn't compile - protected' is more restrictive than the implicit 'public' access modifier on the interface.
}

interface HasTail{
	int getTailLength();
}


// C, D, E
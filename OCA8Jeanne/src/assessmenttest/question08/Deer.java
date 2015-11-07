package assessmenttest.question08;

public class Deer
{
	public Deer()
	{
		System.out.print("Deer");
	}
	
	public Deer( int age )
	{
		System.out.print("DeerAge");
	}
	
	private boolean hasHorns()	// The trick is here: 'private' - It's not overridden! It's a hidden method.
								// When a hidden method is referenced in the parent class, the parent version is used. (Memorize that!)
	{
		return false;
	}
	
	public static void main( String[] args )
	{
		Deer deer = new Reindeer(5);
		System.out.println(","+ deer.hasHorns() );
		// Bonus 1
		Reindeer reindeer = new Reindeer(5);
		System.out.println(","+ reindeer.hasHorns() );
		// Bonus 2
		Deer deer1 = (Deer) reindeer;
		System.out.println(","+ deer1.hasHorns() );
	}

}

class Reindeer extends Deer
{
	public Reindeer( int age )
	{
		System.out.print("Reindeer");
	}
	
	public boolean hasHorns()
	{
		return true;
	}
}

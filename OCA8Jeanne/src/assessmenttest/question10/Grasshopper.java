package assessmenttest.question10;

public class Grasshopper
{
	public Grasshopper( String n )
	{
		name = n;
	}
	
	public static void main( String[] args )
	{
		Grasshopper one = new Grasshopper("g1");
		Grasshopper two = new Grasshopper("g2");
		one = two;	// The value "g1" is lost; then eligible for the GC. The object 'one' points to "g2".
		two = null;	// The value "g2" isn't lost because 'one' is still pointing to it. 
		one =null;	// Finally, the object 'one' isn't pointing to "g2" anymore. Then, 'g2' is lost.
	}
	
	private String name;
}

// C, D, F

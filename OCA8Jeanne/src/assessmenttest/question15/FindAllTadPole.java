package assessmenttest.question15;

import java.util.ArrayList;
import java.util.List;

public class FindAllTadPole
{
	public static void main( String[] args )
	{
		List<Tadpole> tadpoles = new ArrayList<Tadpole>();
		for ( Amphibian amphibian : tadpoles )	// Notice that each tadpole will be cast to 'Amphibian'. That's the key point.
		{
			//CanSwim	tadpole = amphibian;			// Compiles (Option A)
			//Amphibian	tadpole = amphibian;			// Compiles (Option C)
			//Tadpole 	tadpole = amphibian;			// Doesn't compile (requires explicit casting)
			//Tadpole 	tadpole = (Tadpole) amphibian;	// Extra - compiles because of the explicit casting
			Object tadpole = amphibian;					// Compiles (Option E)
		}
	}
}

interface CanSwim
{}

class Amphibian implements CanSwim
{}

class Tadpole extends Amphibian
{}
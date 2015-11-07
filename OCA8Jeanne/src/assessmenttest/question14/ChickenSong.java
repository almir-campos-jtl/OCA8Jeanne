package assessmenttest.question14;

import java.util.ArrayList;
import java.util.List;

public class ChickenSong
{

	public static void main( String[] args )
	{
		HenHouse house = new Xicken();
		Chicken chicken = house.getChickens().get(0);
		for ( int i = 0; i < house.getChickens().size(); i++ )
		{
			//System.out.println("Chicken/Before: " + house.getChickens().get(i) ); //Same object as 'After'
			chicken = house.getChickens().get(i++);	
			//System.out.println("Chicken/After : " + chicken); //Same object as 'Before'
			System.out.println("Cluck");
		}
	}

}

class Chicken{}
interface HenHouse
{
	public java.util.List<Chicken> getChickens();
}


// Bonus
class Xicken implements HenHouse
{
	private List<Chicken> chickens = new ArrayList();
	
	public Xicken()
	{
		// The trick is in the next block.
		// If 'list' is empty		-> Exception error (Option E)
		// If 'list' has 1 or 2		-> Will output 'Cluck' exactly once (Option D)
		// It 'list' has 2 or more	-> Will output 'Cluck' more then once (Option C)
		chickens.add( new Chicken() );
		chickens.add( new Chicken() );
		chickens.add( new Chicken() );
	}

	@Override
	public List<Chicken> getChickens()
	{
		return chickens;
	}
	
}
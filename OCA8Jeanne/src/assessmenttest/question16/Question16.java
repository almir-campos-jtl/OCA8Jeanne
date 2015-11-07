package assessmenttest.question16;

public class Question16
{

}

// Notice that removing the 'default' modifier and the method implementation from Animal and  Mammal (leaving only the getName method signature) will make the code compile (Option D).

interface Animal
{
	public default String getName()
	{
		return null;
	}
}

interface Mammal
{
	public default String getName()
	{
		return null;
	}
}

abstract class Otter implements Mammal, Animal
{
	public abstract String getName(); // Compiles (Option F)
	/*
	public String getName() // Compiles (Option G)
	{
		return null;
	}
	*/
}

//D, F, G
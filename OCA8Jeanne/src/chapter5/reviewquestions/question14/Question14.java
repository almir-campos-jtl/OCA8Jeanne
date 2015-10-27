package chapter5.reviewquestions.question14;

public class Question14 {
	public static void main( String[] args)
	{
		
	}
}

interface HasVocalCords{
	public abstract void makeSound();
}

interface CanBark extends HasVocalCords{
	public void bark();
}

class Class1 implements HasVocalCords{
	// It's not overriding; only implementing
	public void makeSound()
	{
		
	}
	
	//@Override - Doesn't override anything. This could be a test (adding/removing the @Override) to know if a method is overriding another one.
	public void other()
	{
		
	}
}

class Class2 implements CanBark{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		
	}
	
}


// C
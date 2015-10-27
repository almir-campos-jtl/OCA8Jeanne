package chapter5.reviewquestions.question12;

public class Owl implements Nocturnal, Nocturnal1{

	public boolean isBlind() { return false; } //This one overrides the default implementation and is 'lost
	
	public static void main(String[] args) {
		Nocturnal nocturnal = (Nocturnal) new Owl();
		//Nocturnal nocturnal = new Owl(); //This also compiles
		System.out.println( nocturnal.isBlind() );
		// BONUS
		Owl owl = new Owl();
		System.out.println( owl.isBlind() );
		//
		System.out.println( new Owl().isTrue() );
	}
}

interface Nocturnal{
	default boolean isBlind() { return true; }
}

// BONUS
interface Nocturnal1{
	default boolean isTrue() { return true; }
}
package chapter5.reviewquestions.question03;

public class Frog implements CanHop{

	public static void main(String[] args) {
		Frog frog = new TurtleFrog(); // A TurtleFrog is a type of Frog
		TurtleFrog frog1 = new TurtleFrog();// A TurtleFrog is a TurtleFrog
		//BrazilianHornedFrog frog2 = new TurtleFrog(); //Error: A BrazilianHornedFrog isn't a TurtleFrog; a TurtleFrog isn't a type of BraziliaTurtleFrog
		CanHop frog2 = new TurtleFrog();
		Object frog3 = new TurtleFrog();
		//Long??? // Error: self-explanatory;
		
		// Bonus
		BrazilianHornedFrog bhf = (BrazilianHornedFrog) new Frog(); //Explicit casting
		Frog bhf1 = new BrazilianHornedFrog();
		CanHop bhf2 = new BrazilianHornedFrog();
	}

}

interface CanHop{}
class BrazilianHornedFrog extends Frog{}
class TurtleFrog extends Frog{}

// A, B, D, E

package chapter5.reviewquestions.question03;

public class Frog implements CanHop{

	public static void main(String[] args) {
		Frog frog = new TurtleFrog(); // A TurtleFrog is a type of Frog
		TurtleFrog frog1 = new TurtleFrog();// A TurtleFrog is a TurtleFrog
		//BrazilianHornedFrog frog2 = new TurtleFrog(); //Error: A BrazilianHornedFrog isn't a TurtleFrog; a TurtleFrog isn't a type of BraziliaTurtleFrog
		CanHop frog2 = new TurtleFrog();
		Object frog3 = new TurtleFrog();
		//Long??? // Error: self-explanatory;
		
		// BONUS
		//BrazilianHornedFrog bhf = new Frog(); //Doesn't compile
		//BrazilianHornedFrog bhf1 = (BrazilianHornedFrog) new Frog(); //Explicit casting - Compiles OK, but throws an error at Runtime. - Frog isnt a type of BrazilianHornedFrog
		
		Frog bhf2 = new BrazilianHornedFrog();
		//BrazilianHornedFrog bhf3 = bhf2; // Doesn't compile
		BrazilianHornedFrog bhf4 = (BrazilianHornedFrog) bhf2; //Compiles - Explicit casting
		
		Frog bhf5 = new BrazilianHornedFrog();
		CanHop bhf6 =  new BrazilianHornedFrog();
	}

}

interface CanHop{}
class BrazilianHornedFrog extends Frog{}
class TurtleFrog extends Frog{}

// A, B, D, E
// Casting - Kind of promise to the JVM

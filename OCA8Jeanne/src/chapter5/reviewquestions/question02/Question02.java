package chapter5.reviewquestions.question02;

public class Question02 {

	public static void main(String[] args) {
		new Mammal(5); //Prints "Mammal"
		// Bonus - It prints "Mammal" \n "Platypus"
		new Platypus();
	}

}

class Mammal{
	public Mammal( int age ){
		System.out.println("Mammal");
	}
}

class Platypus extends Mammal{
	public Platypus(){
		super(5); //If this is missing it doesn't compile.
		System.out.println( "Platypus");
	}
	
}

//E

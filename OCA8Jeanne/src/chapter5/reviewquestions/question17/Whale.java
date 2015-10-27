package chapter5.reviewquestions.question17;

public abstract class Whale {
	
	//public abstract void dive(); // Compiles
	public abstract void dive(){}; // Doesn't compile

	public static void main(String[] args) {
		Whale whale = new Orca();
		whale.dive();
	}

}

class Orca extends Whale{

	@Override
	public void dive() {
		System.out.println("Orca diving");
	}
	
}

// B
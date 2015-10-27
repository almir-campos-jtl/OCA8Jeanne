package chapter5.reviewquestions.question06;

public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface HasExoskeleton{
	abstract int getNumberOfSections();
}

abstract class Insect implements HasExoskeleton{
	abstract int getNumberOfLegs();
}

class Beetle extends Insect{
	int getNumberOfLegs()
	{
		return 6;
	}
	
	//public int getNumberOfSections() // Will compile
	int getNumberOfSections() // Won't compile - it reduces the visibility of the inherited method;
							  // This is tricky because you have to remember that in an interface the methods are public by default.
	{
		return 3;
	}
}
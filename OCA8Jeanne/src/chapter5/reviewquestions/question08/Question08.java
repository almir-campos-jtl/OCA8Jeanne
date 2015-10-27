package chapter5.reviewquestions.question08;

public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Herbivore{
	int amount = 10;
	public static void eatGrass(); // Won't compile - An static method requires the implementation
	//public void eatGrass(); // Will compile
	public int chew() // Won't compile - mustn't have body
	{
		return 13;
	}
}
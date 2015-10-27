package chapter5.reviewquestions.question04;

public class Question04 {
	public static void main() {
		
	}
}

class Rodent{
	//protected Integer chew() throws Exception{ // 1) Will compile with 3)
	//protected Number chew() throws Exception{ // 2) Will compile with 3)
	protected  Integer chew() throws Exception{
		System.out.println("Rodent is chewing");
		return 1;
	}
}

class Beaver extends Rodent{
	//public Integer chew() throws RuntimeException{ // 3) Will compile with 1) and 2)
	public Number chew() throws RuntimeException{ 
		System.out.println("Beaver is Chewing");
		return 2;
	}
}

// C, E

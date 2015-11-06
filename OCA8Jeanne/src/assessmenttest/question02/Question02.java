package assessmenttest.question02;

public class Question02
{
	public static void main( String[] args )
	{
		String s1 = "java";
		String s2 = "java";
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va"); // Pay attention here (upper case);
		System.out.println(s1 == s2);
		System.out.println( s1.equals( s2 ) );
		System.out.println( sb1.toString() == s1 );
		System.out.println( sb1.toString().equals(s1) ); 
		//Bonus
		String s3 = new String( "java" );
		System.out.println( s3 == s1 );		
	}
}

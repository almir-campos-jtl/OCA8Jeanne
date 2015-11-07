package assessmenttest.question12;

public class Egret
{
	private String color;
	
	public Egret()
	{
		this( "White" );
	}
	
	public Egret( String color )
	{
		color = color;
	}
	public static void main( String[] args )
	{
		Egret e = new Egret();
		System.out.println("Color: " + e.color );
		// Bonus
		Regret r = new Regret();
		System.out.println("Rcolor: " + r.color );
	}

}

// Bonus
class Regret
{
	//private String color;	// The 'private' modifier causes an error at line 22
	public String color;	// The code compiles
	
	public Regret()
	{
		this( "Blue");
	}
	
	public Regret( String color )
	{
		this.color = color;
	}
}


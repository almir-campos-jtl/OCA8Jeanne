package chapter5.reviewquestions.question19;

public class SnakeHandler
{
	private Snake snake;
	public void setSnake( Snake  snake )
	{
		this.snake = snake;
	}
	
	public static void main( String[] args )
	{
		new SnakeHandler().setSnake( new Cobra() );				// A
		new SnakeHandler().setSnake( new GardenSnake() );		// B - Doesn't compile - GardenSnake isn't a type of Snake
		new SnakeHandler().setSnake( new Snake() );				// C
		new SnakeHandler().setSnake( new Object() );			// D - Doesn't compile - Object isn't a type of Snake (Snake is a type of Object)
		//new SnakeHandler().setSnake( (Snake) new Object() );	// D - modified
		new SnakeHandler().setSnake( new String( "Snake" ) );	// E - Doesn't compile - String isn't a type of Snake
		new SnakeHandler().setSnake( null );					// F
		
	}
	
}

class Snake
{
	
}

class Cobra extends Snake
{
	
}

class GardenSnake
{
	
}


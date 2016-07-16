
import java.util.Scanner;

public class Player {

	private String name;
	private int fastestWin = Integer.MAX_VALUE;
	private int gamesCompleted = 1;
	private Scanner keyboard;
	
	//Using the keyboard field, the guess is read in from the keyboard.
	public String askForGuess()
	{
		System.out.println("Enter your guess: ");
		this.keyboard = new Scanner(System.in);
		return this.keyboard.nextLine();
		
	}
	
	//Returns the player’s name.
	public String getName()
	{
		return this.name;
	}
	
	//Returns the fastest win.
	public int getFastestWin()
	{
		return this.fastestWin;
	}
	
	//Returns the number of games completed.
	public int getGamesCompleted()
	{
		return this.gamesCompleted;
	}
	
	//Sets the player’s name.
	public void setName(String name)
	{
		this.name = name;
	}
	
	//Should be called once after finishing each game. It updates the gamesCompleted field and possibly the fastestWin field.
	public void updateStats(int numberOfMovesTakenToWin)
	{
		this.gamesCompleted++;
		if (numberOfMovesTakenToWin < this.fastestWin)
		{
			this.fastestWin = numberOfMovesTakenToWin;
		}
	}
	
}

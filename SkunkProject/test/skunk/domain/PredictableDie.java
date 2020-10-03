package skunk.domain;

public class PredictableDie 
{
	private int[] theRolls;
	private int nextInt;
	private int lastRoll;
	
	
	public PredictableDie()
	{
	
	}

	public PredictableDie(int[] is) 
	{
		this.theRolls = is; //its not static so can be accessed using this
		this.nextInt = 0;
	}

	public void roll() 
	{
		this.lastRoll = this.theRolls[this.nextInt];		
	}

	public int getLastRoll() 
	{
		return this.lastRoll;
	}

}

import java.util.Random;

public class Dice {

	int faceValue;
	
	public void roll()
	{
		Random random = new Random();
		faceValue = random.nextInt(6)+1;
	}
	
	public int getFaceValue()
	{
		return faceValue;
	}
	
	}
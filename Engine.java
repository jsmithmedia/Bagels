
import java.util.Random;

public class Engine {
	
	private int numDigits;
	private int[] secretNumber;
	private Random randomNumberGenerator;
	
	//Converts a number (as a String) to an array of integers.
	//The ordering must go from most to least significant digits. 
	//For example, if the number String is Ò732Ó then index 0 of the array should contain 7.
	public int[] convertNumToDigitArray(String number)
	{
		int[] numberArray = new int[numDigits];
		int digit = 0, numberVar = 0;
		
		numberVar = Integer.parseInt(number);
		
		for (int i = (getNumDigits() - 1); i >= 0; i--)
		{
			digit = (numberVar %10);
			numberVar = (numberVar /10);
			numberArray[i] = digit;
		}
		
		return numberArray;
	}
	
	//Returns the number of digits.
	public int getNumDigits()
	{
		return this.numDigits;
	}
	
	//Returns the secret number.
	public int[] getSecretNumber()
	{
		return this.secretNumber;
	}
	
	//Changes the secretNumber field to a random number in the range 10n-1 and 10n-1.
	public void generateNewSecret()
	{
		int lowerBound = (int) (Math.pow(10, this.numDigits -1)), upperBound = (int) (Math.pow(10, (this.numDigits)) -1);
		int secretNum, digit;
		int[] numberArray = new int[getNumDigits()];
		this.randomNumberGenerator = new Random();		
		
		while (true)
		{
			secretNum = (this.randomNumberGenerator.nextInt(upperBound));
			secretNum = secretNum + lowerBound;
			
			if (secretNum > upperBound)
			{
				secretNum -= lowerBound;
			}
			//
			//
			System.out.println("TESTING MODE, SECRET NUMBER : " + secretNum);
			//
			//
			if (secretNum < upperBound && secretNum > lowerBound)
			{
				break;
			}
		}
		
		for (int j = (getNumDigits() -1); j >= 0; j--)
		{
			digit = (secretNum %10);
			secretNum = (secretNum /10);
			numberArray[j] = digit;
		}
		
		secretNumber = numberArray;		
	}
	
	//Sets the number of digits to the input parameter.
	public  void setNumDigits(int numberOfDigits)
	{
		numDigits = numberOfDigits;
	}

}

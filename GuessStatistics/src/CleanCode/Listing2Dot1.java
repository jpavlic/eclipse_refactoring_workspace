package CleanCode;

public class Listing2Dot1
{ 
	public static void main(String [] args)
	{
		printGuessStatistics('h', 1);
	}
	
	private static void printGuessStatistics(char candidate, int count) {
		String number;
		String verb;
		String pluralModifier;
		
		if (count == 0) {
			number = "no";
			verb = "are";
			pluralModifier = "s";
		}
		else if (count == 1) {
			number = "1";
			verb = "is";
			pluralModifier = "";
		}
		else {
			number = Integer.toString(count);
			verb = "are";
			pluralModifier = "s";
		}
		
		String guessMessage = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
		
		System.out.print(guessMessage);
	}
}
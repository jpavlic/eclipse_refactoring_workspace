package CleanCode;

public class GuessStatisticsMessageOwn {
	private char candidate;
	private int count;

	public GuessStatisticsMessageOwn(char candidate, int count) {
		this.candidate = candidate;
		this.count = count;
	}	
	
	public String toString() {
		return formatMessage();
	}
	
	public void print() {
		System.out.print(formatMessage());
	}
	
	private String formatMessage() {
		return String.format("There %s %s %s%s", verb(), number(), candidate, pluralModifier());
	}

	private String verb() {
		if (isSingular())
			return "is";
		else
			return "are";
	}
	
	private String number() {
		if (areNone())
			return "no";
		else
			return Integer.toString(count);
	}
	
	private String pluralModifier() {
		if (isSingular())
			return "";
		else
			return "s";
	}
	
	private boolean isSingular() {
		return count == 1;
	}
	
	private boolean areNone() {
		return count == 0;
	}
}

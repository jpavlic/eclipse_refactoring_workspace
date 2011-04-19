package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import CleanCode.GuessStatisticsMessage;
import CleanCode.GuessStatisticsMessageOwn;

public class Listing2Dot1Test {
	@Test public void singleLetter() {
		String verb = "is";
		String number = "1";
		String candidate = "h";
		String pluralModifier = "";
		String expected = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
		GuessStatisticsMessageOwn message = new GuessStatisticsMessageOwn(candidate.charAt(0), Integer.parseInt(number));
	    assertTrue(expected.equals(message.toString()));
	    
	    GuessStatisticsMessage msg = new GuessStatisticsMessage();	    
	    assertTrue(expected.equals(msg.make(candidate.charAt(0), Integer.parseInt(number))));
	}
	
	@Test public void noLetters() {
		String verb = "are";
		String number = "no";
		String candidate = "h";
		String pluralModifier = "s";
		String expected = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
		GuessStatisticsMessageOwn message = new GuessStatisticsMessageOwn(candidate.charAt(0), 0);
	    assertTrue(expected.equals(message.toString()));
	    
	    GuessStatisticsMessage msg = new GuessStatisticsMessage();	    
	    assertTrue(expected.equals(msg.make(candidate.charAt(0), 0)));
	}
	
	@Test public void twoLetters() {
		String verb = "are";
		String number = "2";
		String candidate = "h";
		String pluralModifier = "s";
		String expected = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
		GuessStatisticsMessageOwn message = new GuessStatisticsMessageOwn(candidate.charAt(0), Integer.parseInt(number));
	    assertTrue(expected.equals(message.toString()));
	    
	    GuessStatisticsMessage msg = new GuessStatisticsMessage();	    
	    assertTrue(expected.equals(msg.make(candidate.charAt(0), Integer.parseInt(number))));
	}
}

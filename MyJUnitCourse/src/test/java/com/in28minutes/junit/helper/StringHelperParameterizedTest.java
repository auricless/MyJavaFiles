package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper strHelper = new StringHelper();
	
	private String input;
	private String expected;	
	
	public StringHelperParameterizedTest(String input, String expected) {
		super();
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String[][] expOutput = {{"AACD", "CD"}, {"ACD", "CD"}};
		
		return Arrays.asList(expOutput);
	}
	
	//AACD -> CD ACD -> CD CDEF -> CDEF CDAA -> CDAA
	@Test
	public void testTruncateAInFirst2Positions_AInFirst2Position() {
		assertEquals(expected, strHelper.truncateAInFirst2Positions(input));
	}

	@Test
	public void testTruncateAInFirst2Positions_AInFirstPosition(){
		assertEquals(expected, strHelper.truncateAInFirst2Positions(input));
	}

	//ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(strHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(strHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_TwoCharacter() {
		assertTrue(strHelper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_OneCharacter() {
		assertFalse(strHelper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
}

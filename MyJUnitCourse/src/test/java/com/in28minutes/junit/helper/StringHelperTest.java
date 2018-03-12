package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper strHelper;
	
	@Before
	public void setup() {
		strHelper = new StringHelper();
	}
	
	//AACD -> CD ACD -> CD CDEF -> CDEF CDAA -> CDAA
	@Test
	public void testTruncateAInFirst2Positions_AInFirst2Position() {
		assertEquals("CD", strHelper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AInFirstPosition(){
		assertEquals("CD", strHelper.truncateAInFirst2Positions("ACD"));
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

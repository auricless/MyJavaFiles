package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void testTruncateAInFirst2Positions_AInFirst2Position() {
		StringHelper strHelper = new StringHelper();
		//AACD -> CD ACD -> CD CDEF -> CDEF CDAA -> CDAA
		assertEquals("CD", strHelper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AInFirstPosition(){
		StringHelper strHelper = new StringHelper();
		assertEquals("CD", strHelper.truncateAInFirst2Positions("ACD"));
	}
	
}

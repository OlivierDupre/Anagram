package fr.astek.katas.anagram;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;


public class AnagramTest {

	@Test
	public void testEmptyString() {
		assertEquals(Arrays.asList(""), Anagram.of(""));
	}
	
	@Test
	public void testOneChar() {
		assertEquals(Arrays.asList("A"), Anagram.of("A"));
	}
	
	@Test
	public void testTwoChar() {
		assertEquals(Arrays.asList("AB", "BA"), Anagram.of("AB"));
	}
	
	@Test
	public void testThreeChar() {
		assertEquals(Arrays.asList("ABC", "ACB", "BAC", "BCA", "CAB", "CBA"), Anagram.of("ABC"));
	}
	
	@Test
	public void testThreeCharWith2SameChar() {
		assertEquals(Arrays.asList("AAB","ABA", "BAA"), Anagram.of("AAB"));
	}
	
	@Test
	public void testFourChar() {
		assertEquals(24, Anagram.of("ABCD").size());
	}

}

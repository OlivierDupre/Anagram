package fr.astek.katas.anagram;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class AnagramTest {

	@Test
	public void testEmptyString() {
		assertEquals(Arrays.asList(""), Anagram.of(""));
	}

}

package fr.astek.katas.anagram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {

	private static Set<String> concatSet(char c, Set<String> set) {
		Set<String> newList = new TreeSet<String>();
		for (String string : set) {
			newList.add(c + string);
		}
		return newList;
	}

	public static List<String> of(String string) {

		Set<String> result = new TreeSet<String>();

		if (string.length() <= 1) {
			result.add(string);
		} else {

			for (int i = 0; i < string.length(); i++) {
				char extractedChar = string.charAt(i);

				result.addAll(concatSet(
						extractedChar,
						new TreeSet<String>(of(string.replaceFirst("" + extractedChar, "")))));
			}
		}

		return new ArrayList<String>(result);
	}
}


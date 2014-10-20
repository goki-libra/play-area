package misc;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

	public static void main(String args[]) {
		String[] firstWords = new String[] { "ate", "iceman", "pool" };
		String[] secondWords = new String[] { "tea", "cinema", "pole" };
		check_anagrams(firstWords, secondWords);
	}

	public static void check_anagrams(String[] firstWords, String[] secondWords) {

		for (int i = 0; i < firstWords.length; i++) {
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			int res = 1;
			// compare firstWords[i] and secondWrods[i]
			if (firstWords[i].length() != secondWords[i].length()) {
				System.out.println("0");
				break;
			}
			String word1 = firstWords[i];
			for (int j = 0; j < word1.length(); j++) {
				char currentChar = word1.charAt(j);
				Integer val = map.get(currentChar);

				if (val != null) {
					val = val + 1;
					map.put(currentChar, val);

				} else {
					map.put(currentChar, 1);
				}

			}

			String word2 = secondWords[i];
			for (int k = 0; k < word2.length(); k++) {

				Integer val = map.get(word2.charAt(k));

				if (val != null) {
					val = val - 1;
					map.put(word2.charAt(k), val);

				} else {
					res = 0;
					break;
				}

			}

			if (res == 1) {
				for (Integer s : map.values()) {

					if (s != 0) {
						res = 0;
						break;
					}

				}
			}

			System.out.println(res);

		}

	}
}

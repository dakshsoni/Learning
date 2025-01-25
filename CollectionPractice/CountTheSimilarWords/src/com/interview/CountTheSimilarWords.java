package com.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.BinaryOperator;

public class CountTheSimilarWords {

	public static void main(String[] args) {

		Integer n = Integer.valueOf("0011");
		
		System.out.println(n.byteValue());
		
		

		/*
		 * String text = "hello Hello Cat tac World wrold wroold"; text =
		 * text.toLowerCase(); String[] words = text.replaceAll("[^a-zA-Z ]",
		 * "").split("\\s+");
		 * 
		 * // Use a HashMap to store the normalized (sorted) words and their frequencies
		 * Map<String, Integer> wordCount = new TreeMap<>();
		 * 
		 * for (String word : words) { // Normalize the word by sorting its characters
		 * // String sortedWord = sortString(word); wordCount.put(word,
		 * wordCount.getOrDefault(word, 0) + 1); }
		 * 
		 * // Display the results
		 * System.out.println("Word Frequency (grouped by similarity):"); for
		 * (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
		 * System.out.println(entry.getKey() + ": " + entry.getValue()); }
		 */
	}

	// Helper method to sort characters in a string alphabetically
	public static String sortString(String word) {

		char[] chars = word.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

}

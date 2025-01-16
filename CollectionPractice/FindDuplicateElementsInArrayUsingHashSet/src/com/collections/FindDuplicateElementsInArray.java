package com.collections;

import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 3, 6, 2 };

		HashSet<Integer> hashSet = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();
		
		for(int a : numbers) {
			
			if(!hashSet.add(a)) {
				duplicates.add(a);
			}
			
		}
		
		System.out.println(duplicates);
	}
}

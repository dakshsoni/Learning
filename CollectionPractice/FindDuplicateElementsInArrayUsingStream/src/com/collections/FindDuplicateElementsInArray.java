package com.collections;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 3, 6, 2 };

		Map<Integer, Long> map = IntStream.of(numbers).mapToObj(p -> p)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
	}
}

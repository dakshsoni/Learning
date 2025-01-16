package com.collections;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatingCharcter {

	public static void main(String[] args) {

		String input = "swiss";

		char ch[] = input.toCharArray();
		Map<Character, List<Character>> map = input.chars().mapToObj(p -> (char) p)
				.collect(Collectors.groupingBy(Function.identity()));
		
		for(int i =0; i< ch.length;i++) {
			
			if(map.get(ch[i]).size() == 1) {
				
				
				System.out.println(ch[i]);
				break;
			}
		}

	}

}

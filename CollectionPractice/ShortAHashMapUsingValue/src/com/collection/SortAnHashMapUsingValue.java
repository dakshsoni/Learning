package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortAnHashMapUsingValue {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Apple", 3);
		map.put("Banana", 1);
		map.put("Orange", 2);
		Map<String, Integer> map1 = new LinkedHashMap<>();
		Map<Integer, String> tree = new TreeMap<>();

		for (Map.Entry<String, Integer> t : map.entrySet()) {

			tree.put(t.getValue(), t.getKey());

		}

		for (Map.Entry<Integer, String> t : tree.entrySet()) {

			map1.put(t.getValue(), t.getKey());

		}
		
		System.out.println(map);
		System.out.println(map1);

	}

}

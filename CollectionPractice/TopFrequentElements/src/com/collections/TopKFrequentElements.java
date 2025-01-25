package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;

		// using HashMap and PriorityQueue
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int num : nums) {

			if (hashMap.putIfAbsent(num, 1) != null) {

				hashMap.put(num, (hashMap.get(num) + 1));
			}
		}

		PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(
				((o1, o2) -> o2.getValue() - o1.getValue()));

		int i = 0;
		for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
			i++;

			if (i <= k) {

				priorityQueue.add(map);
			}

		}

		System.out.println(priorityQueue);

	}

}

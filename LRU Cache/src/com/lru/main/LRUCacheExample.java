package com.lru.main;

import java.util.LinkedHashMap;
import java.lang.*;
import java.lang.ref.WeakReference;


public class LRUCacheExample<String, Integer> extends LinkedHashMap<String, Integer>{
	
	
	private int capacity;

	public LRUCacheExample(int capacity) {
		super(capacity, 0.5f, true);
		this.capacity = capacity;
	} 
	
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<String, Integer> eldest) {
		
		System.out.println("removeEldestEntry : " + (size() > capacity));
		return size() > capacity;
	}
	
	
	public static void main(java.lang.String[] args) {
		
		LRUCacheExample<java.lang.String, java.lang.Integer> lruCacheExample = new LRUCacheExample<>(3);
		lruCacheExample.put("RAM", 40);
		lruCacheExample.put("John", 90);
		lruCacheExample.put("RAM", 60);
		lruCacheExample.get("John");
		lruCacheExample.put("Rohit", 45);
		lruCacheExample.put("Virat", 60);
		
		
		System.out.println(lruCacheExample);
		
	}
	
	
	
	
	

}

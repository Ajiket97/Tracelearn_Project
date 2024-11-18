package com.selenimum;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashTable {
	public static void m1() {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "Ajit");
		map.put(15, "Ajiket");
		map.put(85, "Shri");
		map.put(7, "nayam");
		map.put(5, null);

		// map.forEach((k,v)->System.out.println(k+" "+v));
		for (int keyy : map.keySet()) {
			System.out.println(keyy + " " + map.get(keyy));
		}

	}

	public static void main(String[] args) {
		m1();
	}

}

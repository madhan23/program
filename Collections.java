package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class ComparartorLogic implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return o2.compareTo(o1);
	}

}



public class Collections {

	public static void main(String[] args) {
		
		
		

		int arr[] = { -3, -1, 6, 2, -2, 5 };

		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();

		System.out.println("MIN" + min);
		System.out.println("MAX" + max);
		System.out.println("SUM" + Arrays.stream(arr).sum());
		
		

		
		// TODO Auto-generated method stub
		List<Integer> val = new ArrayList<>();
		val.add(1);
		val.add(2);
		val.add(3);
		val.add(1);
		val.add(2);
		val.add(3);
		System.out.println(val);
//java.util.Collections.reverse(val);
		System.out.println(val);

		Set<Integer> set = new TreeSet<>(new ComparartorLogic());
		set.addAll(val);
		System.out.println(set);

		Comparator<String> ComparartorLogic1 = (String o1,  String o2) -> o2.compareTo(o1);
				
				
		Map<String, Integer> words = new TreeMap<>(ComparartorLogic1);
		words.put("b", 5);
		words.put("d", 8);
		words.put("a", 2);
		words.put("c", 1);
		System.out.println(words);

		String maxKey = words.entrySet().stream().min((val1, val2) -> val1.getValue().compareTo(val2.getValue())).get()
				.getKey();
		System.out.println(maxKey);
	}

}

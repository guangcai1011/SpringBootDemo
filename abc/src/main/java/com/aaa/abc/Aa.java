package com.aaa.abc;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aa {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		List<String> strList = numList.stream().map(it -> Integer.toString(it)).collect(Collectors.toList());
		strList.forEach(s -> System.out.print(s));
	}


	
}
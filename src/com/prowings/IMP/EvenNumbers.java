package com.prowings.IMP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of integers, find out all the even numbers exist in the list using Stream functions?

public class EvenNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> evenNumbers = findEvenNumbers(numbers);
		
		System.out.println(" Even Number List is :- " + evenNumbers);
	}

	public static List<Integer> findEvenNumbers(List<Integer> numbers) {

		return numbers.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
	}
}

package com.prowings.IMP;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 3, 4, 1, 2);

		List<Integer> duplicates = findDuplicates(numbers);

		System.out.println("Printed Finded Duplicate list is : " + duplicates);
	}

	public static List<Integer> findDuplicates(List<Integer> numbers) {

		Map<Integer, Long> countMap = numbers.stream()

				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return countMap.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());
	}
}
package com.prowings.IMP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions?

public class NumbersStartingWithOne {

	 public static void main(String[] args) {
		 
	        List<Integer> numbers = Arrays.asList(123, 456, 178, 102, 199, 867, 192, 1001);

	        List<Integer> numbersStartingWithOne = findNumbersStartingWithOne(numbers);

	        System.out.println("This is Print Numbers Starting With One :- " + numbersStartingWithOne);
	    }

	public static List<Integer> findNumbersStartingWithOne(List<Integer> numbers) {

		return numbers.stream().filter(n ->String.valueOf(n).startsWith("1"))
				      .collect(Collectors.toList());
		
		 
	}
	
}

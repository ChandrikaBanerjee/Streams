package com.capgemini.Stream3;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.Stream2.performOperation;

public class performListIntegersTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		// Adding integers to an arraylist
		for (int i = 1; i < 1000; i++) {
			list.add(i);

		}
		// Displaying all the elements of the list
		System.out.println("Displaying all the elements of the list");
		list.stream().forEach(System.out::println);
		// Displaying all the odd elements of the list
		System.out.println("Odd Numbers in the range of 1-1000 : ");
		list.stream().filter(performListOfIntegers.isOdd()).forEach(System.out::println);
		// Displaying all the even elements of the list
		System.out.println("Even Numbers in the range of 1-1000 : ");
		list.stream().filter(performListOfIntegers.isEven()).forEach(System.out::println);
		// Displaying all the elements of the list divisible by 6
		System.out.println("Numbers divisible by 6 in the range of 1-1000 : ");
		list.stream().filter(performListOfIntegers.isDivisibleBy6()).forEach(System.out::println);
		// Displaying all the elements of the list less than 12
		System.out.println(" Numbers less than 12 in the range of 1-1000 : ");
		list.stream().filter(performListOfIntegers.isLessThan12()).forEach(System.out::println);
		// Displaying all the elements of the list greater than 50
		System.out.println(" Numbers greater than 50 in the range of 1-1000 : ");
		list.stream().filter(performListOfIntegers.isGreaterThan50()).forEach(System.out::println);
	}

}

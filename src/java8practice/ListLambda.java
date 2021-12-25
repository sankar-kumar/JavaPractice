package java8practice;

import java.util.Arrays;
import java.util.List;

public class ListLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Iterating over List using Lambda expressions
		List<String> fruits = Arrays.asList("Apple", "grapes", "Orange", "mango");
		// Without Lambda Expression
		/*
		 * for (String fruit : fruits) { System.out.println(fruit); }
		 */
		// With Lambda Expression:
		fruits.forEach(n -> System.out.println(n));

	}

}

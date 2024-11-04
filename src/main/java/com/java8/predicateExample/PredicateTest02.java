package com.java8.predicateExample;

import java.util.function.Predicate;

public class PredicateTest02 {

	public static void main(String[] args) {
		
		Predicate<String> p=I->I.length()>10;
		System.out.println(p.test("sachin"));
		System.out.println(p.test("sachin kumar sharma"));
	}
	
}
